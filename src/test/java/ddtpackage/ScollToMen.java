package ddtpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.time.Duration;

public class ScollToMen
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().fullscreen();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

            driver.get("https://www.shoppersstack.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

            Thread.sleep(4000);

            org.openqa.selenium.WebElement heading = driver.findElement(By.xpath("//h1[text()='Featured Products']"));

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("arguments[0].scrollIntoView(false)",heading);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
