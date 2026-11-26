package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarPOM
{
    private By companyLogo = By.xpath("//a[@id='brandLogoLink']");
    private By pharmacyLink = By.xpath("//a[@id='navPharmacy']");
    private By consultDoctorsLink = By.xpath("//a[@id='navDoctors']");

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

}
