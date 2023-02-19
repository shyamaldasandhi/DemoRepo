import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//With selenium new version 4.6.0 and above the selenium manager is introduced and the systemproperty line code is option.
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println("The title is :"+driver.getTitle());
		driver.close();

	}

}
