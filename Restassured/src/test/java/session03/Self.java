package session03;

import org.testng.annotations.Test;

//import com.aventstack.extentreports.util.Assert;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Self{
	@Test
	public void test01()
{
		Response response=RestAssured.get("https://fakestoreapi.com/users");
System.out.println("Response code:"+response.getStatusCode());
System.out.println("\nResponse response body:");
response.getBody().prettyPrint();
System.out.println("Response Time:"+response.getTime());   
System.out.println("Response Header:"+response.getHeader("Content-Type")); 

//validate status code
//Expected status code = 200ok

int expectedStatusCode=200;
int ActualStatusCode=response.getStatusCode();
Assert.assertEquals(expectedStatusCode,ActualStatusCode);


}
	@Test
	
	public void test02()
{
	//given when then
		
		RestAssured.baseURI="https://fakestoreapi.com";
		RestAssured.given().queryParam("user").when().get().then().statusCode(200);
		
}
	
	
}