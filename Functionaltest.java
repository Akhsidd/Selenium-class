package corejava;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionaltest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //array of strings
		String[] veggie = {"Cucumber","Beans"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        //In the list add the all the products
       List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
       
       //In the list using for loop we search for the product
        for(int i=0; i<products.size() ;i++)
        {
        	// saving the product into string
        	String name = products.get(i).getText();
        	
        	//converting array to array list
        	List<String> veggies = Arrays.asList(veggie);
        	
        	if(veggies.contains(name))
        	{
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		//break;
        	}
        	
        	
            
        }
	}

}
