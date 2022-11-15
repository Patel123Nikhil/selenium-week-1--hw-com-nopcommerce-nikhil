package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Pgae title is: " + title);
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
