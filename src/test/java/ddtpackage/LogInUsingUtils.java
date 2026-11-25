package ddtpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitypackage.ActionsUtils;
import utilitypackage.BrowserUtils;
import utilitypackage.PropertyFileUtils;

public class LogInUsingUtils
{
    public static String browser;
    public static String url;
    public static String email;
    public static String password;

    public static ActionsUtils actionsUtils;
    public static BrowserUtils browserUtils;
    public static PropertyFileUtils propertyFileUtils;

    public static WebDriver driver;

    public static void main(String[] args)
    {
        try
        {
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

            actionsUtils = new ActionsUtils(driver);

            WebElement logInButton= driver.findElement(By.xpath("//a[@id='navLogin']"));

            actionsUtils.clickOnElement(logInButton);

            WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
            WebElement userNameField = driver.findElement(By.xpath("//input[@name='email']"));
            WebElement signInButton = driver.findElement(By.xpath("//button[@id='loginButton']"));

            actionsUtils.writeInInputField(userNameField,email);
            actionsUtils.writeInInputField(passwordField,password);
            actionsUtils.clickOnElement(signInButton);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
