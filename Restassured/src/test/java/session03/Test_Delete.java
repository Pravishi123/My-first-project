package session03;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class Test_Delete {
	@Test
	public void test06() {
		RestAssured.baseURI="https://fakestoreapi.com/users/52";
		RestAssured.given().
		when().delete().
		then().statusCode(anyOf(is(200), is(204)));
		}

}
