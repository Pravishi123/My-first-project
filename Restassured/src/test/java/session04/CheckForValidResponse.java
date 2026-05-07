package session04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CheckForValidResponse {
	@Test
	public void GetSingleUSer() {
		RestAssured.baseURI="https://fakestoreapi.com/users/1";
		RequestSpecification requestSpec=RestAssured.given();
		Response response=requestSpec.get();
		int statusCode=response.getStatusCode();
	Assert.assertEquals(statusCode/*actual status code*/,200/*expected status code*/,"Correct status code receive");
	String statusLine=response.getStatusLine();
	Assert.assertEquals(statusLine, "HTTP/1.1 200 OK", "Incorrect status Line return");
	}
	

}

