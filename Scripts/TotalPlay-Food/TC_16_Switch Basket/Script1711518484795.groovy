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


AddProductToBAsket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))
CustomKeywords.'totalplay.Common.printResponseinText'(AddProductToBAsket)
WS.verifyResponseStatusCode(AddProductToBAsket, 200)

//product_productItemId = 'product.productItemId'

//GlobalVariable.Item_id = WS.getElementPropertyValue(AddProductToBAsket, product_productItemId)

GlobalVariable.SellerId1 = GlobalVariable.SellerId2
GlobalVariable.Product_ID = GlobalVariable.Product_ID1
println(GlobalVariable.SellerId1)
println(GlobalVariable.Product_ID)

AddProductToBAsket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))
CustomKeywords.'totalplay.Common.printResponseinText'(AddProductToBAsket)

println(GlobalVariable.SellerId1)
WS.verifyResponseStatusCode(AddProductToBAsket, 200)

product_productItemId = 'product.productItemId'

GlobalVariable.Item_id = WS.getElementPropertyValue(AddProductToBAsket, product_productItemId)


SwitchBasket = WS.sendRequest(findTestObject('TotalPlay-Food/Food - Switch Basket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))
CustomKeywords.'totalplay.Common.printResponseinText'(SwitchBasket)
WS.verifyResponseStatusCode(SwitchBasket, 200)

carts = 'carts'

carts0_appliedOrderPromotions = 'carts[0].appliedOrderPromotions'

carts0_appliedVouchers = 'carts[0].appliedVouchers'

carts0_code = 'carts[0].code'

carts0_entries = 'carts[0].entries'

carts0_entries0 = 'carts[0].entries[0]'

carts0_entries0_basePrice = 'carts[0].entries[0].basePrice'

carts0_entries0_basePrice_currencyIso = 'carts[0].entries[0].basePrice.currencyIso'

carts0_entries0_basePrice_priceType = 'carts[0].entries[0].basePrice.priceType'

carts0_entries0_basePriceWithDiscount = 'carts[0].entries[0].basePriceWithDiscount'

carts0_entries0_basePrice_value = 'carts[0].entries[0].basePrice.value'

carts0_entries0_basePriceWithDiscount_currencyIso = 'carts[0].entries[0].basePriceWithDiscount.currencyIso'

carts0_entries0_basePriceWithDiscount_priceType = 'carts[0].entries[0].basePriceWithDiscount.priceType'

carts0_entries0_comments = 'carts[0].entries[0].comments'

carts0_entries0_basePriceWithDiscount_value = 'carts[0].entries[0].basePriceWithDiscount.value'

carts0_entries0_configurationInfos = 'carts[0].entries[0].configurationInfos'

carts0_entries0_deliveryPointOfService = 'carts[0].entries[0].deliveryPointOfService'

carts0_entries0_deliveryPoinitOfService_address_appartment = 'carts[0].entries[0].deliveryPointOfService.address.appartment'

carts0_entries0_deliveryPointOfService_address_cellphone = 'carts[0].entries[0].deliveryPointOfService.address.cellphone'

carts0_entries0_deliveryPointOfService_address_company = 'carts[0].entries[0].deliveryPointOfService.address.company'

carts0_entries0_deliveryPointOfService_address_companyName = 'carts[0].entries[0].deliveryPointOfService.address.companyName'

carts0_entries0_deliveryPointOfService_address_contactAddress = 'carts[0].entries[0].deliveryPointOfService.address.contactAddress'

carts0_entries0_deliveryPointOfService_address_country = 'carts[0].entries[0].deliveryPointOfService.address.country'

carts0_entries0_deliveryPointOfService_address_country_isocode = 'carts[0].entries[0].deliveryPointOfService.address.country.isocode'

carts0_entries0_deliveryPointOfService_address_country_name = 'carts[0].entries[0].deliveryPointOfService.address.country.name'

carts0_entries0_deliveryPointOfService_address_defaultAddress = 'carts[0].entries[0].deliveryPointOfService.address.defaultAddress'

carts0_entries0_deliveryPointOfService_address_delegation = 'carts[0].entries[0].deliveryPointOfService.address.delegation'

carts0_entries0_deliveryPointOfService_address_district = 'carts[0].entries[0].deliveryPointOfService.address.district'

carts0_entries0_deliveryPointOfService_address_email = 'carts[0].entries[0].deliveryPointOfService.address.email'

carts0_entries0_deliveryPointOfService_address_formattedAddress = 'carts[0].entries[0].deliveryPointOfService.address.formattedAddress'

carts0_entries0_deliveryPointOfService_address_fullName = 'carts[0].entries[0].deliveryPointOfService.address.fullName'

carts0_entries0_deliveryPointOfService_address_id = 'carts[0].entries[0].deliveryPointOfService.address.id'

carts0_entries0_deliveryPointOfService_address_idTotalPlay = 'carts[0].entries[0].deliveryPointOfService.address.idTotalPlay'

carts0_entries0_deliveryPointOfService_address_lastName = 'carts[0].entries[0].deliveryPointOfService.address.lastName'

carts0_entries0_deliveryPointOfService_address_line1 = 'carts[0].entries[0].deliveryPointOfService.address.line1'

carts0_entries0_deliveryPointOfService_address_line2 = 'carts[0].entries[0].deliveryPointOfService.address.line2'

carts0_entries0_deliveryPointOfService_address_phone = 'carts[0].entries[0].deliveryPointOfService.address.phone'

carts0_entries0_deliveryPointOfService_address_postalCode = 'carts[0].entries[0].deliveryPointOfService.address.postalCode'

carts0_entries0_deliveryPointOfService_address_region = 'carts[0].entries[0].deliveryPointOfService.address.region'

carts0_entries0_deliveryPointOfService_address_region_countryIso = 'carts[0].entries[0].deliveryPointOfService.address.region.countryIso'

carts0_entries0_deliveryPointOfService_address_region_isocode = 'carts[0].entries[0].deliveryPointOfService.address.region.isocode'

carts0_entries0_deliveryPointOfService_address_region_isocodeShort = 'carts[0].entries[0].deliveryPointOfService.address.region.isocodeShort'

carts0_entries0_deliveryPointOfService_address_region_name = 'carts[0].entries[0].deliveryPointOfService.address.region.name'

carts0_entries0_deliveryPointOfService_address_shippingAddress = 'carts[0].entries[0].deliveryPointOfService.address.shippingAddress'

carts0_entries0_deliveryPointOfService_address_streetname = 'carts[0].entries[0].deliveryPointOfService.address.streetname'

carts0_entries0_deliveryPointOfService_address_streetnumber = 'carts[0].entries[0].deliveryPointOfService.address.streetnumber'

carts0_entries0_deliveryPointOfService_address_town = 'carts[0].entries[0].deliveryPointOfService.address.town'

carts0_entries0_deliveryPointOfService_clusterTelco = 'carts[0].entries[0].deliveryPointOfService.clusterTelco'

carts0_entries0_deliveryPointOfService_clusterTP = 'carts[0].entries[0].deliveryPointOfService.clusterTP'

carts0_entries0_deliveryPointOfService_description = 'carts[0].entries[0].deliveryPointOfService.description'

carts0_entries0_deliveryPointOfService_displayName = 'carts[0].entries[0].deliveryPointOfService.displayName'

carts0_entries0_deliveryPointOfService_geoPoint_latitude = 'carts[0].entries[0].deliveryPointOfService.geoPoint.latitude'

carts0_entries0_deliveryPointOfService_geoPoint = 'carts[0].entries[0].deliveryPointOfService.geoPoint'

carts0_entries0_deliveryPointOfService_geoPoint_longitude = 'carts[0].entries[0].deliveryPointOfService.geoPoint.longitude'

carts0_entries0_deliveryPointOfService_mapIcon_format = 'carts[0].entries[0].deliveryPointOfService.mapIcon.format'

carts0_entries0_deliveryPointOfService_mapIcon_code = 'carts[0].entries[0].deliveryPointOfService.mapIcon.code'

carts0_entries0_deliveryPointOfService_mapIcon_url = 'carts[0].entries[0].deliveryPointOfService.mapIcon.url'

carts0_entries0_deliveryPointOfService_name = 'carts[0].entries[0].deliveryPointOfService.name'

carts0_entries0_deliveryPointOfService_openingHours = 'carts[0].entries[0].deliveryPointOfService.openingHours'

carts0_entries0_deliveryPointOfService_openingHours_specialDayOpeningList = 'carts[0].entries[0].deliveryPointOfService.openingHours.specialDayOpeningList'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime0 = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0]'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime0_formattedHour = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0].formattedHour'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime0_minute = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0].minute'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime_hour = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[1].hour'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime1 = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[1]'

carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime_minute = 'carts[0].entries[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[1].minute'

carts0_entries0_deliveryPointOfService_warehousesDetail = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail'

carts0_entries0_deliveryPointOfService_warehousesDetail0 = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0]'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog_catalogVersions0_id = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[0].id'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog_catalogVersions = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[1]'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog_catalogVersions_id = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[1].id'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_categoriesFood = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_categoriesFood0_name = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood[0].name'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_description = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.description'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_logo = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.logo'

carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_logo0 = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].vendor.logo[0]'

carts0_entries0_deliveryPointOfService_warehousesDetail0_warehouseCode = 'carts[0].entries[0].deliveryPointOfService.warehousesDetail[0].warehouseCode'

carts_entries0_deliveryPointOfService_verticalType = 'carts[0].entries[0].deliveryPointOfService.verticalType'

carts_entries0_deliveryPointOfService_corporateName = 'carts[0].entries[0].deliveryPointOfService.corporateName'

carts_entries0_entryNumber = 'carts[0].entries[0].entryNumber'

CustomKeywords.'totalplay.Common.printResponseinText'(SwitchBasket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SwitchBasket, carts0_appliedOrderPromotions)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SwitchBasket, carts0_appliedVouchers)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SwitchBasket, carts0_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_basePrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_basePrice_currencyIso)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_basePrice_priceType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_basePriceWithDiscount)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_basePrice_value)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_basePriceWithDiscount_currencyIso)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_basePriceWithDiscount_priceType)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SwitchBasket, carts0_entries0_comments)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_basePriceWithDiscount_value)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SwitchBasket, carts0_entries0_configurationInfos)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService)

