package com.example.seleniumv6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {
    public static void main(String[] args) {
String text="manasses";
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            driver.findElement(By.id("name")).sendKeys(text);
            driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

            driver.switchTo().alert().accept();
            driver.findElement(By.id("confirmbtn")).click();
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().dismiss();
    }
}
