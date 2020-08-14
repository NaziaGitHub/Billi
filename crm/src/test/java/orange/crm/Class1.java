package orange.crm;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Class1 {

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "R9ZN60WKQ6R");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("chromedriverExecutable","D:\\Desktop and Download Data\\Backup Data\\Chrome Driver New\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.get("https://www.rediff.com");

	}

}
