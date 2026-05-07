package session05;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class ValidateResponseHeader {
	private Header[] headerList;

	@Test
	public void getSingleUser() {
		//Get request Specification
		RequestSpecification requestSpec= RestAssured.given();
		//Specify baseURI
		requestSpec.baseUri("https://fakestoreapi.com");
		requestSpec.basePath("/users/1");
		Response response=requestSpec.get();
		//validate response header
		String contentType=response.getHeader("Content-Type");
		System.out.println("Value of connection" +contentType); 
		//Read all the response headers attributes/key and print their values 
		Headers headersList = response.getHeaders();
		for(Header header : headersList) {
		    System.out.println("Key: " + header.getName() +
		                       " : " + header.getValue());
		    //Validate
		    Assert.assertEquals(contentType,
		    		"application/json; charset=utf-8",
		    		"Header content type mismatch");
		                       
		}
	}

}
