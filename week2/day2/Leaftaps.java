package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sankareswari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ayyappan");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Tester");
	driver.findElement(By.className("smallSubmit")).click();
	driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10244");
	String title=driver.getTitle();
	System.out.println(title);
	String expectedTitle="View Lead | opentaps CRM";
	if(title.equals(expectedTitle))
		System.out.println("Title is correct");
	else
		System.out.println("Title is incorrect");
	driver.close();
	}

}
