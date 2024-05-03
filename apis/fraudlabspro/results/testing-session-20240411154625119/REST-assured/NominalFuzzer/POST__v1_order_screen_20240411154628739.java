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
@Order(28)
public class POST_/v1/order/screen_20240411154628739{

String baseURL ="https://api.fraudlabspro.com";

	private void test0() throws JSONException{
		//OPERATION 0
		//Parameter initialization
		Object request0_query_ship_city = null;
		Object request0_query_format = null;
		Object request0_query_department = null;
		Object request0_query_bill_addr = null;
		Object request0_query_email_hash = null;
		Object request0_query_ship_country = null;
		Object request0_query_bill_zip_code = null;
		Object request0_query_currency = null;
		Object request0_query_user_order_id = "agoge";
		Object request0_query_key = "lx";
		Object request0_query_ship_state = null;
		Object request0_query_email = null;
		Object request0_query_amount = null;
		Object request0_query_first_name = null;
		Object request0_query_bin_no = null;
		Object request0_query_user_order_memo = null;
		Object request0_query_ship_addr = null;
		Object request0_query_username_hash = null;
		Object request0_query_cvv_result = null;
		Object request0_query_user_phone = null;
		Object request0_query_bill_city = null;
		Object request0_query_last_name = null;
		Object request0_query_bill_country = null;
		Object request0_query_bill_state = null;
		Object request0_query_quantity = null;
		Object request0_query_card_hash = null;
		Object request0_query_flp_checksum = null;
		Object request0_query_avs_result = null;
		Object request0_query_email_domain = null;
		Object request0_query_ship_zip_code = null;
		Object request0_query_ip = "deep-breasted";
		Object request0_query_password_hash = null;
		Object request0_query_payment_mode = null;
		//Build request
 		RequestSpecification request0 = RestAssured.given();
		request0.queryParam("ship_city" , request0_query_ship_city);
		request0.queryParam("format" , request0_query_format);
		request0.queryParam("department" , request0_query_department);
		request0.queryParam("bill_addr" , request0_query_bill_addr);
		request0.queryParam("email_hash" , request0_query_email_hash);
		request0.queryParam("ship_country" , request0_query_ship_country);
		request0.queryParam("bill_zip_code" , request0_query_bill_zip_code);
		request0.queryParam("currency" , request0_query_currency);
		request0.queryParam("user_order_id" , request0_query_user_order_id);
		request0.queryParam("key" , request0_query_key);
		request0.queryParam("ship_state" , request0_query_ship_state);
		request0.queryParam("email" , request0_query_email);
		request0.queryParam("amount" , request0_query_amount);
		request0.queryParam("first_name" , request0_query_first_name);
		request0.queryParam("bin_no" , request0_query_bin_no);
		request0.queryParam("user_order_memo" , request0_query_user_order_memo);
		request0.queryParam("ship_addr" , request0_query_ship_addr);
		request0.queryParam("username_hash" , request0_query_username_hash);
		request0.queryParam("cvv_result" , request0_query_cvv_result);
		request0.queryParam("user_phone" , request0_query_user_phone);
		request0.queryParam("bill_city" , request0_query_bill_city);
		request0.queryParam("last_name" , request0_query_last_name);
		request0.queryParam("bill_country" , request0_query_bill_country);
		request0.queryParam("bill_state" , request0_query_bill_state);
		request0.queryParam("quantity" , request0_query_quantity);
		request0.queryParam("card_hash" , request0_query_card_hash);
		request0.queryParam("flp_checksum" , request0_query_flp_checksum);
		request0.queryParam("avs_result" , request0_query_avs_result);
		request0.queryParam("email_domain" , request0_query_email_domain);
		request0.queryParam("ship_zip_code" , request0_query_ship_zip_code);
		request0.queryParam("ip" , request0_query_ip);
		request0.queryParam("password_hash" , request0_query_password_hash);
		request0.queryParam("payment_mode" , request0_query_payment_mode);
		//Build Response
		Response response0 = request0.when().post(baseURL+"/v1/order/screen");
		Assertions.assertFalse(response0.getStatusCode()>=500,"StatusCode 5xx: The test sequence was not executed successfully.");
	}
	@Test
	public void test_POST_/v1/order/screen_20240411154628739()  throws JSONException{
		test0();
	}
}
