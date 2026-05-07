package session06;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateJsonResponseBody {

    @Test
    public void UserListResponseBody() {

        RequestSpecification requestSpec = RestAssured.given();

        requestSpec.baseUri("https://fakestoreapi.com");
        requestSpec.basePath("/users/1");

        Response response = requestSpec.get();
	ResponseBody responseBody = response.getBody();


        // Store response in String
        String responseString = responseBody.asString();

        // Print response
        System.out.println("Response Body:" + responseString);

        // Validate johnd exists
        Assert.assertEquals(responseString.contains("johnd"), true,
                "Check for presence of johnd");
        //name.firstname
        JsonPath js = response.jsonPath();

        String username = js.getString("username");

        System.out.println(username);

        Assert.assertEquals(username, "johnd");
    }
}