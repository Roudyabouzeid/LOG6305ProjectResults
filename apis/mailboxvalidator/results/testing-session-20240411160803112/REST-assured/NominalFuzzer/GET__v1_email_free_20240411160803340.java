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
@Order(11)
public class GET_/v1/email/free_20240411160803340{

String baseURL ="https://api.mailboxvalidator.com/";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_format = "json";
		Object request0_query_key = "nonvalidly";
		Object request0_query_email = "tpz@live.com";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("format" , request0_query_format);
		request0.queryParam("key" , request0_query_key);
		request0.queryParam("email" , request0_query_email);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/v1/email/free");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/v1/email/free_20240411160803340()  throws JSONException{
		test0();
	}
}
