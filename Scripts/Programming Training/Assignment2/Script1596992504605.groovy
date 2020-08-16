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

def QE(a,b,c){
	def delta = b*b-4*a*c
	
	if(delta > 0){
		println "Phuong trinh co nghiem x1 = " + (-b-Math.sqrt(delta))/(2*a)
		println "Phuong trinh co nghiem x2 = " + (-b+Math.sqrt(delta))/(2*a)
	}	
		else{	
			if (delta == 0){
			
			println "Phuong trinh co 1 nghiem kep x = " + (-b/(2*a))
			}
			else{
			println "Phuong trinh co nghiem ao"
			}
		}
}

println QE(5,6,1)

println QE(1,-6,9)

println QE(1,1,1)
