package com.spearsoftech.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.spearsoftech.pages.BasePage.*;

public class PageActions extends PageObjects {


    private BasePage basePage;
    public PageActions(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    public void registerUser(String email, String pwd) {

        basePage.explicitWait(30).until(ExpectedConditions.elementToBeClickable(getRegisterLink()));
        getRegisterLink().click();
        getGenderMale().click();
        getFirstNameTxt().sendKeys(faker.name().firstName());
        getLastNameTxt().sendKeys(faker.name().lastName());
        basePage.selectDropdownValue(getDobDay(), "1");
        basePage.selectDropdownValue(getDobMonth(), basePage.getRandomMonth());
        basePage.selectDropdownValue(getDobYear(), "2000");
        getEmailTxt().sendKeys(email);
        getCompanyTxt().sendKeys(faker.company().name());
        getPasswordTxt().sendKeys(pwd);
        getConfirmPasswordTxt().sendKeys(pwd);
        getRegisterBtn().click();
    }

    public void loginUser(String email, String pwd) {

        basePage.explicitWait(30).until(ExpectedConditions.elementToBeClickable(getLogInLink()));
        getLogInLink().click();
        getEmailLoginTxt().sendKeys(email);
        getPasswordTxt().sendKeys(pwd);
        getLoginBtn().click();
    }
    public void logOutUser() {

        basePage.explicitWait(30).until(ExpectedConditions.elementToBeClickable(getLogOutLink()));
        getLogOutLink().click();
    }
}
