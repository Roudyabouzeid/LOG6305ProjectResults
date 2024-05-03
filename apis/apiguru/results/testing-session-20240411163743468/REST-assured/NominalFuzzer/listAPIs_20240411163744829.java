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
@Order(29)
public class listAPIs_20240411163744829{

String baseURL ="https://api.apis.guru/v2";

	private void test0() throws JSONException{
		//OPERATION 0
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		//Build Response
		Response response0 = request0.when().get(baseURL+"/list.json");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_listAPIs_20240411163744829()  throws JSONException{
		test0();
	}
}
