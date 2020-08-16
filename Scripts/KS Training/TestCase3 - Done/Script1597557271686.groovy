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

WebUI.openBrowser(GlobalVariable.url)

not_run: WebUI.waitForPageLoad(9)

WebUI.click(findTestObject('Page_The Internet/a_Dropdown'))

WebUI.click(findTestObject('Page_The Internet/Page_Dropdown/select_Please select an option    Option 1    Option 2'))

WebUI.selectOptionByLabel(findTestObject('Page_The Internet/Page_Dropdown/select_Please select an option    Option 1    Option 2'), 'Option 2', 
    false)

not_run: WebUI.click(findTestObject(null))

WebUI.verifyOptionSelectedByLabel(findTestObject('Page_The Internet/Page_Dropdown/select_Please select an option    Option 1    Option 2'), 
    'Option 2', false, 0)

WebUI.closeBrowser()

