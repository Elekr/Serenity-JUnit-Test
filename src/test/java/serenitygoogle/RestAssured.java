package serenitygoogle;

import org.junit.jupiter.api.Test;

import java.util.*;

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


    }

    @Test
    public void Collections() {
        Stack<String> myList = new Stack<>();
        myList.push("Hello");
        myList.push("there");
        myList.push("poggers");
        myList.forEach((e)->{
            System.out.println(e);
        });

        Iterator iterator = myList.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        ArrayList<String> yourList = new ArrayList<>();
        yourList.add("poggers");
        Collections.reverse(myList);
        System.out.println(yourList.size());
        yourList.removeAll(myList);
        myList.clear();
        for(String e : yourList)
        {
            System.out.println(e);
        }
    }
}
