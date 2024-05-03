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
@Order(137)
public class getServiceAPI_20240411163751264{

String baseURL ="https://api.apis.guru/v2";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_path_service = "b8hjViIXfXRxOd7S2S";
		Object request0_path_api = "82.78.29.17";
		Object request0_path_provider = "stream-io-api.com";
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("service" , request0_path_service);
		request0.pathParam("api" , request0_path_api);
		request0.pathParam("provider" , request0_path_provider);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/specs/{provider}/{service}/{api}.json");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_getServiceAPI_20240411163751264()  throws JSONException{
		test0();
	}
}
