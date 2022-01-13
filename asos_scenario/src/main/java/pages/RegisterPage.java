package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) { super(driver); }

    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "FirstName")
    private WebElement firstNameField;

    @FindBy(id = "LastName")
    private WebElement lastNameField;

    @FindBy(id = "Password")
    private WebElement passwordField;

    @FindBy(id = "BirthYear-error")
    private WebElement birthdayError;

    @FindBy(id = "register")
    private WebElement submitButton;

    @FindBy(id = "BirthDay")
    private WebElement birthdayDayButton;

    @FindBy(xpath = "//select[@id='BirthDay']//option[@value='3']")
    private WebElement birthdayDay;

    @FindBy(id = "BirthMonth")
    private WebElement birthdayMonthButton;

    @FindBy(xpath = "//select[@id='BirthMonth']//option[@value='3']")
    private WebElement birthdayMonth;

    @FindBy(id = "BirthYear")
    private WebElement birthdayYearButton;

    @FindBy(xpath = "//select[@id='BirthYear']//option[@value='1999']")
    private WebElement birthdayYear;

    @FindBy(id = "Password-error")
    private WebElement passwordError;

    public WebElement getPasswordError(){return passwordError;}

    public boolean passwordErrorIsDisplayed(){return passwordError.isDisplayed();}

    public WebElement getBirthdayDay(){return birthdayDay;}

    public WebElement getBirthdayDayButton(){return birthdayDayButton;}

    public WebElement getBirthdayMonthButton(){return birthdayMonthButton;}

    public WebElement getBirthdayMonth(){return birthdayMonth;}

    public WebElement getBirthdayYearButton(){return birthdayYearButton;}

    public WebElement getBirthdayYear(){return birthdayYear;}

    public void clickOnBirthdayYearButton(){birthdayMonthButton.click();}

    public void clickOnBirthdayYear(){birthdayYear.click();}

    public void clickOnBirthdayMonth(){birthdayMonth.click();}

    public void clickOnBirthdayMonthButton(){birthdayMonthButton.click();}

    public void clickOnBirthdayDay(){birthdayDay.click();}

    public void clickOnBirthdayDayButton(){birthdayDayButton.click();}

    public WebElement getSubmitButton(){return submitButton;}

    public void clickOnSubmitButton(){submitButton.click();}

    public WebElement getBirthdayError(){return birthdayError;}

    public boolean checkThatBirthdayErrorIsDisplayed(){return birthdayError.isDisplayed();}

    public WebElement getPasswordField(){return passwordField;}

    public void fillPasswordField(String password){passwordField.sendKeys(password);}

    public WebElement getLastNameField(){return lastNameField;}

    public void fillLastNameField(String lasrName){lastNameField.sendKeys(lasrName);}

    public WebElement getFirstNameField(){return firstNameField;}

    public void fillFirstNameField(String firstName){firstNameField.sendKeys(firstName);}

    public WebElement getEmailField(){return emailField;}

    public void fillEmailField(String email){emailField.sendKeys(email);}
}
