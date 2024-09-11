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

AddToCart = WS.sendRequest(findTestObject('TotalPlay-Food/Food_Add to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID, ('SellerId1') : GlobalVariable.SellerId1]))


CustomKeywords.'totalplay.Common.printResponseinText'(AddToCart)

WS.verifyResponseStatusCode(AddToCart, 200)

/*
basePrice = 'basePrice'
basePrice_currencyIso = 'basePrice.currencyIso'
basePrice_formattedValue = 'basePrice.formattedValue'
basePrice_priceType = 'basePrice.priceType'
basePrice_value = 'basePrice.value'
basePriceWithDiscount = 'basePriceWithDiscount'
basePriceWithDiscount_currencyIso = 'basePriceWithDiscount.currencyIso'
basePriceWithDiscount_formattedValue = 'basePriceWithDiscount.formattedValue'
basePriceWithDiscount_priceType = 'basePriceWithDiscount.priceType'
basePriceWithDiscount_value = 'basePriceWithDiscount.value'
configurationInfos = 'configurationInfos'
comments = 'comments'
deliveryPointOfService_address = 'deliveryPointOfService.address'
deliveryPointOfService = 'deliveryPointOfService'
deliveryPointOfService_address_appartment = 'deliveryPointOfService.address.appartment'
deliveryPointOfService_address_billingAddress = 'deliveryPointOfService.address.billingAddress'
deliveryPointOfService_address_cellphone = 'deliveryPointOfService.address.cellphone'
deliveryPointOfService_address_company = 'deliveryPointOfService.address.company'
deliveryPointOfService_address_companyName = 'deliveryPointOfService.address.companyName'
deliveryPointOfService_address_contactAddress = 'deliveryPointOfService.address.contactAddress'
deliveryPointOfService_address_country = 'deliveryPointOfService.address.country'
deliveryPointOfService_address_country_isocode = 'deliveryPointOfService.address.country.isocode'
deliveryPointOfService_address_country_name = 'deliveryPointOfService.address.country.name'
deliveryPointOfService_address_delegation = 'deliveryPointOfService.address.delegation'
deliveryPointOfService_address_district = 'deliveryPointOfService.address.district'
deliveryPointOfService_address_email = 'deliveryPointOfService.address.email'
deliveryPointOfService_address_firstName = 'deliveryPointOfService.address.firstName'
deliveryPointOfService_address_formattedAddress = 'deliveryPointOfService.address.formattedAddress'
deliveryPointOfService_address_fullName = 'deliveryPointOfService.address.fullName'
deliveryPointOfService_address_id = 'deliveryPointOfService.address.id'
deliveryPointOfService_address_idTotalPlay = 'deliveryPointOfService.address.idTotalPlay'
deliveryPointOfService_address_lastName = 'deliveryPointOfService.address.lastName'
deliveryPointOfService_address_line1 = 'deliveryPointOfService.address.line1'
deliveryPointOfService_address_line2 = 'deliveryPointOfService.address.line2'
deliveryPointOfService_address_phone = 'deliveryPointOfService.address.phone'
deliveryPointOfService_address_postalCode = 'deliveryPointOfService.address.postalCode'
deliveryPointOfService_address_region_countryIso = 'deliveryPointOfService.address.region.countryIso'
deliveryPointOfService_address_region = 'deliveryPointOfService.address.region'
deliveryPointOfService_address_region_isocodeShort = 'deliveryPointOfService.address.region.isocodeShort'
deliveryPointOfService_address_region_isocode = 'deliveryPointOfService.address.region.isocode'
deliveryPointOfService_address_region_name = 'deliveryPointOfService.address.region.name'
deliveryPointOfService_address_streetname = 'deliveryPointOfService.address.streetname'
deliveryPointOfService_address_streetnumber = 'deliveryPointOfService.address.streetnumber'
deliveryPointOfService_address_town = 'deliveryPointOfService.address.town'
deliveryPointOfService_address_visibleInAddressBook = 'deliveryPointOfService.address.visibleInAddressBook'
deliveryPointOfService_clusterTP = 'deliveryPointOfService.clusterTP'
deliveryPointOfService_description = 'deliveryPointOfService.description'
deliveryPointOfService_displayName = 'deliveryPointOfService.displayName'
deliveryPointOfService_features = 'deliveryPointOfService.features'
deliveryPointOfService_geoPoint_latitude= 'deliveryPointOfService.geoPoint.latitude'
deliveryPointOfService_geoPoint_longitude = 'deliveryPointOfService.geoPoint.longitude'
deliveryPointOfService_mapIcon_code = 'deliveryPointOfService.mapIcon.code'
deliveryPointOfService_mapIcon_format = 'deliveryPointOfService.mapIcon.format'
deliveryPointOfService_mapIcon_url = 'deliveryPointOfService.mapIcon.url'
deliveryPointOfService_openingHours = 'deliveryPointOfService.openingHours'
specialDayOpeningList = 'deliveryPointOfService.openingHours.specialDayOpeningList'
deliveryPointOfService_openingHours_weekDayOpeningList = 'deliveryPointOfService.openingHours.weekDayOpeningList'
deliveryPointOfService_openingHours_weekDayOpeningList_closingTime = 'deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime'
deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_formattedHour='deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0].formattedHour'
deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_minute = 'deliveryPointOfService.openingHours.weekDayOpeningList[0].closingTime[0].minute'
deliveryPointOfService_openingHours_weekDayOpeningList_openingTime = 'deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime'
deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_ormattedHour = 'deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime[0].formattedHour'
deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_minute = 'deliveryPointOfService.openingHours.weekDayOpeningList[0].openingTime[0].minute'
deliveryPointOfService_openingHours_weekDayOpeningList_closed = 'deliveryPointOfService.openingHours.weekDayOpeningList[0].closed'
deliveryPointOfService_openingHours_weekDayOpeningList = 'deliveryPointOfService.openingHours.weekDayOpeningList[1]'
deliveryPointOfService_storeImages = 'deliveryPointOfService.storeImages[0]'
deliveryPointOfService_storeImages='deliveryPointOfService.storeImages[1]'
deliveryPointOfService_warehousesDetail = 'deliveryPointOfService.warehousesDetail'
deliveryPointOfService_warehousesDetail_vendor = 'deliveryPointOfService.warehousesDetail[0].vendor'
deliveryPointOfService_warehousesDetail_vendor_catalog = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog'
deliveryPointOfService_warehousesDetail_vendor_catalog_id = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog.id'
deliveryPointOfService_warehousesDetail_vendor_catalog_name = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog.name'
deliveryPointOfService_warehousesDetail_vendor_catalog_catalogVersions = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions'
deliveryPointOfService_warehousesDetail_vendor_catalog_catalogVersions = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[0]'
deliveryPointOfService_warehousesDetail_vendor_catalog_catalogVersions_id = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[0].id'
deliveryPointOfService_warehousesDetail_vendor_catalog_catalogVersions = 'deliveryPointOfService.warehousesDetail[0].vendor.catalog.catalogVersions[1]'
deliveryPointOfService_warehousesDetail_vendor_categoriesFood_id = 'deliveryPointOfService.warehousesDetail[0].vendor.categoriesFood[0].id'
deliveryPointOfService_warehousesDetail_vendor_code = 'deliveryPointOfService.warehousesDetail[0].vendor.code'
deliveryPointOfService_warehousesDetail_vendor_idProveedorBRM = 'deliveryPointOfService.warehousesDetail[0].vendor.idProveedorBRM'
deliveryPointOfService_warehousesDetail_vendor_logo = 'deliveryPointOfService.warehousesDetail[0].vendor.logo'
deliveryPointOfService_warehousesDetail_vendor_logo = 'deliveryPointOfService.warehousesDetail[0].vendor.logo[0]'
deliveryPointOfService_warehousesDetail_vendor_name = 'deliveryPointOfService.warehousesDetail[0].vendor.name'
deliveryPointOfService_warehousesDetail_warehouseCode = 'deliveryPointOfService.warehousesDetail[0].warehouseCode'
deliveryPointOfService_verticalType = 'deliveryPointOfService.verticalType'
deliveryPointOfService_corporateName = 'deliveryPointOfService.corporateName'
entryNumber = 'entryNumber'
product_averageRating = 'product.averageRating'
product = 'product'
product_availableForPickup = 'product.availableForPickup'
product_baseOptions = 'product.baseOptions'
product_categories = 'product.categories'
product_categories= 'product.categories[0]'
product_categories_name = 'product.categories[0].name'
product_classifications = 'product.classifications'
product_configurable = 'product.configurable'
product_characteristics = 'product.characteristics'
product_description = 'product.description'
product_galleryImages = 'product.galleryImages[0]'
product_images = 'product.images'
product_galleryImages_format = 'product.galleryImages[0].format'
product_images_format = 'product.images[0].format'
product_manufacturer = 'product.manufacturer'
product_multimedia = 'product.multimedia'
product_multimedia_video = 'product.multimedia.video'
product_name = 'product.name'
product_offlineDate = 'product.offlineDate'
product_onlineDate ='product.onlineDate'
product_price = 'product.price'
product_price_formattedValue = 'product.price.formattedValue'
product_price_currencyIso = 'product.price.currencyIso'
product_price_priceType = 'product.price.priceType'
product_price_value = 'product.price.value'
product_purchasable = 'product.purchasable'
product_stock = 'product.stock'
product_sku = 'product.sku'
product_stock_stockLevelStatus = 'product.stock.stockLevelStatus'
product_vendor = 'product.vendor'
product_url = 'product.url'
product_vendor_categoriesFood = 'product.vendor.categoriesFood'
product_vendor_categoriesFood = 'product.vendor.categoriesFood'
product_vendor_categoriesFood_name = 'product.vendor.categoriesFood[0].name'
product_vendor_categoriesFood_id = 'product.vendor.categoriesFood[0].id'
product_vendor_categoriesFood_name = 'product.vendor.categoriesFood[1].name'
product_vendor_categoriesFood_id = 'product.vendor.categoriesFood[1].id'
productComission = 'productComission'
totalPrice_formattedValue = 'totalPrice.formattedValue'
totalPrice = 'totalPrice'
totalPrice_priceType = 'totalPrice.priceType'
totalPrice_value = 'totalPrice.value'
updateable = 'updateable'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,basePrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,basePrice_currencyIso)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,basePrice_formattedValue)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,basePrice_priceType)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart,basePrice_value)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,basePriceWithDiscount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,basePriceWithDiscount_currencyIso)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,basePriceWithDiscount_formattedValue)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,basePriceWithDiscount_priceType)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart,basePriceWithDiscount_value)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,configurationInfos)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,comments)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_address)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_appartment)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart,deliveryPointOfService_address_billingAddress)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_cellphone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_company)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_companyName)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart,deliveryPointOfService_address_contactAddress)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_address_country)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_country_isocode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_country_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_district)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_firstName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_formattedAddress)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_fullName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_idTotalPlay)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_lastName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_line1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_line2)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_postalCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_region_countryIso)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_address_region)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_region_isocodeShort)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_region_isocode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_region_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_streetname)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_streetnumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_address_town)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart,deliveryPointOfService_address_visibleInAddressBook)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_clusterTP)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_displayName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_features)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart,deliveryPointOfService_geoPoint_latitude)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart,deliveryPointOfService_geoPoint_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_mapIcon_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_mapIcon_format)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_mapIcon_url)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,specialDayOpeningList)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_closingTime)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_formattedHour)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_closingTime_minute)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_openingTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_ormattedHour)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_openingTime_minute)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList_closed)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_openingHours_weekDayOpeningList)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_storeImages)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_warehousesDetail)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_warehousesDetail_vendor)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,deliveryPointOfService_warehousesDetail_vendor_catalog)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,deliveryPointOfService_corporateName)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart,entryNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_averageRating)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_availableForPickup)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_baseOptions)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_categories)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_categories_name)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_classifications)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart,product_configurable)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_characteristics)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_description)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_galleryImages)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_images)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_galleryImages_format)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_images_format)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_manufacturer)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_multimedia)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_multimedia_video)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_offlineDate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_onlineDate)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_price)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_price_formattedValue)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_price_currencyIso)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_price_priceType)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart,product_price_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_purchasable)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_stock)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_sku)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_stock_stockLevelStatus)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_vendor)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_url)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,product_vendor_categoriesFood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_vendor_categoriesFood_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_vendor_categoriesFood_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_vendor_categoriesFood_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,product_vendor_categoriesFood_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,productComission)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,totalPrice_formattedValue)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart,totalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,totalPrice_priceType)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart,totalPrice_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart,updateable)
*/


/*
_v = '_v'

_type = '_type'

_resource_state = '_resource_state'

adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'

adjusted_shipping_total_tax = 'adjusted_shipping_total_tax'

agent_basket = 'agent_basket'

basket_id = 'basket_id'

billing_address__type = 'billing_address._type'

billing_address_address1 = 'billing_address.address1'

billing_address_city = 'billing_address.city'

billing_address_country_code = 'billing_address.country_code'

billing_address_first_name = 'billing_address.first_name'

billing_address_full_name = 'billing_address.full_name'

billing_address_id = 'billing_address.id'

billing_address_last_name = 'billing_address.last_name'

billing_address_phone = 'billing_address.phone'

billing_address_postal_code = 'billing_address.postal_code'

billing_address_c_alias = 'billing_address.c_alias'

billing_address_c_delegation = 'billing_address.c_delegation'

billing_address_c_label = 'billing_address.c_label'

billing_address_c_latitude = 'billing_address.c_latitude'

billing_address_c_longitude = 'billing_address.c_longitude'

billing_address_c_nExt = 'billing_address.c_nExt'

billing_address_c_neighborhood = 'billing_address.c_neighborhood'

billing_address_c_references = 'billing_address.c_references'

billing_address_c_rfc = 'billing_address.c_rfc'

billing_address_c_state = 'billing_address.c_state'

billing_address_c_streetName = 'billing_address.c_streetName'

channel_type = 'channel_type'

creation_date = 'creation_date'

currency = 'currency'

customer_info__type = 'customer_info._type'

customer_info_customer_id = 'customer_info.customer_id'

customer_info_customer_no = 'customer_info.customer_no'

customer_info_email = 'customer_info.email'

last_modified = 'last_modified'

merchandize_total_tax = 'merchandize_total_tax'

notes__type = 'notes._type'

notes_link = 'notes.link'

order_total = 'order_total'

payment_instruments_0__type = 'payment_instruments[0]._type'

payment_instruments_0_amount = 'payment_instruments[0].amount'

payment_instruments_0_payment_instrument_id = 'payment_instruments[0].payment_instrument_id'

payment_instruments_0_payment_method_id = 'payment_instruments[0].payment_method_id'

product_items_0__type = 'product_items[0]._type'

product_items_0_adjusted_tax = 'product_items[0].adjusted_tax'

product_items_0_base_price = 'product_items[0].base_price'

product_items_0_bonus_product_line_item = 'product_items[0].bonus_product_line_item'

product_items_0_gift = 'product_items[0].gift'

product_items_0_inventory_id = 'product_items[0].inventory_id'

product_items_0_item_id = 'product_items[0].item_id'

product_items_0_item_text = 'product_items[0].item_text'

product_items_0_price = 'product_items[0].price'

product_items_0_price_after_item_discount = 'product_items[0].price_after_item_discount'

product_items_0_price_after_order_discount = 'product_items[0].price_after_order_discount'

product_items_0_product_id = 'product_items[0].product_id'

product_items_0_product_name = 'product_items[0].product_name'

product_items_0_quantity = 'product_items[0].quantity'

product_items_0_shipment_id = 'product_items[0].shipment_id'

product_items_0_tax = 'product_items[0].tax'

product_items_0_tax_basis = 'product_items[0].tax_basis'

product_items_0_tax_class_id = 'product_items[0].tax_class_id'

product_items_0_tax_rate = 'product_items[0].tax_rate'

product_items_0_c_fromStoreId = 'product_items[0].c_fromStoreId'

product_items_0_c_miraklChannels = 'product_items[0].c_miraklChannels'

product_items_0_c_miraklOperatorProductId = 'product_items[0].c_miraklOperatorProductId'

product_items_0_c_miraklShippingTaxes = 'product_items[0].c_miraklShippingTaxes'

product_items_0_c_miraklTaxes = 'product_items[0].c_miraklTaxes'

product_items_0_c_offerId = 'product_items[0].c_offerId'

product_items_0_c_offerSalesPrice = 'product_items[0].c_offerSalesPrice'

product_items_0_c_offerState = 'product_items[0].c_offerState'

product_items_0_c_offerStateCode = 'product_items[0].c_offerStateCode'

product_items_0_c_shopId = 'product_items[0].c_shopId'

product_items_0_c_shopName = 'product_items[0].c_shopName'

product_items_0_c_priceWithComplement = 'product_items[0].c_priceWithComplement'

product_items_0_c_imagesData_large_0_alt = 'product_items[0].c_imagesData.large[0].alt'

product_items_0_c_imagesData_large_0_url = 'product_items[0].c_imagesData.large[0].url'

product_items_0_c_imagesData_large_0_title = 'product_items[0].c_imagesData.large[0].title'

product_items_0_c_description = 'product_items[0].c_description'

product_sub_total = 'product_sub_total'

product_total = 'product_total'

shipments_0__type = 'shipments[0]._type'

shipments_0_adjusted_merchandize_total_tax = 'shipments[0].adjusted_merchandize_total_tax'

shipments_0_adjusted_shipping_total_tax = 'shipments[0].adjusted_shipping_total_tax'

shipments_0_gift = 'shipments[0].gift'

shipments_0_merchandize_total_tax = 'shipments[0].merchandize_total_tax'

shipments_0_product_sub_total = 'shipments[0].product_sub_total'

shipments_0_product_total = 'shipments[0].product_total'

shipments_0_shipment_id = 'shipments[0].shipment_id'

shipments_0_shipment_total = 'shipments[0].shipment_total'

shipments_0_shipping_address__type = 'shipments[0].shipping_address._type'

shipments_0_shipping_address_address1 = 'shipments[0].shipping_address.address1'

shipments_0_shipping_address_city = 'shipments[0].shipping_address.city'

shipments_0_shipping_address_country_code = 'shipments[0].shipping_address.country_code'

shipments_0_shipping_address_first_name = 'shipments[0].shipping_address.first_name'

shipments_0_shipping_address_full_name = 'shipments[0].shipping_address.full_name'

shipments_0_shipping_address_id = 'shipments[0].shipping_address.id'

shipments_0_shipping_address_last_name = 'shipments[0].shipping_address.last_name'

shipments_0_shipping_address_phone = 'shipments[0].shipping_address.phone'

shipments_0_shipping_address_postal_code = 'shipments[0].shipping_address.postal_code'

shipments_0_shipping_address_c_alias = 'shipments[0].shipping_address.c_alias'

shipments_0_shipping_address_c_delegation = 'shipments[0].shipping_address.c_delegation'

shipments_0_shipping_address_c_label = 'shipments[0].shipping_address.c_label'

shipments_0_shipping_address_c_latitude = 'shipments[0].shipping_address.c_latitude'

shipments_0_shipping_address_c_longitude = 'shipments[0].shipping_address.c_longitude'

shipments_0_shipping_address_c_nExt = 'shipments[0].shipping_address.c_nExt'

shipments_0_shipping_address_c_neighborhood = 'shipments[0].shipping_address.c_neighborhood'

shipments_0_shipping_address_c_references = 'shipments[0].shipping_address.c_references'

shipments_0_shipping_address_c_rfc = 'shipments[0].shipping_address.c_rfc'

shipments_0_shipping_address_c_state = 'shipments[0].shipping_address.c_state'

shipments_0_shipping_address_c_streetName = 'shipments[0].shipping_address.c_streetName'

shipments_0_shipping_method__type = 'shipments[0].shipping_method._type'

shipments_0_shipping_method_description = 'shipments[0].shipping_method.description'

shipments_0_shipping_method_id = 'shipments[0].shipping_method.id'

shipments_0_shipping_method_name = 'shipments[0].shipping_method.name'

shipments_0_shipping_method_shipping_promotions_0__type = 'shipments[0].shipping_method.shipping_promotions[0]._type'

shipments_0_shipping_method_shipping_promotions_0_callout_msg = 'shipments[0].shipping_method.shipping_promotions[0].callout_msg'

shipments_0_shipping_method_shipping_promotions_0_link = 'shipments[0].shipping_method.shipping_promotions[0].link'

shipments_0_shipping_method_shipping_promotions_0_promotion_id = 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'

shipments_0_shipping_method_shipping_promotions_0_promotion_name = 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'

shipments_0_shipping_status = 'shipments[0].shipping_status'

shipments_0_shipping_total = 'shipments[0].shipping_total'

shipments_0_shipping_total_tax = 'shipments[0].shipping_total_tax'

shipments_0_tax_total = 'shipments[0].tax_total'

shipments_0_c_serviceCharge = 'shipments[0].c_serviceCharge'

shipments_0_c_shippingRates = 'shipments[0].c_shippingRates'

shipments_0_c_totalShippingCost = 'shipments[0].c_totalShippingCost'

shipping_items_0__type = 'shipping_items[0]._type'

shipping_items_0_adjusted_tax = 'shipping_items[0].adjusted_tax'

shipping_items_0_base_price = 'shipping_items[0].base_price'

shipping_total = 'shipping_total'

shipping_total_tax = 'shipping_total_tax'

taxation = 'taxation'

tax_rounded_at_group = 'tax_rounded_at_group'

tax_total = 'tax_total'

temporary_basket = 'temporary_basket'

c_currentCorporate = 'c_currentCorporate'

c_forceDeleteOndemand = 'c_forceDeleteOndemand'

c_isLock = 'c_isLock'

c_isMiraklOrder = 'c_isMiraklOrder'

c_lockTime = 'c_lockTime'

c_miraklShippingZoneCode = 'c_miraklShippingZoneCode'

c_pickerExpressShipment = 'c_pickerExpressShipment'

c_seller_id = 'c_seller_id'

c_serviceChargeTotalGrossPrice = 'c_serviceChargeTotalGrossPrice'

c_savingsTotal = 'c_savingsTotal'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _v)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _resource_state)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _resource_state)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, agent_basket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, last_modified)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, last_modified)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, notes_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, notes_link)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, payment_instruments_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, payment_instruments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, payment_instruments_0_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, payment_instruments_0_payment_instrument_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, payment_instruments_0_payment_instrument_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, payment_instruments_0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, payment_instruments_0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_adjusted_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, product_items_0_bonus_product_line_item)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, product_items_0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_item_text)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_price)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_price_after_item_discount)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_product_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart, product_items_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_shipment_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_c_priceWithComplement)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_imagesData_large_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_imagesData_large_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(AddToCart, product_items_0_c_imagesData_large_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_imagesData_large_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_imagesData_large_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_description)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_description)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_sub_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, shipments_0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_product_sub_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_description)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_callout_msg)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_callout_msg)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_promotion_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_promotion_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_shipping_promotions_0_promotion_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_shipping_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_shipping_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_tax_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_c_serviceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_c_shippingRates)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_c_shippingRates)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_c_totalShippingCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipping_items_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipping_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_adjusted_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_adjusted_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, taxation)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, taxation)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, c_currentCorporate)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, c_currentCorporate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, c_miraklShippingZoneCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, c_miraklShippingZoneCode)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, tax_rounded_at_group)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, temporary_basket)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, c_forceDeleteOndemand)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, c_isLock)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, c_isMiraklOrder)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, c_pickerExpressShipment)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, c_pickerExpressShipment)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, c_seller_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, c_seller_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, c_serviceChargeTotalGrossPrice)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, c_savingsTotal)
*/

_v	=	 '_v'
_type	=	 '_type'
_resource_state	=	 '_resource_state'
_flash_0__type	=	 '_flash[0]._type'
_flash_0_type	=	 '_flash[0].type'
_flash_0_message	=	 '_flash[0].message'
_flash_0_path	=	 '_flash[0].path'
adjusted_merchandize_total_tax	=	 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax	=	 'adjusted_shipping_total_tax'
agent_basket	=	 'agent_basket'
basket_id	=	 'basket_id'
channel_type	=	 'channel_type'
creation_date	=	 'creation_date'
currency	=	 'currency'
customer_info	=	 'customer_info'
customer_info__type	=	 'customer_info._type'
customer_info_customer_id	=	 'customer_info.customer_id'
customer_info_customer_no	=	 'customer_info.customer_no'
customer_info_email	=	 'customer_info.email'
last_modified	=	 'last_modified'
merchandize_total_tax	=	 'merchandize_total_tax'
notes__type	=	 'notes._type'
notes_link	=	 'notes.link'
order_total	=	 'order_total'
product_items_0__type	=	 'product_items[0]._type'
product_items_0_adjusted_tax	=	 'product_items[0].adjusted_tax'
product_items_0_base_price	=	 'product_items[0].base_price'
product_items_0_bonus_product_line_item	=	 'product_items[0].bonus_product_line_item'
product_items_0_gift	=	 'product_items[0].gift'
product_items_0_inventory_id	=	 'product_items[0].inventory_id'
product_items_0_item_id	=	 'product_items[0].item_id'
product_items_0_item_text	=	 'product_items[0].item_text'
product_items_0_price	=	 'product_items[0].price'
product_items_0_price_after_item_discount	=	 'product_items[0].price_after_item_discount'
product_items_0_price_after_order_discount	=	 'product_items[0].price_after_order_discount'
product_items_0_product_id	=	 'product_items[0].product_id'
product_items_0_product_name	=	 'product_items[0].product_name'
product_items_0_quantity	=	 'product_items[0].quantity'
product_items_0_shipment_id	=	 'product_items[0].shipment_id'
product_items_0_tax	=	 'product_items[0].tax'
product_items_0_tax_basis	=	 'product_items[0].tax_basis'
product_items_0_tax_class_id	=	 'product_items[0].tax_class_id'
product_items_0_tax_rate	=	 'product_items[0].tax_rate'
product_items_0_c_fromStoreId	=	 'product_items[0].c_fromStoreId'
product_items_0_c_isOnDemandStoreItem	=	 'product_items[0].c_isOnDemandStoreItem'
product_items_0_c_miraklChannels	=	 'product_items[0].c_miraklChannels'
product_items_0_c_miraklOperatorProductId	=	 'product_items[0].c_miraklOperatorProductId'
product_items_0_c_miraklShippingTaxes	=	 'product_items[0].c_miraklShippingTaxes'
product_items_0_c_miraklTaxes	=	 'product_items[0].c_miraklTaxes'
product_items_0_c_offerId	=	 'product_items[0].c_offerId'
product_items_0_c_offerSalesPrice	=	 'product_items[0].c_offerSalesPrice'
product_items_0_c_offerState	=	 'product_items[0].c_offerState'
product_items_0_c_offerStateCode	=	 'product_items[0].c_offerStateCode'
product_items_0_c_shopId	=	 'product_items[0].c_shopId'
product_items_0_c_shopName	=	 'product_items[0].c_shopName'
product_items_0_c_total_crossed_price	=	 'product_items[0].c_total_crossed_price'
product_items_0_c_priceWithComplement	=	 'product_items[0].c_priceWithComplement'
product_items_0_c_imagesData_large_0_alt	=	 'product_items[0].c_imagesData.large[0].alt'
product_items_0_c_imagesData_large_0_url	=	 'product_items[0].c_imagesData.large[0].url'
product_items_0_c_imagesData_large_0_title	=	 'product_items[0].c_imagesData.large[0].title'
product_items_0_c_description	=	 'product_items[0].c_description'
product_sub_total	=	 'product_sub_total'
product_total	=	 'product_total'
shipments_0__type	=	 'shipments[0]._type'
shipments_0_adjusted_merchandize_total_tax	=	 'shipments[0].adjusted_merchandize_total_tax'
shipments_0_adjusted_shipping_total_tax	=	 'shipments[0].adjusted_shipping_total_tax'
shipments_0_gift	=	 'shipments[0].gift'
shipments_0_merchandize_total_tax	=	 'shipments[0].merchandize_total_tax'
shipments_0_product_sub_total	=	 'shipments[0].product_sub_total'
shipments_0_product_total	=	 'shipments[0].product_total'
shipments_0_shipment_id	=	 'shipments[0].shipment_id'
shipments_0_shipment_total	=	 'shipments[0].shipment_total'

shipments_0_shipping_method__type	=	 'shipments[0].shipping_method._type'
shipments_0_shipping_method_description	=	 'shipments[0].shipping_method.description'
shipments_0_shipping_method_id	=	 'shipments[0].shipping_method.id'
shipments_0_shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0_shipping_method_c_estimatedArrivalTime	=	 'shipments[0].shipping_method.c_estimatedArrivalTime'
shipments_0_shipping_method_c_storePickupEnabled	=	 'shipments[0].shipping_method.c_storePickupEnabled'
shipments_0_shipping_status	=	 'shipments[0].shipping_status'
shipments_0_shipping_total	=	 'shipments[0].shipping_total'
shipments_0_shipping_total_tax	=	 'shipments[0].shipping_total_tax'
shipments_0_tax_total	=	 'shipments[0].tax_total'
shipping_items_0__type	=	 'shipping_items[0]._type'
shipping_items_0_adjusted_tax	=	 'shipping_items[0].adjusted_tax'
shipping_items_0_base_price	=	 'shipping_items[0].base_price'
shipping_items_0_item_id	=	 'shipping_items[0].item_id'
shipping_items_0_item_text	=	 'shipping_items[0].item_text'
shipping_items_0_price	=	 'shipping_items[0].price'
shipping_items_0_price_after_item_discount	=	 'shipping_items[0].price_after_item_discount'
shipping_items_0_shipment_id	=	 'shipping_items[0].shipment_id'
shipping_items_0_tax	=	 'shipping_items[0].tax'
shipping_items_0_tax_basis	=	 'shipping_items[0].tax_basis'
shipping_items_0_tax_class_id	=	 'shipping_items[0].tax_class_id'
shipping_items_0_tax_rate	=	 'shipping_items[0].tax_rate'
shipping_total	=	 'shipping_total'
shipping_total_tax	=	 'shipping_total_tax'
taxation	=	 'taxation'
tax_rounded_at_group	=	 'tax_rounded_at_group'
tax_total	=	 'tax_total'
temporary_basket	=	 'temporary_basket'
c_currentCorporate	=	 'c_currentCorporate'
c_forceDeleteOndemand	=	 'c_forceDeleteOndemand'
c_seller_id	=	 'c_seller_id'
c_savingsTotal	=	 'c_savingsTotal'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _resource_state)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _flash_0__type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _flash_0__type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _flash_0_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _flash_0_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _flash_0_message)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _flash_0_message)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, _flash_0_path)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, _flash_0_path)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, agent_basket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info_customer_no)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, last_modified)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, notes_link)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, product_items_0_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, product_items_0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart, product_items_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_product_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, product_items_0_c_isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklChannels)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklShippingTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_miraklTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_c_total_crossed_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_items_0_c_priceWithComplement)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_imagesData_large_0_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_imagesData_large_0_alt)

//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(AddToCart, product_items_0_c_imagesData_large_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_imagesData_large_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_imagesData_large_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, product_items_0_c_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, product_items_0_c_description)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, shipments_0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_description)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_method_c_estimatedArrivalTime)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_method_c_estimatedArrivalTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipments_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_shipping_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipments_0_tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipping_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipping_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_base_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipping_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipping_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipping_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipping_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_price_after_item_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipping_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipping_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, shipping_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, shipping_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_items_0_tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, taxation)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, tax_rounded_at_group)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, tax_total)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, temporary_basket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, c_currentCorporate)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart, c_forceDeleteOndemand)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart, c_seller_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart, c_savingsTotal)
