package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVR {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("//span[text()=\"Cinema\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Select Cinema\"]")).click();
		driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn\"]")).click();//book button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Accept\"]")).click();//accept terms
		driver.findElement(By.xpath("//span[@class=\"seat-current-pvr\"]")).click();//select seats
		Thread.sleep(1000);
		String attribute = driver.findElement(By.xpath("//div[@class=\"seat-info\"]")).getText();//get seat info
		String attribute1 = driver.findElement(By.xpath("//div[@class=\"summary-movies-content\"]")).getText();//get movie name
		System.out.println("Booking Summary:" );
		System.out.println("Movie Name: " +attribute1);
		System.out.println(attribute);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"sc-bbbBoY kbsOBB btn-proceeded\"]")).click();//click proceed
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();//closing non-modal alert
		String title = driver.getTitle();
		System.out.println("Theatre Name: " +title);
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
