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
@Order(8)
public class GET_/v1/validation/single_20240411161739361{

String baseURL ="https://api.mailboxvalidator.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_email = "fm@mjeplthpl.lvmttsug.me";
		Object request0_query_key = "MR06 1753 9334 4771 6851 5777 625";
		Object request0_query_format = null;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("email" , request0_query_email);
		request0.queryParam("key" , request0_query_key);
		request0.queryParam("format" , request0_query_format);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/v1/validation/single");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/v1/validation/single_20240411161739361()  throws JSONException{
		test0();
	}
}
