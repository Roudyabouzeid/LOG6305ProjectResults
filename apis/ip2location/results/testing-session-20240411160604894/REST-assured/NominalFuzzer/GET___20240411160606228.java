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
@Order(23)
public class GET_/_20240411160606228{

String baseURL ="https://api.ip2location.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_format = null;
		Object request0_query_key = "1-Ib-n_sKC9cSxyff7FfHPvYqj_oiO5hjTLGC2vrNHJzQV62umKwEozkcbJKHQEjhULX4CTq-8wGS5gtU7csHcviS0m5xHg1spwdYU7GrZ02Uk-yG3x5iP130YBnow==";
		Object request0_query_ip = "15.9.23.18";
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
	public void test_GET_/_20240411160606228()  throws JSONException{
		test0();
	}
}
