package corejava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

    public static void main(String[] args) {
        // Set system property to use ChromeDriver
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("jkdnciowdndiu");
        driver.findElement(By.name("pass")).sendKeys("abcd");
        driver.findElement(By.id("loginbutton")).click();
        System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email or mobile number']")).sendKeys("sidd@gmail.com	");
        driver.findElement(By.xpath("//button[@id='did_submit']")).click();
        //driver.close();	
    }

}

