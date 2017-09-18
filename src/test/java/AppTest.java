
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppTest {
	AndroidDriver<WebElement> driver;

	@Test
	public void testAppHasAGreeting() throws MalformedURLException, Exception {
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("deviceName", "192.168.151.101:5555");
		caps.setCapability("app", getClass().getResource("selendroid.apk").getPath().substring(1));
		caps.setCapability("platformName", "Android");
		
		// Start android driver I used 4727 port by default it will be 4723
		driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), caps);

		// Specify the implicit wait of 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Enter the text in textbox
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']"))
				.sendKeys("Mukesh Selenium Appium");

		// click on registration button
		driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();

		// Wait for 10 second
		Thread.sleep(10000);

		// close the application
		driver.quit();	
		
	}
}