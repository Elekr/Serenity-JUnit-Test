package serenitygoogle;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestAssured {
    final String API = "https://jsonplaceholder.typicode.com/todos/1";

    @Test
    public void GetAPI() {
        //Getting the JSON string through rest assured
        String response = given().when().get(API).asString();
        System.out.println(response);

        Example example = given().when().get(API).then().extract().as(Example.class);
        System.out.println(example.title);
        System.out.println(example.id);
    }
}
