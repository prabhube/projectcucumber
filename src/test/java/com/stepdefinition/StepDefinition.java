package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runnerclass.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectcucum.BaseClass;

public class StepDefinition extends BaseClass {
	public static WebDriver driver=RunnerClass.driver;
	@Given("user can able to launch url")	public void user_can_able_to_launch_url() {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user can able to enter the username")
	public void user_can_able_to_enter_the_username() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("prabhube");
		
	}

	@When("user can able to enter the password")
	public void user_can_able_to_enter_the_password() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Kasthuriraja1!");
		
	}

	@Then("user can able to click the login button and  navigate to next page")
	public void user_can_able_to_click_the_login_button_and_navigate_to_next_page() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
}
