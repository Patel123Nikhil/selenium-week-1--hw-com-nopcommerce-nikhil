package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source: " + driver.getPageSource());
        //Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type the email to email field
        emailField.sendKeys("nikhil123");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("ABCnikhil");
        //Close the browser
        driver.quit();
    }
}
