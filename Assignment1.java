package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Johncena");
        driver.findElement(By.name("email")).sendKeys("johncena007@gmail.com");
        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("TripleH");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(StaticDropdown);
        dropdown.selectByIndex(1);
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@type='date']")).click();
        driver.findElement(By.name("bday")).sendKeys("02/02/1992");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
        
	}

}
