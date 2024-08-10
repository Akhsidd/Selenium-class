package corejava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

    public static void main(String[] args) throws InterruptedException {
        // Setting up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Opening Rahul Shetty Academy login page
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();

        // Clicking on the link that opens a new window
        driver.findElement(By.cssSelector("a.blinkingText")).click();

        // Get window handles and switch to the child window
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

        // Perform operations on the child window
       System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
       driver.findElement(By.cssSelector("p[class ='im-para red']")).getText();
        // Rest of your code...
    }
}
