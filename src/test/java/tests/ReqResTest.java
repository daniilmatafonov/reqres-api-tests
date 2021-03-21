package tests;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ReqResTest extends BaseTest {

    @Test
    public void userNotFound() {
        final Response validatableResponse = given().spec(requestSpecification)
                .get("usernotfound/100500").andReturn();
        assertThat(validatableResponse.getStatusCode(), equalTo(HttpStatus.SC_NOT_FOUND));
    }
}
