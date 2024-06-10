package com.example.seleniumv6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //parent-child-child
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
       //from parent to child
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/a")).getText());
    driver.navigate().to("https://medium.com/globant/react-state-management-b0c81e0cbbf3");
driver.navigate().back();

    }
}
