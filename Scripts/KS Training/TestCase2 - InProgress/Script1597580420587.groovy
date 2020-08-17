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

WebUI.openBrowser('https://the-internet.herokuapp.com/')

WebUI.maximizeWindow()

not_run: WebUI.waitForPageLoad(9)

WebUI.click(findTestObject('Page_The Internet/a_Drag and Drop'))

WebUI.focus(findTestObject('Page_The Internet/Page_DragandDrop/div_A'))

WebUI.waitForElementVisible(findTestObject('Page_The Internet/Page_DragandDrop/div_A'), 5)

WebUI.waitForElementVisible(findTestObject('Page_The Internet/Page_DragandDrop/div_B'), 5)

WebUI.dragAndDropToObject(findTestObject('Page_The Internet/Page_DragandDrop/div_A'), findTestObject('Page_The Internet/Page_DragandDrop/div_B'))

WebUI.dragAndDropByOffset(findTestObject('Page_The Internet/Page_DragandDrop/div_A'), 330, 0)

not_run: WebUI.click(findTestObject('Page_The Internet/Page_DragandDrop/div_B'))

not_run: WebUI.enableSmartWait()

not_run: WebUI.enhancedClick(findTestObject('Page_The Internet/Page_DragandDrop/div_A'))

not_run: WebUI.mouseOver(findTestObject('Page_The Internet/Page_DragandDrop/div_A'))

not_run: WebUI.verifyElementText(findTestObject('Page_The Internet/Page_DragandDrop/div_A'), 'B')

not_run: WebUI.verifyElementAttributeValue(findTestObject('Page_The Internet/Page_DragandDrop/header_A'), 'text', 'A', 0)

not_run: WebUI.closeBrowser()

