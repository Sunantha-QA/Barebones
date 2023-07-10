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

WebUI.click(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/button_Understand your data'))

WebUI.click(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/p_Single dataset will be used here'))

WebUI.click(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/button_New upload'))

WebUI.uploadFile(findTestObject('Upload/UploadObject/Uploadfile'), emptycsv)

WebUI.verifyElementText(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/p_File is empty. Please select a valid CSV _9eda65'), 
    'File is empty. Please select a valid CSV file and try again')

WebUI.click(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/button_Okay'))

WebUI.click(findTestObject('Object Repository/UYD - Empty dataset/Page_React App/img_Upload dataset_img-fluid cursor-pointer'))

