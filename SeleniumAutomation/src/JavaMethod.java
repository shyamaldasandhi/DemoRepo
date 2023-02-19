import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaMethod {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("The title is :"+driver.getTitle());
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D://EclipseScreenshot//screenshot.png"));
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("signInBtn")).click();
		if(driver.findElement(By.className("error")).getText().contains("* Incorrect username or password"))
		{
			System.out.println("Username Or Password is Wrong.");
			driver.findElement(By.linkText("Forgot your password?")).click();
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhi");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Abhi@abc.com");
			driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhi1");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Abhi@abc.com");
			
		}
		else
		{
			System.out.println("Login Successful.");
		}
//		driver.close();
		
	}

}
