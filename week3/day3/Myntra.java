package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("bags",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();

		Thread.sleep(5000);
		List<WebElement> list1=  driver.findElements(By.xpath("//h3[@class=\"product-brand\"]"));
		
		List<String> list3 = new ArrayList<String>();
		
		for (int i = 0; i < list1.size(); i++) {
			String list2 = list1.get(i).getText();

			list3.add(list2);
			}
		
		Set<String> slist = new LinkedHashSet<String>();
		slist.addAll(list3);
		
		List<WebElement> name1=  driver.findElements(By.xpath("//h4[@class=\"product-product\"]"));
		
		List<String> name3 = new ArrayList<String>();
		
		for (int i = 0; i < name1.size(); i++) {
			String name2 = name1.get(i).getText();

			name3.add(name2);
			}
	
		
		int size= list3.size();
        int size1= slist.size();
		System.out.println("No of brands: "+size1);
		System.out.println("No of products: "+size);
		System.out.println(slist);
		System.out.println(name3);
	}
}
