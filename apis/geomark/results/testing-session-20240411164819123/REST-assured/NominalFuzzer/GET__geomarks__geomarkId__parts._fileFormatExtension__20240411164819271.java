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
@Order(2)
public class GET_/geomarks/{geomarkId}/parts.{fileFormatExtension}_20240411164819271{

String baseURL ="https://apps.gov.bc.ca/pub/geomark";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_srid = null;
		Object request0_path_fileFormatExtension = "shp";
		Object request0_path_geomarkId = "gm-abcdefghijklmnopqrstuv0bcislands";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("fileFormatExtension" , request0_path_fileFormatExtension);
		request0.pathParam("geomarkId" , request0_path_geomarkId);
		request0.queryParam("srid" , request0_query_srid);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/geomarks/{geomarkId}/parts.{fileFormatExtension}");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/geomarks/{geomarkId}/parts.{fileFormatExtension}_20240411164819271()  throws JSONException{
		test0();
	}
}
