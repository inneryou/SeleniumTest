package com.turedurenaru;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/home/yuichi/myprog/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://inna:toyora1017@innerfashion.sakura.ne.jp/myhome/");
        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/p[4]/a"));

        Actions action = new Actions(driver);
        action.click(element).perform();

        element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/p[2]/a"));

        action = new Actions(driver);
        action.click(element).perform();
        System.out.println("-- End --");
    }
}
    