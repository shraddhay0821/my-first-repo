package seleniumfirst;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(3000);
		List<WebElement> listOfElements = driver.findElements(By.tagName("a"));
		System.out.println(listOfElements.size());
		Thread.sleep(3000);
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.name("add-to-cart")).click();
	    Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Shraddha");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Yadav");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("101");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
	   driver.quit();
	}

}
