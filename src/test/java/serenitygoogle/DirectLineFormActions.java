package serenitygoogle;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DirectLineFormActions extends UIInteractions {

    //Declaration and access to page components
    DirectLineFormElements directLineForm;

    @Step("Navigate to Home Page")
    public void toHomePage(){
        openUrl(TestData.DIRECTLINE_URL);
    }

    @Step("Check First Heading")
    public String getFirstHeading(){
        return find(directLineForm.sectionHeading).getText();
    }

    public void acceptCookies(){
        find(directLineForm.cookies).click();
    }

    @Step("Enter Registration")
    public List<String> enterRegistration(String registration){
        //enter in the registration
        find(directLineForm.regSearch).sendKeys(registration);
        find(directLineForm.findButton).click();

        interactWithButtons();

        //Store the values of the test car
        List<String> carDetails = new ArrayList<>();
        carDetails.add(find(directLineForm.carTitle).getText());
        carDetails.add(find(directLineForm.carDescription).getText());

        return carDetails;
    }

    @Step("Interact with Information Button")
    public String interactInformationButton(){
        find(directLineForm.modifiedHintButton).click();
        return find(directLineForm.modifiedHintText).getText();
    }

    @Step("Interacting with Radio Buttons")
    public void interactWithButtons(){
        //Go through the buttons loaded testing that they work
        find(directLineForm.isYourCarYes).click();
        find(directLineForm.isYourCarNo).click();

        find(directLineForm.isCar).click();
        find(directLineForm.isVan).click();

        find(directLineForm.modYes).click();
        find(directLineForm.modNo).click();

        find(directLineForm.boughtYes).click();
        find(directLineForm.boughtNo).click();
    }

    @Step("Enter Car Value")
    public void enterCarValue(int value){
        find(directLineForm.carValue).sendKeys(String.valueOf(value));
    }

    @Step("Enter the currently registered keeper")
    public void enterRegisteredKeeper(String value){
        //Choose from the drop-down menu the keeper
        Select select = new Select(find(directLineForm.keeperSelector));
        select.selectByVisibleText(value);
    }

}
