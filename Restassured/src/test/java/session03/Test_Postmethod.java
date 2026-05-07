package session03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import net.minidev.json.JSONObject;
import io.restassured.http.ContentType;

public class Test_Postmethod {
	@Test
	public void test03() {
		JSONObject jsondata=new JSONObject();
		jsondata.put("name", "Neeraj");
		jsondata.put("job", "Tester");
		RestAssured.baseURI="https://fakestoreapi.com/users/52";
		RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON).
		body(jsondata.toJSONString()).
		when().
			patch().
		then().statusCode(200).log().all();
	}

}
