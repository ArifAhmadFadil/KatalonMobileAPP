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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\e90112af-f6c6-43d9-b923-fc48edb9d334.apk', true)

Mobile.tap(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.view.View_(continu)'), 0)

Mobile.tap(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.widget.EditText_(email)'), 15)

Mobile.setText(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.widget.EditText_(email)'), 'nav54867@gmail.com', 
    0)

Mobile.tap(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.widget.EditText_(pass)'), 15)

Mobile.setText(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.widget.EditText_(pass)'), '12345678', 
    0)

Mobile.tap(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.view.View_(login)'), 15)

Mobile.tap(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.view.View_(owner)'), 15)

Mobile.tap(findTestObject('Mobile_APP_Invoice/USER/Login/1.1_Login_Success/android.view.View_(select)'), 15)

Mobile.tap(findTestObject('Mobile_APP_Invoice/SETTINGS/Company Profile/android.widget.ImageView_(setting)'), 15)

Mobile.tap(findTestObject('Mobile_APP_Invoice/SETTINGS/Company Profile/android.widget.ImageView_(company)'), 15)

Mobile.scrollToText('OKELAH', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile_APP_Invoice/SETTINGS/Company Profile/android.widget.EditText_(terms)'), 15)

WebUI.setText(findTestObject('Mobile_APP_Invoice/SETTINGS/Company Profile/android.widget.EditText_(terms)'), 'ALAKALAKALA')

