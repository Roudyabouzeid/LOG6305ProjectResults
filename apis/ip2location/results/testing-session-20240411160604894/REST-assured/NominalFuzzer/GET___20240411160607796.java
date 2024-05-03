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
@Order(98)
public class GET_/_20240411160607796{

String baseURL ="https://api.ip2location.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_format = null;
		Object request0_query_key = "14:24:51";
		Object request0_query_ip = "baf2:fae8:6591:91f7:a71a:5573:b727:d73e";
		Object request0_query_package = null;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("format" , request0_query_format);
		request0.queryParam("key" , request0_query_key);
		request0.queryParam("ip" , request0_query_ip);
		request0.queryParam("package" , request0_query_package);
		//Build Response
		Response response0 = request0.when().get(baseURL+"/");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_GET_/_20240411160607796()  throws JSONException{
		test0();
	}
}
