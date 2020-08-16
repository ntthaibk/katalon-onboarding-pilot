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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

String ExpectedValue = 'Frank'
String ExpectedEmailValue = ''
String ExpectedLastNameValue = ''
String findEmailValue = 'jsmith@gmail.com'

WebUI.openBrowser(GlobalVariable.url)

not_run: WebUI.waitForPageLoad(9)

WebUI.click(findTestObject('Page_The Internet/a_Sortable Data Tables'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath("//table[@id='table1']/tbody"))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

table: for (int i = 0; i < Rows.size(); i++) {
	
   'To locate columns(cells) of that specific row'
	
   List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))
	
   for (int j = 0; j < Cols.size(); j++) {
	
   'Verifying the expected text in the each cell'
	
   if (Cols.get(j).getText().equalsIgnoreCase(ExpectedValue)) {
	
   'To locate anchor in the expected value matched row to perform action'
	
   ExpectedEmailValue = Cols.get(j + 1).getText()
 
   	}
   
   if (Cols.get(j).getText().equalsIgnoreCase(findEmailValue)) {
	   
	  'To locate anchor in the expected value matched row to perform action'
	   
	  ExpectedLastNameValue = Cols.get(j - 2).getText()
	
		  }
   
   }
 }

println('Expected email:' + ExpectedEmailValue)
println('Expected last name:' + ExpectedLastNameValue)
   
   
  
