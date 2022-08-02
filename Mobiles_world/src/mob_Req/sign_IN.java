package mob_Req;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sign_IN {
	@Test
	public void Signin() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("manojmp");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Manoj@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		Thread.sleep(2000);
		driver.quit();
}    
}
