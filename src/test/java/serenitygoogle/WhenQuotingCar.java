package serenitygoogle;

import net.serenitybdd.junit5.SerenityJUnit5Extension;

import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenQuotingCar {

    @Managed()
    WebDriver driver;

    //Page object set up to hold navigation of the site (Serenity automatically creates an instance)
    DirectLineFormActions searchDL;

    @BeforeEach
    public void BeforeEach(){
        //Navigate to the DirectLine Homepage
        searchDL.toHomePage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void confirmingCorrectPage(){
        //Check that the website is correct
        Assertions.assertEquals("About the car", searchDL.getFirstHeading(), "Heading doesn't match");
    }

    @Test
    public void interactingWithSite(){

        searchDL.enterRegistration();

//        String text = searchDL.interactInformationButton();
//        System.out.println(text);
    }
}
