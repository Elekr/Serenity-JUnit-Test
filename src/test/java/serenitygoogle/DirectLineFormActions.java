package serenitygoogle;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class DirectLineFormActions extends UIInteractions {

    //Declaration and access to page components
    DirectLineFormElements directLineForm;

    @Step("Navigate to Home Page")
    public void toHomePage(){
        openUrl("https://www.directline.com/car/quote/your-car");
    }

    @Step("Check First Heading")
    public String getFirstHeading(){
        return directLineForm.section__heading.getText();
    }

    @Step("Enter Registration")
    public void enterRegistration(){
        find(directLineForm.cookies).click();
        find(directLineForm.regSearch).sendKeys("BD14 FRA");
        find(directLineForm.findButton).click();

//        //Go through the buttons loaded testing that they work
//        directLineForm.isYourCarYes.click();
//        directLineForm.isYourCarNo.click();
//
//        directLineForm.isCar.click();
//        directLineForm.isVan.click();
    }

    @Step("Interact with Information Button")
    public String interactInformationButton(){

        directLineForm.modifiedHint.click();
        return directLineForm.modifiedHintText.getText();
    }
}
