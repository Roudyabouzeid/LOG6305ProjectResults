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
@Order(285)
public class validateUrl_20240411164216681{

String baseURL ="https://mermade.org.uk/api/v1";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_url = "http://aolp.com/";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("url" , request0_query_url);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/validate");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_validateUrl_20240411164216681()  throws JSONException{
		test0();
	}
}
