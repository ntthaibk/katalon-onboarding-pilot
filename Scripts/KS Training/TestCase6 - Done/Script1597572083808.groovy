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

WebUI.click(findTestObject('Page_The Internet/a_Horizontal Slider'))

WebUI.focus(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'))

not_run: WebUI.modifyObjectProperty(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), 'value', 'equals', 
    '1.5', true)

for (def index : (0..2)) {
    WebUI.sendKeys(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), Keys.chord(Keys.ARROW_RIGHT))
}

WebUI.verifyElementAttributeValue(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), 'value', '1.5', 0)

for (def index : (0..4)) {
    WebUI.sendKeys(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), Keys.chord(Keys.ARROW_RIGHT))
}

WebUI.verifyElementAttributeValue(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), 'value', '4', 0)

for (def index : (0..1)) {
    WebUI.sendKeys(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), Keys.chord(Keys.ARROW_RIGHT))
}

WebUI.verifyElementAttributeValue(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), 'value', '5', 0)

for (def index : (0..3)) {
    WebUI.sendKeys(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), Keys.chord(Keys.ARROW_LEFT))
}

WebUI.verifyElementAttributeValue(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), 'value', '3', 0)

for (def index : (0..5)) {
    WebUI.sendKeys(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), Keys.chord(Keys.ARROW_LEFT))
}

WebUI.verifyElementAttributeValue(findTestObject('Page_The Internet/Page_HorizontalSlider/slider'), 'value', '0', 0)

WebUI.closeBrowser()

