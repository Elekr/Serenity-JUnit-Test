package serenitygoogle;

import net.serenitybdd.junit5.SerenityJUnit5Extension;

import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

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
        searchDL.acceptCookies();
    }

    @Test
    public void confirmingCorrectPage(){
        //Check that the website is correct
        Assertions.assertEquals(TestData.HEADER, searchDL.getFirstHeading(), "Heading doesn't match");
    }

    @Test
    public void interactingWithSite(){
        //Goes through sunny day scenario of using the form

        //Testing the hint provides the correct information
        String text = searchDL.interactInformationButton();
        Assertions.assertEquals(TestData.MODIFIED_HINT,text);

        //Entering the test data
        List<String> detailsReturned = searchDL.enterRegistration(TestData.TEST_REG);

        Assertions.assertEquals("NIU NQI",detailsReturned.get(0));
        Assertions.assertEquals("2021, 0CC, SCOOTER, AUTOMATIC, ELECTRIC", detailsReturned.get(1));

        //Testing that the buttons are interactive
        searchDL.interactWithButtons();

        //Enter a value for the car
        searchDL.enterCarValue(TestData.TEST_CAR_VALUE);

        //Enter who will be the car's keeper
        searchDL.enterRegisteredKeeper(TestData.Keeper.YOU.toString());
    }
}
