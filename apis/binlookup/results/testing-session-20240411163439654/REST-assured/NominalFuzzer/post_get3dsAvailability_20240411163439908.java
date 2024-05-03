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
@Order(4)
public class post_get3dsAvailability_20240411163439908{

String baseURL ="https://pal-test.adyen.com/pal/servlet/BinLookup/v54";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		JSONObject request0_request_body = new JSONObject();
		JSONObject request0_request_body_additionalData = new JSONObject();
		request0_request_body.put("additionalData" , request0_request_body_additionalData);
		JSONArray request0_request_body_brands = new JSONArray();
		request0_request_body.put("brands" , request0_request_body_brands);
		Object request0_request_body_cardNumber = "YvqeiETnyRblhBSA27rhBMqZ-fwa3YBTY_MTwud5pR3gh8uJnEURG2s6z3OO6kSI3UrIVCJHc-h3P-wBt7c=";
		request0_request_body.put("cardNumber" , request0_request_body_cardNumber);
		Object request0_request_body_merchantAccount = "lM0GD€";
		request0_request_body.put("merchantAccount" , request0_request_body_merchantAccount);
		Object request0_request_body_recurringDetailReference = "IQR";
		request0_request_body.put("recurringDetailReference" , request0_request_body_recurringDetailReference);
		Object request0_request_body_shopperReference = null;
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
	public void test_post_get3dsAvailability_20240411163439908()  throws JSONException{
		test0();
	}
}
