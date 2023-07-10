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

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Understand your data'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/ul_Single datasetSingle dataset will be used here'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Next'))

WebUI.click(findTestObject('Page_React App/button_New upload'))

WebUI.uploadFile(findTestObject('Upload/UploadObject/Uploadfile'), numericaldataset)

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Proceed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/div_S.NOXYADD XYABSUBTRACTION ABCDMULTIPLY _ac72e3'))

WebUI.click(findTestObject('UYD - numerical dataset in batch mode/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/p_This experiment type will help to predict_150dea'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/p_Run data relationship analysis on all the_9cf5fa'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Confirm and run experiment'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_View Summary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/div_Select multiple target features  export_89b122'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_Okay'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/img_Loading results_float-right down-arrow'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/div_Loading results'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/img_Loading results_float-right down-arrow'))

WebUI.waitForElementClickable(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_View report'), 
    0)

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/div_S.NOTARGET COLUMN NAMEMODEL RATINGSUPPO_10b8d1'))

WebUI.verifyElementText(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/td_Exceptional'), 
    'Exceptional')

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/img_Loading results_float-right'))

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/a_2'))

WebUI.verifyElementText(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/td_Exceptional'), 
    'Exceptional')

WebUI.click(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/button_View report'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UYD - numerical dataset in batch mode/Page_React App/svg_00.450.91.351.8feadd_xyysubtraction_ab'), 
    0)

