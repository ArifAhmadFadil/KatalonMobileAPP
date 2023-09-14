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

Mobile.startApplication('C:\\Users\\LENOVO\\Documents\\MOBILE AUTOMATIONS\\app.apk', true)

Mobile.tap(findTestObject('MOBILE/USER/login/btn_countinue'), 0)

Mobile.tap(findTestObject('Object Repository/MOBILE/USER/login/btn_mybeleter'), 0)

Mobile.tap(findTestObject('Object Repository/MOBILE/USER/login/btn_txt_email'), 0)

Mobile.setText(findTestObject('Object Repository/MOBILE/USER/login/txt_email'), 'fsama03@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/MOBILE/USER/login/btn_txt_password'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/MOBILE/USER/login/txt_password'), 'RigbBhfdqOBGNlJIWM1ClA==', 
    0)

Mobile.tap(findTestObject('MOBILE/USER/login/btn_login'), 0)

Mobile.tap(findTestObject('MOBILE/USER/user-wizard/btn_txt_frist_name'), 0)

Mobile.setText(findTestObject('Object Repository/MOBILE/USER/user-wizard/txt_frist_name'), 'Fadil', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MOBILE/USER/user-wizard/btn_txt_last_name'), 0)

Mobile.setText(findTestObject('MOBILE/USER/user-wizard/txt_last_name'), 'Amr', 0)

Mobile.tap(findTestObject('MOBILE/USER/user-wizard/btn_next'), 0)

Mobile.tap(findTestObject('MOBILE/USER/user-wizard/txt_company'), 0)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (3)'), 'adres', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (4)'), 'wah', 0)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (5)'), 'lokoo', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (6)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (6)'), 'sfasdasd', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (7)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (7)'), 'wedsadsad', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (8)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (8)'), '4848132195', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.ImageView'), '856646884565', 0)

Mobile.closeApplication()

