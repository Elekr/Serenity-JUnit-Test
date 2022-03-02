package serenitygoogle;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchDirectLine extends UIInteractions {

    @FindBy(className="section__heading")
    private WebElementFacade section__heading;

    @Step("Navigate to home page")
    public void toHomePage(){
        openUrl("https://www.directline.com/car/quote/your-car");
    }

    @Step("Check First Heading")
    public String getFirstHeading(){
        return section__heading.getText();
    }
}
