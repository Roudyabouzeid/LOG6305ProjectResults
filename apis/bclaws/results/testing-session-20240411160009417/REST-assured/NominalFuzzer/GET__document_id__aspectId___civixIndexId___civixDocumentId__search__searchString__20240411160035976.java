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
@Order(89)
public class GET_/document/id/{aspectId}/{civixIndexId}/{civixDocumentId}/search/{searchString}_20240411160035976{

String baseURL ="http://www.bclaws.ca/civix";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_path_searchString = "strong-flavored";
		Object request0_path_civixIndexId = "treetops";
		Object request0_path_aspectId = "oic";
		Object request0_path_civixDocumentId = "CGE";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("searchString" , request0_path_searchString);
		request0.pathParam("civixIndexId" , request0_path_civixIndexId);
		request0.pathParam("aspectId" , request0_path_aspectId);
		request0.pathParam("civixDocumentId" , request0_path_civixDocumentId);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/document/id/{aspectId}/{civixIndexId}/{civixDocumentId}/search/{searchString}");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/document/id/{aspectId}/{civixIndexId}/{civixDocumentId}/search/{searchString}_20240411160035976()  throws JSONException{
		test0();
	}
}