//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_appartment)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_cellphone)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_company)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_companyName)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_contactAddress)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_country)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_country_isocode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_country_name)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_defaultAddress)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_district)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_email)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_formattedAddress)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_fullName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_idTotalPlay)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_lastName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_line1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_line2)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_postalCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_region)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_region_countryIso)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_region_isocode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_region_isocodeShort)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_region_name)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_shippingAddress)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_streetname)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_streetnumber)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_address_town)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_clusterTelco)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_clusterTP)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_description)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_displayName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SwitchBasket, carts0_entries0_deliveryPointOfService_geoPoint_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_geoPoint)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SwitchBasket, carts0_entries0_deliveryPointOfService_geoPoint_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_mapIcon_format)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_mapIcon_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_mapIcon_url)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_specialDayOpeningList)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime0_formattedHour)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime0_minute)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime_hour)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_openingHours_weekDayOpeningList0_closingTime_minute)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog_catalogVersions0_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog_catalogVersions)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_catalog_catalogVersions_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_categoriesFood)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_categoriesFood0_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_vendor_logo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SwitchBasket, carts0_entries0_deliveryPointOfService_warehousesDetail0_warehouseCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts_entries0_deliveryPointOfService_verticalType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SwitchBasket, carts_entries0_deliveryPointOfService_corporateName)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SwitchBasket, carts_entries0_entryNumber)
carts_entries0_product_availableForPickup	=	'carts[0].entries[0].product.availableForPickup'
carts_entries0_product	=	'carts[0].entries[0].product'
carts_entries_product_averageRating	=	'carts[0].entries[0].product.averageRating'
carts_entries_product_categories	=	'carts[0].entries[0].product.categories'
carts_entries_product_categories0	=	'carts[0].entries[0].product.categories[0]'
carts_entries_product_categories_code	=	'carts[0].entries[0].product.categories[0].code'
carts_entries_product_categories_name	=	'carts[0].entries[0].product.categories[0].name'
carts_entries_product_categories_url	=	'carts[0].entries[0].product.categories[0].url'
carts_entries_product_classifications	=	'carts[0].entries[0].product.classifications'
carts_entries_product_configurable	=	'carts[0].entries[0].product.configurable'
carts_entries_product_description	=	'carts[0].entries[0].product.description'
carts_entries_product_galleryImages	=	'carts[0].entries[0].product.galleryImages[0]'
carts_entries_product_galleryImages_format	=	'carts[0].entries[0].product.galleryImages[0].format'
carts_entries_product_images	=	'carts[0].entries[0].product.images'
carts_entries_product_manufacturer	=	'carts[0].entries[0].product.manufacturer'
carts_entries_product_images0	=	'carts[0].entries[0].product.images[0]'
carts_entries_product_multimedia	=	'carts[0].entries[0].product.multimedia'
carts_entries_product_name	=	'carts[0].entries[0].product.name'
carts_entries_product_multimedia_video	=	'carts[0].entries[0].product.multimedia.video'
carts_entries_product_onlineDate	=	'carts[0].entries[0].product.onlineDate'
carts_entries_product_price	=	'carts[0].entries[0].product.price'
carts_entries_product_price_currencyIso	=	'carts[0].entries[0].product.price.currencyIso'
carts_entries_product_price_formattedValue	=	'carts[0].entries[0].product.price.formattedValue'
carts_entries_product_price_priceType	=	'carts[0].entries[0].product.price.priceType'
carts_entries_product_sku	=	'carts[0].entries[0].product.sku'
carts_entries_product_purchasable	=	'carts[0].entries[0].product.purchasable'
carts_entries_product_productItemId	=	'carts[0].entries[0].product.productItemId'
carts_entries_product_stock	=	'carts[0].entries[0].product.stock'
carts_entries_product_stock_stockLevel	=	'carts[0].entries[0].product.stock.stockLevel'
carts_entries_product_stock_stockLevelStatus	=	'carts[0].entries[0].product.stock.stockLevelStatus'
carts_entries_product_vendor	=	'carts[0].entries[0].product.vendor'
carts_entries_product_vendor_categoriesFood	=	'carts[0].entries[0].product.vendor.categoriesFood'
carts_entries_product_vendor_categoriesFood0	=	'carts[0].entries[0].product.vendor.categoriesFood[0]'
carts_entries_product_vendor_categoriesFood_name	=	'carts[0].entries[0].product.vendor.categoriesFood[0].name'
carts_entries_product_vendor_categoriesFood_id	=	'carts[0].entries[0].product.vendor.categoriesFood[0].id'
carts_entries_product_vendor_name	=	'carts[0].entries[0].product.vendor.name'
carts_entries_productComission	=	'carts[0].entries[0].productComission'
carts_entries_product_warranty	=	'carts[0].entries[0].product.warranty'
carts_entries_quantity	=	'carts[0].entries[0].quantity'
carts_entries_totalPrice_currencyIso	=	'carts[0].entries[0].totalPrice.currencyIso'
carts_entries_totalPrice_formattedValue	=	'carts[0].entries[0].totalPrice.formattedValue'
carts_entries_totalPrice_value	=	'carts[0].entries[0].totalPrice.value'
carts_entries_updateable	=	'carts[0].entries[0].updateable'
carts_guid	=	'carts[0].guid'
carts_net	=	'carts[0].net'
carts_orderDiscounts	=	'carts[0].orderDiscounts'
carts_orderDiscounts_currencyIso	=	'carts[0].orderDiscounts.currencyIso'
carts_orderDiscounts_formattedValue	=	'carts[0].orderDiscounts.formattedValue'
carts_orderDiscounts_value	=	'carts[0].orderDiscounts.value'
carts_pickupItemsQuantity	=	'carts[0].pickupItemsQuantity'
carts_pickupOrderGroups	=	'carts[0].pickupOrderGroups'
carts_pickupOrderGroups0	=	'carts[0].pickupOrderGroups[0]'
carts_pickupOrderGroups_basePrice	=	'carts[0].pickupOrderGroups[0].basePrice'
carts_pickupOrderGroups_basePrice_currencyIso	=	'carts[0].pickupOrderGroups[0].basePrice.currencyIso'
carts_pickupOrderGroups_basePrice_priceType	=	'carts[0].pickupOrderGroups[0].basePrice.priceType'
carts_pickupOrderGroups_basePrice_formattedValue	=	'carts[0].pickupOrderGroups[0].basePrice.formattedValue'
carts_pickupOrderGroups_basePriceWithDiscount	=	'carts[0].pickupOrderGroups[0].basePriceWithDiscount'
carts_pickupOrderGroups_basePriceWithDiscount_formattedValue	=	'carts[0].pickupOrderGroups[0].basePriceWithDiscount.formattedValue'
carts_pickupOrderGroups_basePriceWithDiscount_priceType	=	'carts[0].pickupOrderGroups[0].basePriceWithDiscount.priceType'
carts_pickupOrderGroups_basePriceWithDiscount_value	=	'carts[0].pickupOrderGroups[0].basePriceWithDiscount.value'
carts_pickupOrderGroups_comments	=	'carts[0].pickupOrderGroups[0].comments'
carts_pickupOrderGroups_deliveryPointOfService	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService'
carts_pickupOrderGroups_deliveryFree	=	'carts[0].pickupOrderGroups[0].deliveryFree'
carts_pickupOrderGroups_deliveryPointOfService_address	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address'
carts_pickupOrderGroups_deliveryPointOfService_address_appartment	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.appartment'
carts_pickupOrderGroups_deliveryPointOfService_address_billingAddress	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.billingAddress'
carts_pickupOrderGroups_deliveryPointOfService_address_company	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.company'
carts_pickupOrderGroups_deliveryPointOfService_address_contactAddress	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.contactAddress'
carts_pickupOrderGroups_deliveryPointOfService_address_country_name	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.country.name'
carts_pickupOrderGroups_deliveryPointOfService_address_country_isocode	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.country.isocode'
carts_pickupOrderGroups_deliveryPointOfService_address_defaultAddress	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.defaultAddress'
carts_pickupOrderGroups_deliveryPointOfService_address_delegation	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.delegation'
carts_pickupOrderGroups_deliveryPointOfService_address_district	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.district'
carts_pickupOrderGroups_deliveryPointOfService_address_email	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.email'
carts_pickupOrderGroups_deliveryPointOfService_address_formattedAddress	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.formattedAddress'
carts_pickupOrderGroups_deliveryPointOfService_address_id	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.id'
carts_pickupOrderGroups_deliveryPointOfService_address_fullName	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.fullName'
carts_pickupOrderGroups_deliveryPointOfService_address_idTotalPlay	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.idTotalPlay'
carts_pickupOrderGroups_deliveryPointOfService_address_line1	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.line1'
carts_pickupOrderGroups_deliveryPointOfService_address_line2	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.line2'
carts_pickupOrderGroups_deliveryPointOfService_address_phone	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.phone'
carts_pickupOrderGroups_deliveryPointOfService_address_postalCode	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.postalCode'
carts_pickupOrderGroups_deliveryPointOfService_address_region_countryIso	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.region.countryIso'
carts_pickupOrderGroups_deliveryPointOfService_address_region	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.region'
carts_pickupOrderGroups_deliveryPointOfService_address_region_isocode	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.region.isocode'
carts_pickupOrderGroups_deliveryPointOfService_address_region_isocodeShort	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.region.isocodeShort'
carts_pickupOrderGroups_deliveryPointOfService_address_region_name	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.region.name'
carts_pickupOrderGroups_deliveryPointOfService_address_shippingAddress	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.shippingAddress'
carts_pickupOrderGroups_deliveryPointOfService_address_streetname	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.streetname'
carts_pickupOrderGroups_deliveryPointOfService_address_streetnumber	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.streetnumber'
carts_pickupOrderGroups_deliveryPointOfService_address_town	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.town'
carts_pickupOrderGroups_deliveryPointOfService_address_visibleInAddressBook	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.address.visibleInAddressBook'
carts_pickupOrderGroups_deliveryPointOfService_clusterTP	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.clusterTP'
carts_pickupOrderGroups_deliveryPointOfService_clusterTelco	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.clusterTelco'
carts_pickupOrderGroups_deliveryPointOfService_description	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.description'
carts_pickupOrderGroups_deliveryPointOfService_features	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.features'
carts_pickupOrderGroups_deliveryPointOfService_geoPoint_latitude	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.geoPoint.latitude'
carts_pickupOrderGroups_deliveryPointOfService_geoPoint	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.geoPoint'
carts_pickupOrderGroups_deliveryPointOfService_mapIcon	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.mapIcon'
carts_pickupOrderGroups_deliveryPointOfService_mapIcon_code	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.mapIcon.code'
carts_pickupOrderGroups_deliveryPointOfService_geoPoint_longitude	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.geoPoint.longitude'
carts_pickupOrderGroups_deliveryPointOfService_mapIcon_format	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.mapIcon.format'
carts_pickupOrderGroups_deliveryPointOfService_mapIcon_url	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.mapIcon.url'
carts_pickupOrderGroups_deliveryPointOfService_openingHours	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_specialDayOpeningList	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.specialDayOpeningList'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_closingTime	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_closingTime	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0]'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_hour	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0].hour'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_formattedHour	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0].formattedHour'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_formattedHour	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[1].formattedHour'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_minute	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[1].minute'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_openingTime	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_formattedHour	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime[0].formattedHour'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_hour	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime[0].hour'
carts_pickupOrderGroups_deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_minute	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime[0].minute'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_catalog_id	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.id'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_catalog_name	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.name'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_catalog_catalogVersions_id	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[0].id'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_catalog_catalogVersions	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[1]'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_categoriesFood	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_categoriesFood	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood[0]'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_categoriesFood_id	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood[0].id'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_categoriesFood_name	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood[0].name'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_code	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.code'
carts_pickupOrderGroups_deliveryPointOfService_warehousesDetail_vendor_logo	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.warehousesDetail[0].vendor.logo'
carts_pickupOrderGroups_deliveryPointOfService_verticalType	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.verticalType'
carts_pickupOrderGroups_deliveryPointOfService_corporateName	=	'carts[0].pickupOrderGroups[0].deliveryPointOfService.corporateName'
carts_pickupOrderGroups_entryNumber	=	'carts[0].pickupOrderGroups[0].entryNumber'
carts_pickupOrderGroups_namedDeliveryDate	=	'carts[0].pickupOrderGroups[0].namedDeliveryDate'
carts_pickupOrderGroups_product_availableForPickup	=	'carts[0].pickupOrderGroups[0].product.availableForPickup'
carts_pickupOrderGroups_product_baseOptions	=	'carts[0].pickupOrderGroups[0].product.baseOptions'
carts_pickupOrderGroups_product_categories	=	'carts[0].pickupOrderGroups[0].product.categories[0]'
carts_pickupOrderGroups_product_categories_name	=	'carts[0].pickupOrderGroups[0].product.categories[0].name'
carts_pickupOrderGroups_product_categories_code	=	'carts[0].pickupOrderGroups[0].product.categories[0].code'
carts_pickupOrderGroups_product_classifications	=	'carts[0].pickupOrderGroups[0].product.classifications'
carts_pickupOrderGroups_product_characteristics	=	'carts[0].pickupOrderGroups[0].product.characteristics'
carts_pickupOrderGroups_product_code	=	'carts[0].pickupOrderGroups[0].product.code'
carts_pickupOrderGroups_product_configurable	=	'carts[0].pickupOrderGroups[0].product.configurable'
carts_pickupOrderGroups_product_galleryImages	=	'carts[0].pickupOrderGroups[0].product.galleryImages'
carts_pickupOrderGroups_product_galleryImages_format	=	'carts[0].pickupOrderGroups[0].product.galleryImages[0].format'
carts_pickupOrderGroups_product_images_format	=	'carts[0].pickupOrderGroups[0].product.images[0].format'
carts_pickupOrderGroups_product_images	=	'carts[0].pickupOrderGroups[0].product.images'
carts_pickupOrderGroups_product_manufacturerName	=	'carts[0].pickupOrderGroups[0].product.manufacturerName'
carts_pickupOrderGroups_product_multimedia	=	'carts[0].pickupOrderGroups[0].product.multimedia'
carts_pickupOrderGroups_product_multimedia_video	=	'carts[0].pickupOrderGroups[0].product.multimedia.video'
carts_pickupOrderGroups_product_offlineDate	=	'carts[0].pickupOrderGroups[0].product.offlineDate'
carts_pickupOrderGroups_product_price_formattedValue	=	'carts[0].pickupOrderGroups[0].product.price.formattedValue'
carts_pickupOrderGroups_product_price	=	'carts[0].pickupOrderGroups[0].product.price'
carts_pickupOrderGroups_product_purchasable	=	'carts[0].pickupOrderGroups[0].product.purchasable'
carts_pickupOrderGroups_product_sku	=	'carts[0].pickupOrderGroups[0].product.sku'
carts_pickupOrderGroups_product_productItemId	=	'carts[0].pickupOrderGroups[0].product.productItemId'
carts_pickupOrderGroups_product_stock	=	'carts[0].pickupOrderGroups[0].product.stock'
carts_pickupOrderGroups_product_stock_stockLevelStatus	=	'carts[0].pickupOrderGroups[0].product.stock.stockLevelStatus'
carts_pickupOrderGroups_product_url	=	'carts[0].pickupOrderGroups[0].product.url'
carts_pickupOrderGroups_product_vendor_categoriesFood	=	'carts[0].pickupOrderGroups[0].product.vendor.categoriesFood'
carts_pickupOrderGroups_product_vendor_categoriesFood0	=	'carts[0].pickupOrderGroups[0].product.vendor.categoriesFood[0]'
carts_pickupOrderGroups_product_vendor_categoriesFood_name	=	'carts[0].pickupOrderGroups[0].product.vendor.categoriesFood[0].name'
carts_pickupOrderGroups_product_vendor_code	=	'carts[0].pickupOrderGroups[0].product.vendor.code'
carts_pickupOrderGroups_product_vendor_name	=	'carts[0].pickupOrderGroups[0].product.vendor.name'
carts_pickupOrderGroups_product_warranty	=	'carts[0].pickupOrderGroups[0].product.warranty'
carts_pickupOrderGroups_quantity	=	'carts[0].pickupOrderGroups[0].quantity'
carts_pickupOrderGroups_totalPrice	=	'carts[0].pickupOrderGroups[0].totalPrice'
carts_pickupOrderGroups_totalPrice_currencyIso	=	'carts[0].pickupOrderGroups[0].totalPrice.currencyIso'
carts_pickupOrderGroups_totalPrice_priceType	=	'carts[0].pickupOrderGroups[0].totalPrice.priceType'
carts_pickupOrderGroups_totalPrice_value	=	'carts[0].pickupOrderGroups[0].totalPrice.value'
carts_pickupOrderGroups_updateable	=	'carts[0].pickupOrderGroups[0].updateable'
carts_productDiscounts_currencyIso	=	'carts[0].productDiscounts.currencyIso'
carts_productDiscounts_priceType	=	'carts[0].productDiscounts.priceType'
carts_productDiscounts_value	=	'carts[0].productDiscounts.value'
carts_site	=	'carts[0].site'
carts_store	=	'carts[0].store'
carts_subTotal	=	'carts[0].subTotal'
carts_subTotal_currencyIso	=	'carts[0].subTotal.currencyIso'
carts_totalDiscounts	=	'carts[0].totalDiscounts'
carts_subTotal_priceType	=	'carts[0].subTotal.priceType'
carts_totalDiscounts_currencyIso	=	'carts[0].totalDiscounts.currencyIso'
carts_totalDiscounts_formattedValue	=	'carts[0].totalDiscounts.formattedValue'
carts_totalItems	=	'carts[0].totalItems'
carts_totalPrice_currencyIso	=	'carts[0].totalPrice.currencyIso'
carts_totalPrice_formattedValue	=	'carts[0].totalPrice.formattedValue'
carts_totalPrice_formattedValue0	=	'carts[0].totalPrice.formattedValue'
carts_totalPrice_value	=	'carts[0].totalPrice.value'
carts_totalPrice_priceType	=	'carts[0].totalPrice.priceType'
carts_totalPriceWithTax	=	'carts[0].totalPriceWithTax'
carts_totalPriceWithTax_currencyIso	=	'carts[0].totalPriceWithTax.currencyIso'
carts_totalPriceWithTax_formattedValue	=	'carts[0].totalPriceWithTax.formattedValue'
carts_totalPriceWithTax_priceType	=	'carts[0].totalPriceWithTax.priceType'
carts_totalPriceWithTax_value	=	'carts[0].totalPriceWithTax.value'
carts_totalTax	=	'carts[0].totalTax'
carts_totalTax_currencyIso	=	'carts[0].totalTax.currencyIso'
carts_totalTax_formattedValue	=	'carts[0].totalTax.formattedValue'
carts_totalTax_priceType	=	'carts[0].totalTax.priceType'
carts_totalTax_value	=	'carts[0].totalTax.value'
carts_user_name	=	'carts[0].user.name'
carts_user_uid	=	'carts[0].user.uid'
carts_amountIvaRetention	=	'carts[0].amountIvaRetention'
carts_amountPromoWithoutIva	=	'carts[0].amountPromoWithoutIva'
carts_deliveryCostCarrierTax	=	'carts[0].deliveryCostCarrierTax'
carts_commissionTPwithoutTax	=	'carts[0].commissionTPwithoutTax'
carts_deliveryCostCarrierWithoutTax	=	'carts[0].deliveryCostCarrierWithoutTax'
carts_deliveryCostWithoutTax	=	'carts[0].deliveryCostWithoutTax'
carts_fixedShippingCost	=	'carts[0].fixedShippingCost'
carts_isPromotionDeliveryFree	=	'carts[0].isPromotionDeliveryFree'
carts_isRepurchase	=	'carts[0].isRepurchase'
carts_isr	=	'carts[0].isr'
carts_potentialOrderPromotions	=	'carts[0].potentialOrderPromotions'
carts_potentialProductPromotions	=	'carts[0].potentialProductPromotions'
carts_taxCarrier	=	'carts[0].taxCarrier'
carts_taxTotal	=	'carts[0].taxTotal'
carts_tipAmount	=	'carts[0].tipAmount'
carts_tipAmount_currencyIso	=	'carts[0].tipAmount.currencyIso'
carts_tipAmount_formattedValue	=	'carts[0].tipAmount.formattedValue'
carts_tipAmount_priceType	=	'carts[0].tipAmount.priceType'
carts_tipAmount_value	=	'carts[0].tipAmount.value'
carts_totalEntriesWithoutTax	=	'carts[0].totalEntriesWithoutTax'
carts_totalUnitCount	=	'carts[0].totalUnitCount'
carts1	=	'carts[1]'
carts1_appliedProductPromotions	=	'carts[1].appliedProductPromotions'
carts1_appliedProductPromotions_consumedEntries	=	'carts[1].appliedProductPromotions[0].consumedEntries'
carts1_appliedProductPromotions0_consumedEntries0_adjustedUnitPrice	=	'carts[1].appliedProductPromotions[0].consumedEntries[0].adjustedUnitPrice'
carts1_appliedProductPromotions0_consumedEntries0_orderEntryNumber	=	'carts[1].appliedProductPromotions[0].consumedEntries[0].orderEntryNumber'
carts1_appliedProductPromotions0_consumedEntries0_quantity	=	'carts[1].appliedProductPromotions[0].consumedEntries[0].quantity'
carts1_appliedProductPromotions0_consumedEntries1	=	'carts[1].appliedProductPromotions[0].consumedEntries[1]'
carts1_appliedProductPromotions0_consumedEntries1_orderEntryNumber	=	'carts[1].appliedProductPromotions[0].consumedEntries[1].orderEntryNumber'
carts1_appliedProductPromotions0_consumedEntries1_quantity	=	'carts[1].appliedProductPromotions[0].consumedEntries[1].quantity'

WebUI.callTestCase(findTestCase('CommonMethod-Food-SwitchBasket'), [:], FailureHandling.STOP_ON_FAILURE)

