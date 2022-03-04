package serenitygoogle;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;


public class DirectLineFormElements extends PageObject {

    //Creating objects from the webpage to interact withc
    //HEADING
    @FindBy(className="section__heading")
    public WebElementFacade section__heading;

    public By cookies = By.id("onetrust-accept-btn-handler");

    //Registration
    public By regSearch = By.id("regSearch");
    public By findButton = By.id("find-reg");


    @FindBy(className = "vehicleModified-No")
    public WebElementFacade vehModNo;

    @FindBy(xpath = "/html/body/app-root/main/div/app-quote/app-journey/app-your-car/section/div/dlg-field[3]/fieldset/dlg-hint/button")
    public WebElementFacade modifiedHint;

    @FindBy(className = "dlg-hint__text")
    public WebElementFacade modifiedHintText;

    //BUTTONS
    @FindBy(css="Label = isYourCar-No")
    public WebElementFacade isYourCarNo;

    @FindBy(css="Label = isYourCar-Yes")
    public WebElementFacade isYourCarYes;

    @FindBy(css="Label = isCarOrVan-Car")
    public WebElementFacade isCar;

    @FindBy(css="Label = isCarOrVan-Van")
    public WebElementFacade isVan;

}
