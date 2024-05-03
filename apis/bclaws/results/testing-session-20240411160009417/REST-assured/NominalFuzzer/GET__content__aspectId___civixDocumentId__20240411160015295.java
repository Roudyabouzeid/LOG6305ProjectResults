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
@Order(26)
public class GET_/content/{aspectId}/{civixDocumentId}_20240411160015295{

String baseURL ="http://www.bclaws.ca/civix";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_path_civixDocumentId = "a2c6f8d14d9bddf";
		Object request0_path_aspectId = "ecb";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("civixDocumentId" , request0_path_civixDocumentId);
		request0.pathParam("aspectId" , request0_path_aspectId);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/content/{aspectId}/{civixDocumentId}");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/content/{aspectId}/{civixDocumentId}_20240411160015295()  throws JSONException{
		test0();
	}
}
