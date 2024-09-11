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

FoodPLP = WS.sendRequest(findTestObject('TotalPlay-Food/Food PLP', [('URL') : GlobalVariable.URL]))
CustomKeywords.'totalplay.Common.printResponseinText'(FoodPLP)

WS.verifyResponseStatusCode(FoodPLP, 200)

action = 'action'

queryString = 'queryString'

locale = 'locale'

pageTitle = 'pageTitle'

pageId = 'pageId'

pageTypeId = 'pageTypeId'

components = 'components'

components_componentTypeId = 'components[0].componentTypeId'

components_componentType = 'components[0].componentType'

components_storeData = 'components[1].storeData'

components_storeData_ID = 'components[1].storeData.ID'

components_storeData_name = 'components[1].storeData.name'

components_storeData_phone = 'components[1].storeData.phone'

components_storeData_address = 'components[1].storeData.address'

components_storeData_postalCode = 'components[1].storeData.postalCode'

components_storeData_logo = 'components[1].storeData.logo'

components_storeData_city = 'components[1].storeData.city'

components_storeData_banner = 'components[1].storeData.banner'

components_storeData_image = 'components[1].storeData.image'

components_storeData_latitude = 'components[1].storeData.latitude'

components_storeData_longitude = 'components[1].storeData.longitude'

components_storeData_verticalsAvailable = 'components[1].storeData.verticalsAvailable'

components_storeData_OndemandEDD = 'components[1].storeData.OndemandEDD'

components_storeData_link = 'components[1].storeData.link'

components_storeData_MultistoreEDD = 'components[1].storeData.MultistoreEDD'

components_storeData_linkType = 'components[1].storeData.linkType'

components_storeData_grade = 'components[1].storeData.grade'

components_storeData_open = 'components[1].storeData.open'

components_storeData_evaluationsCount = 'components[1].storeData.evaluationsCount'

components_storeData_openHours = 'components[1].storeData.openHours'

components_storeData_openHours_time = 'components[1].storeData.openHours[0].time'

components_storeData_openHours_time_openingTime = 'components[1].storeData.openHours[0].time[0].openingTime'

components_storeData_openHours_time_closingTime = 'components[1].storeData.openHours[0].time[0].closingTime'

components_storeData_openHours_day = 'components[1].storeData.openHours[0].day'

components_storeData_shipmentCost = 'components[1].storeData.shipmentCost'

components_storeData_shipmentCost_currency = 'components[1].storeData.shipmentCost.currency'

components_storeData_shipmentCost_formatted = 'components[1].storeData.shipmentCost.formatted'

components_storeData_storeType = 'components[1].storeData.storeType'

components__storeData_ratings = 'components[1].storeData.ratings'

components_storeData_corporateColorCode = 'components[1].storeData.corporateColorCode'

components_storeData_grantiasDeLaTienda = 'components[1].storeData.grantiasDeLaTienda'

components_storeData_tarifaDeEntrega = 'components[1].storeData.tarifaDeEntrega'

components_storeData_politicaDePrecios = 'components[1].storeData.politicaDePrecios'

components_storeData_ageShowWarningModel = 'components[1].storeData.ageShowWarningModel'

components_componentAssets = 'components[2].componentAssets[0]'

components_componentAssets_componentTypeId = 'components[2].componentAssets[0].componentTypeId'

components_componentAssets_link = 'components[2].componentAssets[0].link'

components_componentAssets_isAgeRestricted = 'components[2].componentAssets[0].isAgeRestricted'

components_componentAssets_bannerDesc = 'components[2].componentAssets[0].bannerDesc'

components_componentAssets_bannerName = 'components[2].componentAssets[0].bannerName'

components_componentAssets_linkType = 'components[2].componentAssets[0].linkType'

components_componentAssets_logo = 'components[2].componentAssets[0].logo'

components_componentAssets_corporateColorCode = 'components[2].componentAssets[0].corporateColorCode'

components_componentAssets_deliveryTime = 'components[2].componentAssets[0].deliveryTime'

components_componentAssets_positionAfter = 'components[2].componentAssets[0].positionAfter'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_ID)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_name)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_phone)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_phone)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_address)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_address)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_postalCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_postalCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_logo)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_logo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_city)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_banner)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_banner)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_image)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_image)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPLP, components_storeData_latitude)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPLP, components_storeData_longitude)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_verticalsAvailable)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_link)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_componentAssets_deliveryTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_MultistoreEDD)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_linkType)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPLP, components_storeData_grade)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_open)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPLP, components_storeData_evaluationsCount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_openHours)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_openHours_time)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_openHours_time_openingTime)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_openHours_time_openingTime)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_openHours_time_closingTime)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_openHours_time_closingTime)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_openHours_day)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_openHours_day)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_shipmentCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_shipmentCost_currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_shipmentCost_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_shipmentCost_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_shipmentCost_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_storeType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_storeType)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPLP, components__storeData_ratings)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_storeData_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_storeData_corporateColorCode)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_grantiasDeLaTienda)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_tarifaDeEntrega)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_politicaDePrecios)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_storeData_ageShowWarningModel)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentAssets)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentAssets_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentAssets_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentAssets_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentAssets_link)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_componentAssets_isAgeRestricted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentAssets_bannerDesc)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentAssets_bannerDesc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentAssets_bannerName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentAssets_bannerName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPLP, components_componentAssets_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPLP, components_componentAssets_linkType)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_componentAssets_logo)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_componentAssets_corporateColorCode)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_componentAssets_deliveryTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPLP, components_componentAssets_positionAfter)


