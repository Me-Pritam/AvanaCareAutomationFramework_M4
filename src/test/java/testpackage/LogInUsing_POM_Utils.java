package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pompackage.LoginPagePOM;
import pompackage.NavBarPOM;
import utilitypackage.ActionsUtils;
import utilitypackage.BrowserUtils;
import utilitypackage.PropertyFileUtils;

public class LogInUsing_POM_Utils
{
    public static String browser;
    public static String url;
    public static String email;
    public static String password;

    public static ActionsUtils actionsUtils;
    public static BrowserUtils browserUtils;
    public static PropertyFileUtils propertyFileUtils;

    public static LoginPagePOM login;
    public static NavBarPOM navbar;


    public static WebDriver driver;

    public static void main(String[] args) {
        try {
            propertyFileUtils = new PropertyFileUtils();

            browser = propertyFileUtils.getValueOfKey("browser");
            url = propertyFileUtils.getValueOfKey("url");
            email = propertyFileUtils.getValueOfKey("email");
            password = propertyFileUtils.getValueOfKey("password");

            browserUtils = new BrowserUtils();

            browserUtils.openBrowser(browser);
            browserUtils.maximizeBrowser();
            browserUtils.waitForPageLoad(10);
            browserUtils.openUrl(url);
            browserUtils.waitForElementsLoad(10);

            driver = browserUtils.getDriver();

            navbar = new NavBarPOM(driver);
            login = new LoginPagePOM(driver);


            navbar.clickOnLoginButton();
            login.performLogIn(email,password);


          } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

