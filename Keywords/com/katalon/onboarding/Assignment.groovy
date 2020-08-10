package com.katalon.onboarding

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.commons.lang.time.DateUtils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

//baiTap1: Write a function to add 2 numbers
public class Assignment1 {
	def static addNumber(def a, def b){
		return a+b
	}
}

//baiTap2: Solving this Quadratics Equation
public class Assignment2 {
	
	public static void QuadraticEquationSolve(float a, float b, float c) {
		//check if a = 0 or b = 0
		if (a == 0) {
			if (b == 0) {
				println("No root found");
			} else {
				println("There is 1 root: "
						+ "x = " + (-c / b));
			}
			return;
		}
		
		//calculate delta
		def float d = b*b - 4*a*c;
		
		//solve when a & b <> 0 to find root 1 & 2
		float x1;
		float x2;
		if (d > 0) {
			x1 = (float) ((-b + Math.sqrt(d)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(d)) / (2*a));
			println("There are 2 roots: "
					+ "x1 = " + x1 + " và x2 = " + x2);
		} else if (d == 0) {
			x1 = (-b / (2 * a));
			println("There are 2 roots as 1: "
					+ "x1 = x2 = " + x1);
		} else {
			println("No root found");
		}
	}
}

//baiTap3: Adding 2 Strings together
public class Assignment3 {
	def static addString(String a, String b){
	return a + " " + b
	}
}

//baiTap4: Giving a string and getting a part out of the string
public class Assignment4 {
	
	public static void getString(String a, String b){
		println("Your input string is: " + a)
		println("Your output string is: " + b)
		if (a.contains(b)){
			println("Yeah, your output string found:" + b)
		} else{
			println("we cannot find " + b + " in given string " + a)
		}
	}
}

//baiTap5: Add & subtract 1 day from today
public class Assignment5 {
	public static void CalDate(){
		//Today
		def currentDate = new Date().format("MM/dd/yyyy")
		println("Today = " + currentDate)
		//Today + 1
		def addingOne = new Date().plus (1)
		println("Adding = " + addingOne.format("MM/dd/yyyy"))
		//Today - 1
		def subtractOne = new Date().plus (-1)
		println("Subtracting = " + subtractOne.format("MM/dd/yyyy"))
	}	
}

//baiTap6: Add "Anh" to given list
public class Assignment6 {
	public static void addAnhToList{
		def List<String> givenList = [Uy, Dung, Hai, Vu]
		for(givenList ->)
		{
			
			print
		}
	}
}



 



