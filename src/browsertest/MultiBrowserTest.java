package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 1. Set up MultiBrowser
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = " http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
        } else {
            System.out.println("Wrong Browser name");
        }

        //open URL
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current Url" + currentUrl);

        //Print the page source
        System.out.println("The page source :"  + driver.getPageSource());

        //Enter the email in the email field.
        WebElement emailId = driver.findElement(By.name("username"));
        emailId.sendKeys("abc123@gmail.com");

        //enter the password in the password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("xyz123");

        //Click on the Login Button.
        WebElement login = driver.findElement(By.className("radius"));
        login.click();

        //Print the current URL
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser.
        driver.quit();

    }


}
