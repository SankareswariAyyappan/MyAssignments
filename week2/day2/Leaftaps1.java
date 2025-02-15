package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Sankareswari Ayyappan");
	driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
	driver.findElement(By.id("numberEmployees")).sendKeys("23");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.className("smallSubmit")).click();
	driver.get("http://leaftaps.com/crmsfa/control/viewAccount?partyId=10251");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String expectedTitle="Account Details | opentaps CRM";
	if(title.equals(expectedTitle))
		System.out.println("Title is correct");
	else
		System.out.println("Title is incorrect");
	driver.close();
	}

}
