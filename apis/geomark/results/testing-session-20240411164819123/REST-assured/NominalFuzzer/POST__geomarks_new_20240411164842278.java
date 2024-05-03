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
@Order(126)
public class POST_/geomarks/new_20240411164842278{

String baseURL ="https://apps.gov.bc.ca/pub/geomark";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		JSONObject request0_request_body = new JSONObject();
		Object request0_request_body_allowOverlap = null;
		request0_request_body.put("allowOverlap" , request0_request_body_allowOverlap);
		Object request0_request_body_body = null;
		request0_request_body.put("body" , request0_request_body_body);
		Object request0_request_body_bufferCap = null;
		request0_request_body.put("bufferCap" , request0_request_body_bufferCap);
		Object request0_request_body_bufferJoin = null;
		request0_request_body.put("bufferJoin" , request0_request_body_bufferJoin);
		Object request0_request_body_bufferMetres = null;
		request0_request_body.put("bufferMetres" , request0_request_body_bufferMetres);
		Object request0_request_body_bufferMitreLimit = null;
		request0_request_body.put("bufferMitreLimit" , request0_request_body_bufferMitreLimit);
		Object request0_request_body_bufferSegments = null;
		request0_request_body.put("bufferSegments" , request0_request_body_bufferSegments);
		Object request0_request_body_callback = null;
		request0_request_body.put("callback" , request0_request_body_callback);
		Object request0_request_body_failureRedirectUrl = null;
		request0_request_body.put("failureRedirectUrl" , request0_request_body_failureRedirectUrl);
		Object request0_request_body_format = null;
		request0_request_body.put("format" , request0_request_body_format);
		Object request0_request_body_multiple = null;
		request0_request_body.put("multiple" , request0_request_body_multiple);
		Object request0_request_body_redirectUrl = "http%3A%2F%2Fqxhatga.co.uk%2F";
		request0_request_body.put("redirectUrl" , request0_request_body_redirectUrl);
		Object request0_request_body_resultFormat = "gpkg";
		request0_request_body.put("resultFormat" , request0_request_body_resultFormat);
		Object request0_request_body_srid = null;
		request0_request_body.put("srid" , request0_request_body_srid);
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.contentType(ContentType.JSON).body(request0_request_body.toString());
		//Build Response
		Response response0 = request0.when().post(baseURL+"/geomarks/new");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_POST_/geomarks/new_20240411164842278()  throws JSONException{
		test0();
	}
}
