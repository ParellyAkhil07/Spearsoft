package com.spearsoftech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

    private WebDriver driver;
    public PageObjects (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Register']")
    private WebElement registerLink;

    @FindBy(linkText = "Log in")
    private WebElement logInLink;

    @FindBy(css = "#FirstName")
    private WebElement firstNameTxt;

    @FindBy(id = "gender-male")
    private WebElement genderMale;

    @FindBy(id = "LastName")
    private WebElement lastNameTxt;

    @FindBy(name = "DateOfBirthDay")
    private WebElement dobDay;

    @FindBy(name = "DateOfBirthMonth")
    private WebElement dobMonth;

    @FindBy(name = "DateOfBirthYear")
    private WebElement dobYear;

    @FindBy(xpath = "//label//following-sibling::input[@type='email']")
    private WebElement emailTxt;

    @FindBy(linkText = "Computers")
    private WebElement computersLink;

    @FindBy(id = "Company")
    private WebElement companyTxt;

    @FindBy(id = "Password")
    private WebElement passwordTxt;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordTxt;

    @FindBy(id = "register-button")
    private WebElement registerBtn;

    @FindBy(css = ".page.registration-result-page .result")
    private WebElement registrationSuccessMsg;

    @FindBy(css = ".register-continue-button")
    private WebElement continueBtn;

    @FindBy(linkText = "Log out")
    private WebElement logOutLink;

    @FindBy(id = "Email")
    private WebElement emailLoginTxt;

    @FindBy(xpath = "//*[@type='submit' and text()='Log in']")
    private WebElement loginBtn;

    public WebElement getRegisterLink() {
        return registerLink;
    }
    public WebElement getRegisterBtn() {
        return registerBtn;
    }

    public WebElement getLogInLink() {
        return logInLink;
    }

    public WebElement getFirstNameTxt() {
        return firstNameTxt;
    }

    public WebElement getGenderMale() {
        return genderMale;
    }

    public WebElement getLastNameTxt() {
        return lastNameTxt;
    }

    public WebElement getDobDay() {
        return dobDay;
    }

    public WebElement getDobMonth() {
        return dobMonth;
    }

    public WebElement getDobYear() {
        return dobYear;
    }

    public WebElement getEmailTxt() {
        return emailTxt;
    }
    public WebElement getComputersLink() {
        return computersLink;
    }

    public WebElement getCompanyTxt() {
        return companyTxt;
    }

    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    public WebElement getConfirmPasswordTxt() {
        return confirmPasswordTxt;
    }

    public WebElement getRegistrationSuccessMsg() {
        return registrationSuccessMsg;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public WebElement getLogOutLink() {
        return logOutLink;
    }

    public WebElement getEmailLoginTxt() {
        return emailLoginTxt;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}
