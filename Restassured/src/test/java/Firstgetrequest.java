import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Firstgetrequest {

    String token = null;

    // 🔹 Token generate method
    public String getToken() {

        if (token == null) {

            Response loginResponse =
                    RestAssured
                    .given()
                    .baseUri("http://tech-shop.techsaga.live")
                    .header("Content-Type", "application/json")
                    .body("{\"email\":\"admin12@techsaga.net\",\"password\":\"Admin@1234\"}")
                    .post("api/v1/admin-auth");

            System.out.println("Login Response:");
            System.out.println(loginResponse.asPrettyString());

            if (loginResponse.getStatusCode() != 200) {
                System.out.println("Login failed ❌");
                return null;
            }

            // 🔹 Token extract (adjust if needed)
            token = loginResponse.jsonPath().getString("token");

            System.out.println("Generated Token: " + token);
        }

        return token;
    }

    @Test
    void Testcase1(){

        // 🔹 Step 1: Token lo
        String tokenValue = getToken();

        if (tokenValue == null) {
            System.out.println("Token not generated ❌");
            return;
        }

        // 🔹 Step 2: Customers API hit
        Response customerResponse =
                RestAssured
                .given()
                .baseUri("http://tech-shop.techsaga.live")
                .header("Authorization", "Bearer " + tokenValue)
                .get("api/v1/customers");

        // 🔥 Step 3: Token expire handle
        if (customerResponse.getStatusCode() == 401 || customerResponse.getStatusCode() == 403) {

            System.out.println("Token expired 🔁 regenerating...");

            token = null; // reset token

            tokenValue = getToken(); // new token

            customerResponse =
                    RestAssured
                    .given()
                    .baseUri("http://tech-shop.techsaga.live")
                    .header("Authorization", "Bearer " + tokenValue)
                    .get("api/v1/customers");
        }

        // 🔹 Final Output
        System.out.println("\nCustomers Response:");
        System.out.println(customerResponse.asPrettyString());
        System.out.println("Status Code: " + customerResponse.getStatusCode());
    }
}