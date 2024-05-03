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
@Order(92)
public class GET_/_20240411161237326{

String baseURL ="https://api.ip2proxy.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_format = null;
		Object request0_query_key = "pyrognomic";
		Object request0_query_ip = "60dd:1c04:9da1:9ec8:100d:fff9:f63d:1084";
		Object request0_query_package = null;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("format" , request0_query_format);
		request0.queryParam("key" , request0_query_key);
		request0.queryParam("ip" , request0_query_ip);
		request0.queryParam("package" , request0_query_package);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/_20240411161237326()  throws JSONException{
		test0();
	}
}
