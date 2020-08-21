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

/* Cach-1: Send Key ARROW_RIGHT & ARROW_LEFT)
//move the slider to 1.5
println('move the slider to 1.5')
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.delay(5)
//move the slider to 4
println('move the slider to 4')
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.delay(5)
//move the slider to 5
println('move the slider to 5')
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_RIGHT))
WebUI.delay(5)
//move the slider back to 3
println('move the slider back to 3')
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.delay(5)
//move the slider back to 0
println('move the slider back to 0')
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.sendKeys(findTestObject('Object Repository/Page_The Internet/horizontalSlider'), Keys.chord(Keys.ARROW_LEFT))
WebUI.delay(5)
*/

//Cach-2: SetSlider
