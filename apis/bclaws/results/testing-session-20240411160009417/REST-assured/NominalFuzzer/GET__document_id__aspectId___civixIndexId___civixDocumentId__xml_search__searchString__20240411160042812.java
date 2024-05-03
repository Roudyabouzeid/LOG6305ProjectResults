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
@Order(114)
public class GET_/document/id/{aspectId}/{civixIndexId}/{civixDocumentId}/xml/search/{searchString}_20240411160042812{

String baseURL ="http://www.bclaws.ca/civix";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_path_aspectId = "bcgaz2";
		Object request0_path_civixDocumentId = "01009_01";
		Object request0_path_civixIndexId = "b3a4912e-f80b-47a5-a55b-7378604429d1";
		Object request0_path_searchString = "water";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("aspectId" , request0_path_aspectId);
		request0.pathParam("civixDocumentId" , request0_path_civixDocumentId);
		request0.pathParam("civixIndexId" , request0_path_civixIndexId);
		request0.pathParam("searchString" , request0_path_searchString);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/document/id/{aspectId}/{civixIndexId}/{civixDocumentId}/xml/search/{searchString}");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/document/id/{aspectId}/{civixIndexId}/{civixDocumentId}/xml/search/{searchString}_20240411160042812()  throws JSONException{
		test0();
	}
}