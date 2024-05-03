package ErrorFuzzer;

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
@Order(95)
public class GET_/bng2latlong/{easting}/{northing}_20240411160348400{

String baseURL ="https://api.getthedata.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_path_northing = "chylaqueous";
		Object request0_path_easting = 326897;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.pathParam("northing" , request0_path_northing);
		request0.pathParam("easting" , request0_path_easting);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/bng2latlong/{easting}/{northing}");
		String response0_response_body = response0.getBody().asString();

		Assertions.assertFalse(response0.getStatusCode()<=299,"StatusCode 2xx: The test sequence was not executed successfully.");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/bng2latlong/{easting}/{northing}_20240411160348400()  throws JSONException{
		test0();
	}
}
