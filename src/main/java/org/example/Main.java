package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("Webdriver.chrome.driver","/Users/shubhamkumar/Downloads/chromedriver_mac64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phoenix.smartkarrot.com/");

        driver.findElement(By.xpath("//div//input[@placeholder= 'Enter your Email']")).sendKeys("jame@yopmail.com");
        driver.findElement(By.xpath("//div//input[@placeholder='Enter your Password']")).sendKeys("demo@123");
        driver.findElement(By.xpath("//div//button[text()= 'LOGIN']")).click();
        Thread.sleep(5000);
     Boolean result =   driver.findElement(By.xpath("//div[@class='sidenav_sidenav__sk_header__rKAw5']//a[@href= '/dashboard/csm-dashbSDFoard']")).isDisplayed();
if (result==Boolean.TRUE){
    System.out.println("Pass");
}else{
    System.out.println("Failed");
}





    }
}
