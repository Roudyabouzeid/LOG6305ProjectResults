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
public class productsUsingGET_20240411164600722{

String baseURL ="https://www.klarna.com/us/shopping";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_size = null;
		Object request0_query_budget = null;
		Object request0_query_q = "opticon";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("size" , request0_query_size);
		request0.queryParam("budget" , request0_query_budget);
		request0.queryParam("q" , request0_query_q);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/public/openai/v0/products");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_productsUsingGET_20240411164600722()  throws JSONException{
		test0();
	}
}
