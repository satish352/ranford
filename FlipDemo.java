package f1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipDemo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\Selinium\\selenium\\Browers Dirvers\\google chrome\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("electronics");
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[2]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div[3]/div/div/form/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("satishgoud.mala@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/button")).click();
		Thread.sleep(2000);
		

	}
}
