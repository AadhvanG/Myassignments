package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
		String text1 = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		driver.findElement(By.id("brandsRefinements"));
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();//sort
		driver.findElement(By.xpath("//a[text()=\"Newest Arrivals\"]")).click();//sort
		Thread.sleep(4000);
		String productname = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();//bag name
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base desktop-grid-content-view'])[1]")).click();//select bag 1
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Results: " + text1 );
		System.out.println("Bag brand:" + productname );
		System.out.println("Price:" + price );
		
		driver.close();
		
		
			}

}
