package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser{


public static void main(String[] args) throws InterruptedException {
	
	//Step1 : Declare browser driver
ChromeDriver driver=new ChromeDriver();
	//step3 : Maximize windows
driver.manage().window().maximize();
    //step2 : declare browser URL
driver.get("http:facebook.com");
	//step4 : closing the browser

driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");

driver.findElement(By.id("pass")).sendKeys("Tuna@321");

driver.findElement(By.name("login")).click();

String title = driver.getTitle();
System.out.println(title +" working fine");
Thread.sleep(3000);
driver.close();

}
}