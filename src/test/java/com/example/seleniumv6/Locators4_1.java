package com.example.seleniumv6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators4_1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("divpaxinfo")).click();
    }
}
