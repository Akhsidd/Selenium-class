package corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
	
public class Section12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");	
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("window.scrollBy(0,500)");
       //Thread.sleep(3000);)
        						//choosing a particular column in a table 
        List<WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum =0;
        						//changing string to INT 
        for(int i=0;i<values.size();i++)
        {
        	sum = sum + Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        driver.findElement(By.cssSelector(".totalAmount")).getText();
	}

}