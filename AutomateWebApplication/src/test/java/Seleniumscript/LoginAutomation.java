package Seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginAutomation {
	WebDriver driver;
@Test
public void login() {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://browserstack.com/users/sign_in");
WebElement username=driver.findElement(By.id("user_email_login"));
WebElement password=driver.findElement(By.id("user_password"));
WebElement login=driver.findElement(By.name("commit"));
username.sendKeys("abc@gmail.com");
password.sendKeys("your_password");
login.click();

}
}