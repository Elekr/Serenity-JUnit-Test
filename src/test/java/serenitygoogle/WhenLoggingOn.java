package serenitygoogle;

import net.serenitybdd.junit5.SerenityJUnit5Extension;

import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn {

    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    //Page object set up to hold navigation of the site
    SearchDirectLine searchDL;

    @Test
    public void confirmingCorrectPage(){
        searchDL.toHomePage();
        Assert.assertEquals("Heading doesn't match","About the car", searchDL.getFirstHeading());
    }
}
