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
@Order(139)
public class GET_/search/{aspectId}/fullsearch_20240411160050467{

String baseURL ="http://www.bclaws.ca/civix";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_s = "Slavize";
		Object request0_query_q = "uva";
		Object request0_query_nFrag = -245071234;
		Object request0_query_e = 20;
		Object request0_path_aspectId = "bcgaz2";
		Object request0_query_lFrag = 32;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("aspectId" , request0_path_aspectId);
		request0.queryParam("s" , request0_query_s);
		request0.queryParam("q" , request0_query_q);
		request0.queryParam("nFrag" , request0_query_nFrag);
		request0.queryParam("e" , request0_query_e);
		request0.queryParam("lFrag" , request0_query_lFrag);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/search/{aspectId}/fullsearch");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/search/{aspectId}/fullsearch_20240411160050467()  throws JSONException{
		test0();
	}
}
