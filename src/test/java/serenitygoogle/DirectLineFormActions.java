package serenitygoogle;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class DirectLineFormActions extends UIInteractions {

    //Declaration and access to page components
    DirectLineFormElements directLineForm;

    @Step("Navigate to Home Page")
    public void toHomePage(){
        openUrl(TestData.DIRECTLINE_URL);
    }

    @Step("Check First Heading")
    public String getFirstHeading(){
        return directLineForm.section__heading.getText();
    }

    public void acceptCookies(){
        find(directLineForm.cookies).click();
    }

    @Step("Enter Registration")
    public void enterRegistration(){
        find(directLineForm.regSearch).sendKeys(TestData.TEST_REG);
        find(directLineForm.findButton).click();
    }

    @Step("Interact with Information Button")
    public String interactInformationButton(){
        find(directLineForm.modifiedHintButton).click();
        return find(directLineForm.modifiedHintText).getText();
    }

    @Step("Interacting with the radio buttons")
    public void interactWithButtons(){
        //Go through the buttons loaded testing that they work
        find(directLineForm.isYourCarYes).click();
//        find(directLineForm.isYourCarNo).click();
//
//        find(directLineForm.isCar).click();
//        find(directLineForm.isVan).click();
    }
}
