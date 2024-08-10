package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Advancelocaters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akhil\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        //Static dropdown -- Currency
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        
        //Passenger dropdown
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for (int i =1;i<5;i++)
        {
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        //Dynamic Dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value = 'HBX']")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("(//a[@value='CJB']) [2]")).click();
        //ifnot index then we have to use parent - child !
        
        //CheckBox
        Assert.assertFalse((driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	
//      System.out.println((driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))).isSelected());
        Assert.assertTrue((driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))).isSelected());

        //Current date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //driver.close();
        
                
	}

}
