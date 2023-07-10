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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:4200/login')

WebUI.setText(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/input_Email id_email'), 
    'test@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/input_Forgot Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/input_Forgot Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/button_Create capabilities'))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/div_Data designerPrepare structured dataset_1409f7'))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/button_New upload'))

WebUI.uploadFile(findTestObject('Upload/UploadObject/Uploadfile'), 'addition pdf')

WebUI.waitForElementPresent(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/div_Addition_1.pdf'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/body_1Upload file2Create template3Apply tem_77aec7'))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Data designer - able to upload a pdf file/Page_React App/img_Upload file_img-fluid cursor-pointer'))

