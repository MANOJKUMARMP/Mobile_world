package mob_Req;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Con_us {

	@Test
    public void contact() throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net");
        driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(1000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("manojmp");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mmp1467@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8970712707");
        Thread.sleep(1000);
        driver.findElement(By.name("message")).sendKeys("Hi Qudos");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();
}
}
