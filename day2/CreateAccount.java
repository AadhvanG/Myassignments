package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount{
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
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Softeon");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("21");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.id("numberEmployees")).sendKeys("21");
driver.findElement(By.className("smallSubmit")).click();

String title = driver.getTitle();
System.out.println(title +" Account Created");
Thread.sleep(6000);
driver.close();
}
}