package serenitygoogle;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WhenPageOpens;

public class SearchDirectLine extends UIInteractions {

    //Creating objects from the webpage to interact with
    @FindBy(className="section__heading")
    private WebElementFacade section__heading;

    @FindBy(id="regSearch")
    private WebElementFacade regSearch;

    @FindBy(className = "vehicleModified-No")
    private WebElementFacade vehModNo;

    @FindBy(className = "dlg-hint__text")
    private WebElementFacade dlgHintText;



    @Step("Navigate to Home Page")
    public void toHomePage(){
        openUrl("https://www.directline.com/car/quote/your-car");
    }

    @Step("Check First Heading")
    public String getFirstHeading(){
        return section__heading.getText();
    }

    @Step("Enter Registration")
    public void enterRegistration(){regSearch.sendKeys("PR24 BRW");}

    @Step("Interact with Information Button")
    public String interactInformationButton(){

        vehModNo.click();
        element(dlgHintText).waitUntilVisible();
        return dlgHintText.getText();
    }

//    @WhenPageOpens
//    public void waitUntilButtonAppears() {
//        element(vehModNo).waitUntilVisible();
//    }
}
