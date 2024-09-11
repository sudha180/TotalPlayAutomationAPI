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

WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)

SPD_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/PLP/Store Policy Details', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(SPD_Response,200)

id = 'id'
ID = 'c_result.ID'
name = 'c_result.name'
phone = 'c_result.phone'
postalCode = 'c_result.postalCode'
address = 'c_result.address'
city = 'c_result.city'
image = 'c_result.image'
latitude = 'c_result.latitude'
longitude = 'c_result.longitude'
todayOpenHrs = 'c_result.todayOpenHrs'
openHours = 'c_result.openHours'
lunes = 'c_result.openHours.lunes'
martes = 'c_result.openHours.martes'
miercoles = 'c_result.openHours.miercoles'
jueves = 'c_result.openHours.jueves'
viernes = 'c_result.openHours.viernes'
sabado = 'c_result.openHours.sabado'
domingo = 'c_result.openHours.domingo'
verticalsAvailable = 'c_result.verticalsAvailable'
MultistoreEDD = 'c_result.MultistoreEDD'
link = 'c_result.link'
open = 'c_result.open'
corporateName =  'c_result.corporateName'
shipmentCostvalue = 'c_result.shipmentCost.value'
shipmentCostcurrency = 'c_result.shipmentCost.currency'
shipmentCostformatted = 'c_result.shipmentCost.formatted'
shipmentCostdecimalPrice = 'c_result.shipmentCost.decimalPrice'
storeType = 'c_result.storeType'
verticalType = 'c_result.verticalType'
corporateColorCode = 'c_result.corporateColorCode'
politicaDePrecios = 'c_result.politicaDePrecios'
tarifaDeEntrega = 'c_result.tarifaDeEntrega'
grantiasDeLaTienda = 'c_result.grantiasDeLaTienda'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, postalCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, postalCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, address)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, address)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, image)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SPD_Response, latitude)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, latitude)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SPD_Response, longitude)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, todayOpenHrs)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, todayOpenHrs)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, openHours)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, openHours)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, lunes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, lunes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, martes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, martes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, miercoles)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, miercoles)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, jueves)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, jueves)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, viernes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, viernes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, sabado)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, sabado)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, domingo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, domingo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, verticalsAvailable)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, verticalsAvailable)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, MultistoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, MultistoreEDD)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, link)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SPD_Response, open)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, open)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, corporateName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, corporateName)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SPD_Response, shipmentCostvalue)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, shipmentCostvalue)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, shipmentCostformatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, shipmentCostformatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, shipmentCostdecimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, shipmentCostdecimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, storeType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, storeType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, verticalType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SPD_Response, politicaDePrecios)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, politicaDePrecios)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SPD_Response, tarifaDeEntrega)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, tarifaDeEntrega)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SPD_Response, grantiasDeLaTienda)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SPD_Response, grantiasDeLaTienda)


