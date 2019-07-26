import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1366, 623)

WebUI.getViewportHeight()

WebUI.getViewportWidth()

WebUI.navigateToUrl('https://dev.sehatq.com/')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/New Folder/button_Login  Daftar Baru'))

WebUI.setText(findTestObject('Object Repository/New Folder/input_Alamat E-Mail_email'), 'kuning@color.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder/input_Kata Sandi_password'), 'VU1orW/zbPOwxjV+uFYKbg==')

WebUI.click(findTestObject('Object Repository/New Folder/button_Masuk'))

WebUI.delay(1)

WebUI.closeBrowser()

