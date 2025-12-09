package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead{
public static void main(String[] args) throws InterruptedException {
	
ChromeOptions option = new ChromeOptions();
option.addArguments("--guest"); 
ChromeDriver driver = new ChromeDriver(option);

driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps");
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();//login
driver.findElement(By.id("label")).click();//
driver.findElement(By.className("x-panel-header")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhavan");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SofteonT");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AVP");
driver.findElement(By.name("submitButton")).click();

String title = driver.getTitle();
System.out.println(title +" Lead Created");
Thread.sleep(6000);
driver.close();
}
}