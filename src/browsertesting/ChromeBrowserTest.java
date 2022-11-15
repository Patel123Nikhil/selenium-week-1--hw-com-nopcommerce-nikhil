package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String [] args){
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Pgae title is: " + title);
        //Get current URL
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source: " + driver.getPageSource());
        //Find the email field
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type the email to email filed
        emailField.sendKeys("test123@gmail.com");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        //Type the password in password field
        passwordField.sendKeys("abc123");
        //Close the browser
        driver.quit();


    }
}
