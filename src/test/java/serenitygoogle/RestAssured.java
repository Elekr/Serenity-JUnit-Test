package serenitygoogle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RestAssured {

    @Test
    public void GetAPI() {
        //Getting the JSON string through rest assured
        String response = given().when().get(TestData.API).asString();
        System.out.println(response);

        Example example = given().when().get(TestData.API).then().extract().as(Example.class);
        System.out.println(example.title);
        System.out.println(example.id);

        List<String> list = new ArrayList();

    }
}
