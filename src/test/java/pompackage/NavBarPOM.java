package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarPOM
{
    private By companyLogo = By.xpath("//a[@id='brandLogoLink']");
    private By pharmacyLink = By.xpath("//a[@id='navPharmacy']");
    private By consultDoctorsLink = By.xpath("//a[@id='navDoctors']");
    private By labTestLink = By.xpath("//a[@id='navDiagnostics']");
    private By healthStoreLink = By.xpath("//a[@id='navStore']");
    private By searchInputField = By.xpath("//input[@id='globalSearchInput']");
    private By searchButton = By.xpath("//button[@id='globalSearchButton']");
    private By cartLink = By.xpath("//a[@id='navCart']");
    private By logInButton = By.xpath("//a[@id='navLogin']");
    private By registerButton = By.xpath("//a[@id='navRegister']");

    WebDriver driver;

    public NavBarPOM(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement getCompanyLogo() {
        return driver.findElement(companyLogo);
    }

    public WebElement getPharmacyLink() {
        return driver.findElement(pharmacyLink);
    }

    public WebElement getConsultDoctorsLink() {
        return driver.findElement(consultDoctorsLink);
    }

    public WebElement getLabTestLink() {
        return driver.findElement(labTestLink);
    }

    public WebElement getHealthStoreLink() {
        return driver.findElement(healthStoreLink);
    }

    public WebElement getSearchInputField() {
        return driver.findElement(searchInputField);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }

    public WebElement getCartLink() {
        return driver.findElement(cartLink);
    }

    public WebElement getLogInButton() {
        return driver.findElement(logInButton);
    }

    public WebElement getRegisterButton() {
        return driver.findElement(registerButton);
    }

    public void clickOnCompanyLogo()
    {
        getCompanyLogo().click();
    }

    public void clickOnPharmacyLink()
    {
        getPharmacyLink().click();
    }

    public void clickOnConsultDoctorsLink()
    {
        getConsultDoctorsLink().click();
    }

    public void clickOnLabTestLink()
    {
        getLabTestLink().click();
    }

    public void clickOnHealthStoreLink()
    {
        getHealthStoreLink().click();
    }

    public void searchForMedicineAndDoctor(String data)
    {
        getSearchInputField().sendKeys(data);
    }

    public void clickOnSearchButton()
    {
        getSearchButton().click();
    }

    public void clickOnCartIcon()
    {
        getCartLink().click();
    }

    public String getCartItemNumber()
    {
        return getCartLink().findElement(By.xpath("./descendant::span")).getText();
    }

    public void clickOnLoginButton()
    {
        getLogInButton().click();
    }

    public void clickOnRegisterButton()
    {
        getRegisterButton().click();
    }
}
