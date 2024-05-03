package NominalFuzzer;

import static io.restassured.RestAssured.*;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.common.mapper.TypeRef;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.json.*;
import org.junit.jupiter.api.*;
//import org.junit.runners.*;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Order(37)
public class post_getCostEstimate_20240411163443003{

String baseURL ="https://pal-test.adyen.com/pal/servlet/BinLookup/v54";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		JSONObject request0_request_body = new JSONObject();
		JSONObject request0_request_body_amount = new JSONObject();
		Object request0_request_body_amount_currency = "VSB";
		request0_request_body_amount.put("currency" , request0_request_body_amount_currency);
		Object request0_request_body_amount_value = -1033537667063431691;
		request0_request_body_amount.put("value" , request0_request_body_amount_value);
		request0_request_body.put("amount" , request0_request_body_amount);
		JSONObject request0_request_body_assumptions = new JSONObject();
		Object request0_request_body_assumptions_assume3DSecureAuthenticated = null;
		request0_request_body_assumptions.put("assume3DSecureAuthenticated" , request0_request_body_assumptions_assume3DSecureAuthenticated);
		Object request0_request_body_assumptions_assumeLevel3Data = null;
		request0_request_body_assumptions.put("assumeLevel3Data" , request0_request_body_assumptions_assumeLevel3Data);
		Object request0_request_body_assumptions_installments = null;
		request0_request_body_assumptions.put("installments" , request0_request_body_assumptions_installments);
		request0_request_body.put("assumptions" , request0_request_body_assumptions);
		Object request0_request_body_cardNumber = null;
		request0_request_body.put("cardNumber" , request0_request_body_cardNumber);
		Object request0_request_body_encryptedCardNumber = null;
		request0_request_body.put("encryptedCardNumber" , request0_request_body_encryptedCardNumber);
		Object request0_request_body_merchantAccount = "EV";
		request0_request_body.put("merchantAccount" , request0_request_body_merchantAccount);
		JSONObject request0_request_body_merchantDetails = new JSONObject();
		Object request0_request_body_merchantDetails_countryCode = null;
		request0_request_body_merchantDetails.put("countryCode" , request0_request_body_merchantDetails_countryCode);
		Object request0_request_body_merchantDetails_enrolledIn3DSecure = null;
		request0_request_body_merchantDetails.put("enrolledIn3DSecure" , request0_request_body_merchantDetails_enrolledIn3DSecure);
		Object request0_request_body_merchantDetails_mcc = null;
		request0_request_body_merchantDetails.put("mcc" , request0_request_body_merchantDetails_mcc);
		request0_request_body.put("merchantDetails" , request0_request_body_merchantDetails);
		JSONObject request0_request_body_recurring = new JSONObject();
		Object request0_request_body_recurring_contract = null;
		request0_request_body_recurring.put("contract" , request0_request_body_recurring_contract);
		Object request0_request_body_recurring_recurringDetailName = null;
		request0_request_body_recurring.put("recurringDetailName" , request0_request_body_recurring_recurringDetailName);
		Object request0_request_body_recurring_recurringExpiry = null;
		request0_request_body_recurring.put("recurringExpiry" , request0_request_body_recurring_recurringExpiry);
		Object request0_request_body_recurring_recurringFrequency = null;
		request0_request_body_recurring.put("recurringFrequency" , request0_request_body_recurring_recurringFrequency);
		Object request0_request_body_recurring_tokenService = null;
		request0_request_body_recurring.put("tokenService" , request0_request_body_recurring_tokenService);
		request0_request_body.put("recurring" , request0_request_body_recurring);
		Object request0_request_body_selectedRecurringDetailReference = null;
		request0_request_body.put("selectedRecurringDetailReference" , request0_request_body_selectedRecurringDetailReference);
		Object request0_request_body_shopperInteraction = null;
		request0_request_body.put("shopperInteraction" , request0_request_body_shopperInteraction);
		Object request0_request_body_shopperReference = null;
		request0_request_body.put("shopperReference" , request0_request_body_shopperReference);
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.contentType(ContentType.JSON).body(request0_request_body.toString());
		//Build Response
		Response response0 = request0.when().post(baseURL+"/getCostEstimate");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_post_getCostEstimate_20240411163443003()  throws JSONException{
		test0();
	}
}
