
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppTest {

	// APPIUM CONFIGURATION
	public final static String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";
	public final static String APP_NAME = "pratik_sample.apk";
	public final String APP_PATH = getClass().getResource(APP_NAME).getPath().substring(1);
	public final static String PLATFORM_NAME = "Android";
	public final static String DEVICE_NAME = "CB5A26694T"; // Change Device Name
	public final DesiredCapabilities caps = DesiredCapabilities.android();
	public AndroidDriver<WebElement> driver;

	// LOCATORS
	final String signup_page_button = "com.example.pratik.myapplication:id/signup";
	final String login_page_button = "com.example.pratik.myapplication:id/login";
	final String login_username_field = "com.example.pratik.myapplication:id/loginUsernameEmail";
	final String login_password_field = "com.example.pratik.myapplication:id/loginPassword";
	final String login_button = "com.example.pratik.myapplication:id/loginButton";
	final String signup_username_field = "com.example.pratik.myapplication:id/signupUsername";
	final String signup_email_field = "com.example.pratik.myapplication:id/signupEmail";
	final String signup_password_field = "com.example.pratik.myapplication:id/signupPassword";
	final String signup_button = "com.example.pratik.myapplication:id/signupButton";
	final String welcome_text_field = "com.example.pratik.myapplication:id/welcomeText";
	final String logout_button = "com.example.pratik.myapplication:id/logout";

	/**
	 * This would return the Android WebDriver instance
	 * 
	 * @return
	 * @throws MalformedURLException
	 */
	public AndroidDriver<WebElement> getAndroidDriver() throws MalformedURLException {
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL(APPIUM_SERVER_URL), caps);

		// Specify the implicit wait of 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		caps.setCapability("deviceName", DEVICE_NAME);
		caps.setCapability("app", APP_PATH);
		caps.setCapability("platformName", PLATFORM_NAME);
		driver = getAndroidDriver();
	}

	/**
	 * This test would verify whether user can Login successfully
	 * 
	 * @throws MalformedURLException
	 * @throws Exception
	 */
	@Test
	public void verifyUserCanLogin() throws MalformedURLException, Exception {
		String username = "Pratik";
		String password = "password";

		// Click on Login button for Navigating Login page
		driver.findElement(By.id(login_page_button)).click();

		// Wait for New page to be opened
		WebElement login_username_element = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(login_username_field)));

		// Fill Username/Email field
		login_username_element.sendKeys(username);
		driver.hideKeyboard();

		// Fill Password field
		driver.findElement(By.id(login_password_field)).sendKeys(password);
		driver.hideKeyboard();

		// Click on Login button
		driver.findElement(By.id(login_button)).click();

		// Wait for New page to be opened
		WebElement welcome_text_element = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(welcome_text_field)));

		// Get the welcome text and Logout button elements
		WebElement logout_element = driver.findElement(By.id(logout_button));

		// Assert whether elements are present or not
		Assert.assertTrue(welcome_text_element.isDisplayed(), "Welcome Text is not being displayed");
		Assert.assertTrue(logout_element.isDisplayed(), "Logout button is not being displayed");

		// Assert whether Welcome Text contains typed Username/Email
		Assert.assertTrue(welcome_text_element.getText().contains(username), "Username/Email: '" + username
				+ "' is not displayed!, The Text found is: " + welcome_text_element.getText());
	}

	/**
	 * This test would verify whether user can Sign up successfully
	 * 
	 * @throws MalformedURLException
	 * @throws Exception
	 */
	@Test
	public void verifyUserCanSignup() throws MalformedURLException, Exception {
		String username = "Pratik";
		String email = "pratikpatel@gmail.com";
		String password = "password";

		// Click on Login button for Navigating Login page
		driver.findElement(By.id(signup_page_button)).click();

		// Wait for New page to be opened
		WebElement signup_username_element = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(signup_username_field)));

		// Fill Username field
		signup_username_element.sendKeys(username);
		driver.hideKeyboard();

		// Fill Email field
		driver.findElement(By.id(signup_email_field)).sendKeys(email);
		driver.hideKeyboard();

		// Fill Password field
		driver.findElement(By.id(signup_password_field)).sendKeys(password);
		driver.hideKeyboard();

		// Click on Sign Up button
		driver.findElement(By.id(signup_button)).click();

		// Wait for New page to be opened
		WebElement welcome_text_element = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(welcome_text_field)));

		// Get the welcome text and Logout button elements
		WebElement logout_element = driver.findElement(By.id(logout_button));

		// Assert whether elements are present or not
		Assert.assertTrue(welcome_text_element.isDisplayed(), "Welcome Text is not being displayed");
		Assert.assertTrue(logout_element.isDisplayed(), "Logout button is not being displayed");

		// Assert whether Welcome Text contains typed Username
		Assert.assertTrue(welcome_text_element.getText().contains(username),
				"Username: '" + username + "' is not displayed!, The Text found is: " + welcome_text_element.getText());

		// Assert whether Welcome Text contains typed Email
		Assert.assertTrue(welcome_text_element.getText().contains(email),
				"Email: '" + email + "' is not displayed!, The Text found is: " + welcome_text_element.getText());
	}

	/**
	 * This test would verify whether user can Logout successfully
	 * 
	 * @throws MalformedURLException
	 * @throws Exception
	 */
	@Test
	public void verifyUserCanLogout() throws MalformedURLException, Exception {
		String username = "Pratik";
		String password = "password";

		// Click on Login button for Navigating Login page
		driver.findElement(By.id(login_page_button)).click();

		// Wait for New page to be opened
		WebElement login_username_element = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(login_username_field)));

		// Fill Username/Email field
		login_username_element.sendKeys(username);
		driver.hideKeyboard();

		// Fill Password field
		driver.findElement(By.id(login_password_field)).sendKeys(password);
		driver.hideKeyboard();

		// Click on Login button
		driver.findElement(By.id(login_button)).click();

		// Wait for New page to be opened
		WebElement welcome_text_element = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(welcome_text_field)));

		// Get the welcome text and Logout button elements
		WebElement logout_element = driver.findElement(By.id(logout_button));

		// Assert whether elements are present or not
		Assert.assertTrue(welcome_text_element.isDisplayed(), "Welcome Text is not being displayed");
		Assert.assertTrue(logout_element.isDisplayed(), "Logout button is not being displayed");

		// Assert whether Welcome Text contains typed Username/Email
		Assert.assertTrue(welcome_text_element.getText().contains(username), "Username/Email: '" + username
				+ "' is not displayed!, The Text found is: " + welcome_text_element.getText());

		// Click on Log out button
		logout_element.click();

		// Get the Login and Sign Up button elements
		WebElement login_button_element = driver.findElement(By.id(login_page_button));
		WebElement signup_button_element = driver.findElement(By.id(signup_page_button));

		// Assert whether Home page appears or not by verifying Login -
		// and Sign Up buttons present
		Assert.assertTrue(login_button_element.isDisplayed(), "Login button is not being displayed");
		Assert.assertTrue(signup_button_element.isDisplayed(), "Sign Up button is not being displayed");

	}

	@AfterMethod
	public void afterMethod() {
		// close the application
		driver.quit();
	}
}
