package serenitygoogle;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;


public class DirectLineFormElements extends PageObject {

    //Creating objects from the webpage to interact with
    //HEADING
    @FindBy(className="section__heading")
    public WebElementFacade section__heading;

    public By cookies = By.id("onetrust-accept-btn-handler");

    //Registration
    public By regSearch = By.id("regSearch");
    public By findButton = By.id("find-reg");


    @FindBy(className = "vehicleModified-No")
    public WebElementFacade vehModNo;

    //Modified Hint
    public By modifiedHintButton = By.cssSelector("body > app-root > main > div > app-quote > app-journey > app-your-car > section > div > dlg-field:nth-child(4) > fieldset > dlg-hint > button");
    public By modifiedHintText = By.id("vehicleModified-hint");

    //Buttons
    public By isYourCarNo = By.cssSelector("label[for=isYourCar-No]");
    public By isYourCarYes = By.cssSelector("label[for=isYourCar-Yes]");
    public By isCar = By.cssSelector("label[for=isCarOrVan-Car]");
    public By isVan = By.cssSelector("label[for=isCarOrVan-Van]");


}
