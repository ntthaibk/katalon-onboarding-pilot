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

WebUI.openBrowser('https://the-internet.herokuapp.com/horizontal_slider')

WebUI.sendKeys(findTestObject('Page_The Internet/Page_The Internet/Slider'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, 
        Keys.ARROW_RIGHT))

WebUI.verifyTextPresent('1.5', false)

WebUI.sendKeys(findTestObject('Page_The Internet/Page_The Internet/Slider'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT,
	Keys.ARROW_RIGHT,Keys.ARROW_RIGHT, Keys.ARROW_RIGHT))

WebUI.verifyTextPresent('4', false)

WebUI.sendKeys(findTestObject('Page_The Internet/Page_The Internet/Slider'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT))

WebUI.verifyTextPresent('5', false)

WebUI.sendKeys(findTestObject('Page_The Internet/Page_The Internet/Slider'), Keys.chord(Keys.ARROW_LEFT, Keys.ARROW_LEFT,
	Keys.ARROW_LEFT, Keys.ARROW_LEFT))

WebUI.verifyTextPresent('3', false)

WebUI.sendKeys(findTestObject('Page_The Internet/Page_The Internet/Slider'), Keys.chord(Keys.ARROW_LEFT, Keys.ARROW_LEFT,
	Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT))

WebUI.verifyTextPresent('0', false)









