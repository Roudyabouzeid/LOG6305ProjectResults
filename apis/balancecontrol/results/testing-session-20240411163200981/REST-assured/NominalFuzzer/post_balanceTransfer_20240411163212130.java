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
@Order(102)
public class post_balanceTransfer_20240411163212130{

String baseURL ="https://pal-test.adyen.com/pal/servlet/BalanceControl/v1";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		JSONObject request0_request_body = new JSONObject();
		JSONObject request0_request_body_amount = new JSONObject();
		Object request0_request_body_amount_currency = "HSM";
		request0_request_body_amount.put("currency" , request0_request_body_amount_currency);
		Object request0_request_body_amount_value = 8;
		request0_request_body_amount.put("value" , request0_request_body_amount_value);
		request0_request_body.put("amount" , request0_request_body_amount);
		Object request0_request_body_description = null;
		request0_request_body.put("description" , request0_request_body_description);
		Object request0_request_body_fromMerchant = "NkTH3JlB0dQC5Z7qEeAlPFevf7KppHL3LJ2I2jiYisXiUq7_5mvwXpj6HQQel-WdS3PWaXfrlCu1CjAxYm_8-gpXBj-s8e6t_-3_4Q1r6FvCuBqVVbhFwMkQ3t8Gz5FQpQ==";
		request0_request_body.put("fromMerchant" , request0_request_body_fromMerchant);
		Object request0_request_body_reference = null;
		request0_request_body.put("reference" , request0_request_body_reference);
		Object request0_request_body_toMerchant = "multiplated";
		request0_request_body.put("toMerchant" , request0_request_body_toMerchant);
		Object request0_request_body_type = "fee";
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
	public void test_post_balanceTransfer_20240411163212130()  throws JSONException{
		test0();
	}
}
