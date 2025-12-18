package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
		Alert alert = driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		alert.dismiss();
		String text1 = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(text1);

		if (text1.equals("Hello Harry Potter! How are you today?")) {
			System.out.println("User clicked OK and respose is : "+ text1);
		}
			else {
				System.out.println("User clicked Cancel and respose is : "+ text1);
			}
		} 
		}
			
	
		
