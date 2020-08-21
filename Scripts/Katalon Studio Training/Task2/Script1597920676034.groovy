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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.katalon.onboarding.DragAndDropHelper as DragAndDropHelper

WebUI.openBrowser('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Page_The Internet/a_Drag and Drop'))

DragAndDropHelper.dragAndDrop(findTestObject('Object Repository/Page_The Internet/div_A'), findTestObject('Object Repository/Page_The Internet/div_B'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_The Internet/div_B'), 'id', 'column-a', 5, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

