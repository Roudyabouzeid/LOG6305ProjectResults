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
@Order(117)
public class POST_/geomarks/copy_20240411164838171{

String baseURL ="https://apps.gov.bc.ca/pub/geomark";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_geomarkUrl = "https://apps.gov.bc.ca/pub/geomark/geomarks/gm-abcdefghijklmnopqrstuv0bcislands";
		Object request0_query_redirectUrl = null;
		Object request0_query_bufferJoin = null;
		Object request0_query_bufferMitreLimit = null;
		Object request0_query_bufferCap = null;
		Object request0_query_resultFormat = null;
		Object request0_query_failureRedirectUrl = null;
		Object request0_query_callback = null;
		Object request0_query_bufferSegments = null;
		Object request0_query_bufferMetres = null;
		Object request0_query_allowOverlap = null;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("geomarkUrl" , request0_query_geomarkUrl);
		request0.queryParam("redirectUrl" , request0_query_redirectUrl);
		request0.queryParam("bufferJoin" , request0_query_bufferJoin);
		request0.queryParam("bufferMitreLimit" , request0_query_bufferMitreLimit);
		request0.queryParam("bufferCap" , request0_query_bufferCap);
		request0.queryParam("resultFormat" , request0_query_resultFormat);
		request0.queryParam("failureRedirectUrl" , request0_query_failureRedirectUrl);
		request0.queryParam("callback" , request0_query_callback);
		request0.queryParam("bufferSegments" , request0_query_bufferSegments);
		request0.queryParam("bufferMetres" , request0_query_bufferMetres);
		request0.queryParam("allowOverlap" , request0_query_allowOverlap);
		//Build Response
		Response response0 = request0.when().post(baseURL+"/geomarks/copy");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_POST_/geomarks/copy_20240411164838171()  throws JSONException{
		test0();
	}
}
