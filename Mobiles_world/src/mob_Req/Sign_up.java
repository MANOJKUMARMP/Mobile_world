package mob_Req;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sign_up {
	WebDriver driver;
	@BeforeMethod
    public void signup() throws InterruptedException

{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("manojmp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("mmp1467@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Manoj@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03-01-1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-2']/input[@type='radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8970712707");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("whats up");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@type='Submit']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
}
	@Test
	public void Signin() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("manojmp");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Manoj@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		driver.quit();
}    
}
