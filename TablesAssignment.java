package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesAssignment {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize WebDriver and open the URL
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        WebElement table = driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.)))
        
    }
}
