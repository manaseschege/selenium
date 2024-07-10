package com.example.seleniumv6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("manasses");
        driver.findElement(By.name("email")).sendKeys("manasses@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("MANASSES@@tr");
        driver.findElement(By.id("exampleCheck1")).click();
        Select options= new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        options.selectByIndex(0);
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("0432024");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());

    }
}
