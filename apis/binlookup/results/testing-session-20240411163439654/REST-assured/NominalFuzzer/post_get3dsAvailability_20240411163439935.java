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
@Order(5)
public class post_get3dsAvailability_20240411163439935{

String baseURL ="https://pal-test.adyen.com/pal/servlet/BinLookup/v54";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		JSONObject request0_request_body = new JSONObject();
		JSONObject request0_request_body_additionalData = new JSONObject();
		request0_request_body.put("additionalData" , request0_request_body_additionalData);
		JSONArray request0_request_body_brands = new JSONArray();
		Object request0_request_body_brands_brands0 = "antiorthodoxly";
		request0_request_body_brands.put(request0_request_body_brands_brands0);
		Object request0_request_body_brands_brands1 = "09067750-dbf5-4d1c-b540-ec52391c2f3c";
		request0_request_body_brands.put(request0_request_body_brands_brands1);
		Object request0_request_body_brands_brands2 = "swaddlebill";
		request0_request_body_brands.put(request0_request_body_brands_brands2);
		request0_request_body.put("brands" , request0_request_body_brands);
		Object request0_request_body_cardNumber = "";
		request0_request_body.put("cardNumber" , request0_request_body_cardNumber);
		Object request0_request_body_merchantAccount = "a L";
		request0_request_body.put("merchantAccount" , request0_request_body_merchantAccount);
		Object request0_request_body_recurringDetailReference = null;
		request0_request_body.put("recurringDetailReference" , request0_request_body_recurringDetailReference);
		Object request0_request_body_shopperReference = "Fmi3";
		request0_request_body.put("shopperReference" , request0_request_body_shopperReference);
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.contentType(ContentType.JSON).body(request0_request_body.toString());
		//Build Response
		Response response0 = request0.when().post(baseURL+"/get3dsAvailability");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_post_get3dsAvailability_20240411163439935()  throws JSONException{
		test0();
	}
}
