import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

not_run: WebUI.waitForPageLoad(9)

WebUI.click(findTestObject('Page_The Internet/a_File Upload'))

not_run: WebUI.uploadFileWithDragAndDrop(findTestObject('Page_The Internet/Page_FileUploader/div_File Uploader_drag-drop-upload'), 
    '/Users/nhihptran/Desktop/CollectorList.xlsx', FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Page_The Internet/Page_FileUploader/input_File Uploader_file'), '/Users/nhihptran/Desktop/CollectorList.xlsx')

WebUI.waitForElementClickable(findTestObject('Page_The Internet/Page_FileUploader/input_File Uploader_file-submit'), 5)

WebUI.click(findTestObject('Page_The Internet/Page_FileUploader/input_File Uploader_file-submit'))

WebUI.verifyTextPresent('File Uploaded!', false, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

