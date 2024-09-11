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

WebUI.callTestCase(findTestCase('TotalPlay-Food/TC_1_Login_Service'), [:], FailureHandling.STOP_ON_FAILURE)

FoodSCP = WS.sendRequest(findTestObject('TotalPlay-Food/Food SCP'))

WS.verifyResponseStatusCode(FoodSCP, 200)
id= 'id'
name = 'name'
c_result = 'c_result'
c_result_stores = 'c_result.stores'
c_result_stores_ID = 'c_result.stores[0].ID'
c_result_stores_name = 'c_result.stores[0].name'
c_result_stores_corporateName = 'c_result.stores[0].corporateName'
c_result_stores_corporateColorCode = 'c_result.stores[0].corporateColorCode'
c_result_stores_image = 'c_result.stores[0].image'
c_result_stores_ondemandEDD = 'c_result.stores[0].ondemandEDD'
c_result_stores_promotionalBannerImage = 'c_result.stores[0].promotionalBannerImage'
c_result_stores_link = 'c_result.stores[0].link'
c_result_stores_storeOpen = 'c_result.stores[0].storeOpen'

c_result_stores_isStoreActive = 'c_result.stores[0].isStoreActive'
c_result_stores_todayOpenHrs_time = 'c_result.stores[0].todayOpenHrs.time'
c_result_stores_todayOpenHrs_time_openingTime = 'c_result.stores[0].todayOpenHrs.time[0].openingTime'
c_result_stores_todayOpenHrs_time_closingTime = 'c_result.stores[0].todayOpenHrs.time[0].closingTime'
c_result_stores_todayOpenHrs_closed = 'c_result.stores[0].todayOpenHrs.closed'
c_result_stores_todayOpenHrs_day = 'c_result.stores[0].todayOpenHrs.day'

c_result_stores_linkType = 'c_result.stores[0].linkType'
c_result_pageDetails = 'c_result.pageDetails'
c_result_pageDetails_pagesCount = 'c_result.pageDetails.pagesCount'
c_result_pageDetails_storesPerPage = 'c_result.pageDetails.storesPerPage'
c_result_pageDetails_currentPage = 'c_result.pageDetails.currentPage'
c_result_stores_count = 'c_result.stores_count'
c_result_overall_stores_count = 'c_result.overall_stores_count'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, id )


CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_corporateName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_corporateName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_corporateColorCode)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_image)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP,c_result_stores_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_ondemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_ondemandEDD)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_promotionalBannerImage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_promotionalBannerImage)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_link)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSCP, c_result_stores_storeOpen)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_stores_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_pageDetails)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSCP, c_result_pageDetails_pagesCount)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSCP, c_result_pageDetails_storesPerPage)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_pageDetails_currentPage)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSCP, c_result_pageDetails_currentPage)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSCP, c_result_overall_stores_count)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSCP, c_result_stores_count)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_todayOpenHrs_time)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_todayOpenHrs_time_openingTime)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_todayOpenHrs_time_closingTime)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSCP, c_result_stores_todayOpenHrs_closed)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSCP, c_result_stores_todayOpenHrs_day)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSCP, c_result_stores_isStoreActive)