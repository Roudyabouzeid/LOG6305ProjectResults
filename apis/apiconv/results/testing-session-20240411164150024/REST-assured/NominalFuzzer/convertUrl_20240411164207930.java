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
@Order(198)
public class convertUrl_20240411164207930{

String baseURL ="https://mermade.org.uk/api/v1";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_url = "http://oayvdlu.de/MC14 7604 2605 37Q1 7DL7 MP4P K41/";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("url" , request0_query_url);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/convert");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_convertUrl_20240411164207930()  throws JSONException{
		test0();
	}
}
