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
@Order(54)
public class post_balanceTransfer_20240411163206250{

String baseURL ="https://pal-test.adyen.com/pal/servlet/BalanceControl/v1";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		JSONObject request0_request_body = new JSONObject();
		JSONObject request0_request_body_amount = new JSONObject();
		Object request0_request_body_amount_currency = "è6z";
		request0_request_body_amount.put("currency" , request0_request_body_amount_currency);
		Object request0_request_body_amount_value = 106;
		request0_request_body_amount.put("value" , request0_request_body_amount_value);
		request0_request_body.put("amount" , request0_request_body_amount);
		Object request0_request_body_description = "superexplicitly";
		request0_request_body.put("description" , request0_request_body_description);
		Object request0_request_body_fromMerchant = "W";
		request0_request_body.put("fromMerchant" , request0_request_body_fromMerchant);
		Object request0_request_body_reference = null;
		request0_request_body.put("reference" , request0_request_body_reference);
		Object request0_request_body_toMerchant = "557914942";
		request0_request_body.put("toMerchant" , request0_request_body_toMerchant);
		Object request0_request_body_type = "debit";
		request0_request_body.put("type" , request0_request_body_type);
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.contentType(ContentType.JSON).body(request0_request_body.toString());
		//Build Response
		Response response0 = request0.when().post(baseURL+"/balanceTransfer");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_post_balanceTransfer_20240411163206250()  throws JSONException{
		test0();
	}
}
