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
@Order(52)
public class CreateEventNotification_20240411164419377{

String baseURL ="https://openbanking.org.uk";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_header_x-fapi-financial-id = "un-Christianize";
		Object request0_header_x-fapi-interaction-id = null;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.header("x-fapi-financial-id" , request0_header_x-fapi-financial-id);
		request0.header("x-fapi-interaction-id" , request0_header_x-fapi-interaction-id);
		//Build Response
		Response response0 = request0.when().post(baseURL+"/event-notifications");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_CreateEventNotification_20240411164419377()  throws JSONException{
		test0();
	}
}
