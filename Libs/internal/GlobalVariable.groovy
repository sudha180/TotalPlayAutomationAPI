package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object successCode
     
    /**
     * <p></p>
     */
    public static Object globalId
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object SITEID
     
    /**
     * <p></p>
     */
    public static Object basketID
     
    /**
     * <p></p>
     */
    public static Object sla_customerId
     
    /**
     * <p></p>
     */
    public static Object orderTotal
     
    /**
     * <p></p>
     */
    public static Object Authorization
     
    /**
     * <p></p>
     */
    public static Object shop_auth_token
     
    /**
     * <p></p>
     */
    public static Object customerId
     
    /**
     * <p></p>
     */
    public static Object access_token
     
    /**
     * <p></p>
     */
    public static Object client_id
     
    /**
     * <p></p>
     */
    public static Object bm_auth_token
     
    /**
     * <p></p>
     */
    public static Object refresh_token
     
    /**
     * <p></p>
     */
    public static Object basketId
     
    /**
     * <p></p>
     */
    public static Object Order_Total
     
    /**
     * <p></p>
     */
    public static Object Seller_ID
     
    /**
     * <p></p>
     */
    public static Object Product_ID
     
    /**
     * <p></p>
     */
    public static Object corporateName
     
    /**
     * <p></p>
     */
    public static Object storeType
     
    /**
     * <p></p>
     */
    public static Object Item_id
     
    /**
     * <p></p>
     */
    public static Object address_id
     
    /**
     * <p></p>
     */
    public static Object postal_code
     
    /**
     * <p></p>
     */
    public static Object quantity
     
    /**
     * <p></p>
     */
    public static Object crm_address
     
    /**
     * <p></p>
     */
    public static Object SellerList
     
    /**
     * <p></p>
     */
    public static Object FoodBasketId
     
    /**
     * <p></p>
     */
    public static Object OrderNo
     
    /**
     * <p></p>
     */
    public static Object crm_address_id
     
    /**
     * <p></p>
     */
    public static Object SellerId1
     
    /**
     * <p></p>
     */
    public static Object SellerId2
     
    /**
     * <p></p>
     */
    public static Object brm_id
     
    /**
     * <p></p>
     */
    public static Object latitude
     
    /**
     * <p></p>
     */
    public static Object longitude
     
    /**
     * <p></p>
     */
    public static Object refine_1
     
    /**
     * <p></p>
     */
    public static Object lattitude
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseUrl = selectedVariables['baseUrl']
            successCode = selectedVariables['successCode']
            globalId = selectedVariables['globalId']
            URL = selectedVariables['URL']
            SITEID = selectedVariables['SITEID']
            basketID = selectedVariables['basketID']
            sla_customerId = selectedVariables['sla_customerId']
            orderTotal = selectedVariables['orderTotal']
            Authorization = selectedVariables['Authorization']
            shop_auth_token = selectedVariables['shop_auth_token']
            customerId = selectedVariables['customerId']
            access_token = selectedVariables['access_token']
            client_id = selectedVariables['client_id']
            bm_auth_token = selectedVariables['bm_auth_token']
            refresh_token = selectedVariables['refresh_token']
            basketId = selectedVariables['basketId']
            Order_Total = selectedVariables['Order_Total']
            Seller_ID = selectedVariables['Seller_ID']
            Product_ID = selectedVariables['Product_ID']
            corporateName = selectedVariables['corporateName']
            storeType = selectedVariables['storeType']
            Item_id = selectedVariables['Item_id']
            address_id = selectedVariables['address_id']
            postal_code = selectedVariables['postal_code']
            quantity = selectedVariables['quantity']
            crm_address = selectedVariables['crm_address']
            SellerList = selectedVariables['SellerList']
            FoodBasketId = selectedVariables['FoodBasketId']
            OrderNo = selectedVariables['OrderNo']
            crm_address_id = selectedVariables['crm_address_id']
            SellerId1 = selectedVariables['SellerId1']
            SellerId2 = selectedVariables['SellerId2']
            brm_id = selectedVariables['brm_id']
            latitude = selectedVariables['latitude']
            longitude = selectedVariables['longitude']
            refine_1 = selectedVariables['refine_1']
            lattitude = selectedVariables['lattitude']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
