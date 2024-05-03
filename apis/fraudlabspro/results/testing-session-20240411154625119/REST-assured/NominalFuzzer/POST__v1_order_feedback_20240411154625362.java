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
@Order(10)
public class POST_/v1/order/feedback_20240411154625362{

String baseURL ="https://api.fraudlabspro.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_action = "APPROVE";
		Object request0_query_key = "EAEO";
		Object request0_query_format = null;
		Object request0_query_notes = "PtsWi6RCVuF";
		Object request0_query_id = "cc";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("action" , request0_query_action);
		request0.queryParam("key" , request0_query_key);
		request0.queryParam("format" , request0_query_format);
		request0.queryParam("notes" , request0_query_notes);
		request0.queryParam("id" , request0_query_id);
		//Build Response
		Response response0 = request0.when().post(baseURL+"/v1/order/feedback");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_POST_/v1/order/feedback_20240411154625362()  throws JSONException{
		test0();
	}
}
