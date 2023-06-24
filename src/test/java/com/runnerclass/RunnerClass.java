package com.runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import projectcucum.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prem\\eclipse-workspace\\projectcucum\\src\\test\\java\\com\\feature\\login.feature",
			glue="com.stepdefinition")

public class RunnerClass extends BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\CucumberProgram\\Driver\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void close() {
		driver.close();
	} 
}
