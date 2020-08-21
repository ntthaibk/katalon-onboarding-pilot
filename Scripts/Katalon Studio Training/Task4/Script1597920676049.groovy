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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.testobject.ConditionType


WebUI.openBrowser('https://the-internet.herokuapp.com/iframe')

/*
def x = 1

for (i = 1; i <= 5; i++){
	def data = findTestData('InputData').getValue(1, i)
	WebUI.setText(findTestObject('null', ['line': x]), data)
	WebUI.sendKeys(findTestObject('null', ['line': x]), Keys.chord(Keys.ENTER))
	x = x + 1
	WebUI.sendKeys(findTestObject('null', ['line': x]), Keys.chord(Keys.ENTER))
}
*/

/*
def data1 = findTestData('InputData').getValue(1, 1)
WebUI.setText(findTestObject('Page_The Internet/if_l1', ['line': 1]), data1)
WebUI.sendKeys(findTestObject('Page_The Internet/if_l1', ['line': 1]), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('null', ['line': 2]), Keys.chord(Keys.ENTER))


def data2 = findTestData('InputData').getValue(1, 2)
WebUI.setText(findTestObject('Page_The Internet/if_l1', ['line': 2]), data2)
WebUI.sendKeys(findTestObject('Page_The Internet/if_l1', ['line': 2]), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('null', ['line': 3]), Keys.chord(Keys.ENTER))
*/

def data = findTestData('InputData').getValue(1, 1)
WebUI.setText(findTestObject('Page_The Internet/if_l1'), data + "\n")
WebUI.sendKeys(findTestObject('Page_The Internet/if_l1'), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('Page_The Internet/if_l1'), Keys.chord(Keys.ENTER))

data = findTestData('InputData').getValue(1, 5)
WebUI.setText(findTestObject('Page_The Internet/if_l2'), data + "\n")
WebUI.sendKeys(findTestObject('Page_The Internet/if_l2'), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('Page_The Internet/if_l2'), Keys.chord(Keys.ENTER))

data = findTestData('InputData').getValue(1, 4)
WebUI.setText(findTestObject('Page_The Internet/if_l3'), data + "\n")
WebUI.sendKeys(findTestObject('Page_The Internet/if_l3'), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('Page_The Internet/if_l1'), Keys.chord(Keys.ENTER))

data = findTestData('InputData').getValue(1, 3)
WebUI.setText(findTestObject('Page_The Internet/if_l4'), data + "\n")
WebUI.sendKeys(findTestObject('Page_The Internet/if_l4'), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('Page_The Internet/if_l1'), Keys.chord(Keys.ENTER))

data = findTestData('InputData').getValue(1, 2)
WebUI.setText(findTestObject('Page_The Internet/if_l5'), data + "\n")
//WebUI.sendKeys(findTestObject('Page_The Internet/if_l4'), Keys.chord(Keys.ENTER))