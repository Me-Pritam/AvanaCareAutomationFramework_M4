package utilitypackage;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserUtils
{
    public WebDriver driver;

    public void openBrowser(String browser)
    {
        switch (browser.toLowerCase())
        {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default: throw new InvalidArgumentException("Incorrect Browser Name");
        }
    }

    public WebDriver getDriver()
    {
        return  driver;
    }

    public void maximizeBrowser()
    {
        driver.manage().window().maximize();
    }

    public void openUrl(String url)
    {
        driver.get(url);
    }

    public void waitForPageLoad(int time)
    {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time));
    }

    public void waitForElementsLoad(int time)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public void closeBrowser()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
