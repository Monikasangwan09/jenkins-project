package org.jenkins.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsTest {
	@Test
	public static void pipelineTest() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		String title =driver.getTitle();
		System.out.println("Title of the web page is ::: "+ title.toUpperCase());
		driver.quit();
	}

}
