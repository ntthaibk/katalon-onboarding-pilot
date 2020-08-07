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



// BAI 2

def a

def b

def c

def x1

def x2

def QuaEquation(a,b,c){
	def delta = b*b-4*a*c
	if (delta<0){
		println "Pt co nghiem ao"
	}
	else
		if (delta==0){
			x1=(-b)/(2*a)
			println "Pt co nghiem kep x1 = x2 = " + x1
		}
		else {
				x1 =(-b-Math.sqrt(delta))/(2*a)
				x2=(-b+Math.sqrt(delta))/(2*a)
				println "Pt co nghiem x1 = " + x1
				println "Pt co nghiem x2 = " + x2
		}
		}

def m=QuaEquation(5,6,1)

println m

def n=QuaEquation(1,1,1)

println n

def p=QuaEquation(1,-4,4)

println p




