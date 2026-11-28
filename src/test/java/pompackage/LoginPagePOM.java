package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM
{
    @FindBy(xpath = "//button[@id='patientTab']")
    private WebElement patientButton;

    @FindBy(xpath = "//button[@id='adminTab']")
    private WebElement adminButton;

    @FindBy(xpath = "//input[@id='emailInput']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='passwordInput']")
    private WebElement passwordField;

    @FindBy(xpath = "//a[@id='forgotPasswordLink']")
    private WebElement forgetPasswordLink;

    @FindBy(xpath = "//span[@id='togglePasswordBtn']")
    private WebElement showPasswordButton;

    @FindBy(xpath = "//button[@id='loginButton']")
    private WebElement signButton;

    @FindBy(xpath = "//input[@id='rememberMeCheckbox']")
    private WebElement remeberMeButton;

    public LoginPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getPatientButton() {
        return patientButton;
    }

    public WebElement getAdminButton() {
        return adminButton;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getForgetPasswordLink() {
        return forgetPasswordLink;
    }

    public WebElement getShowPasswordButton() {
        return showPasswordButton;
    }

    public WebElement getSignButton() {
        return signButton;
    }

    public WebElement getRememberMeButton() {
        return remeberMeButton;
    }

    public void performLogIn(String email, String password)
    {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSignButton().click();
    }
}
