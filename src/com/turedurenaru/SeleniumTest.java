package com.turedurenaru;

// import java.awt.*;

// import java.io.IOException;
// import java.net.URI;
// import java.net.URISyntaxException;
// import java.net.URL;
// import java.util.ArrayList;

import org.openqa.selenium.By;
// import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest{
    public static void main(String[] args){
        // ArrayList<String> aryPlan = new ArrayList<>();
        // String[] aryPlan = {"A","休み","休み","A","A","A","A","A","休み","休み","A","A","休み","休み","休み","休み","休み","A","A","A","A","A","休み","休み","A","A","A","A","A","休み"};
        String[] aryPlan = {"A"};
        String strDate = "2023-4-21";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/home/yuichi/myprog/java/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://inna:toyora1017@innerfashion.sakura.ne.jp/myhome/");
        // driver.quit();
        // driver.get("https://yahoo.co.jp");
        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/p[4]/a"));

        Actions action = new Actions(driver);
        action.click(element).perform();

        element = driver.findElement(By.id("date"));

        action = new Actions(driver);
        JavascriptExecutor jexec = (JavascriptExecutor) driver;
        jexec.executeScript("document.getElementById('date').value = ''");
        element.sendKeys(strDate);
        for(int i=0;i<aryPlan.length;i++){
            element = driver.findElement(By.id("shift"));
            Select sel = new Select(element);
            sel.selectByVisibleText(aryPlan[i]);
            driver.findElement(By.xpath("//input[@type='submit']")).submit();
        }
        // action.click(element).perform();
        driver.quit();
        System.out.println("-- End --");
        // try{
        //     Desktop desktop = Desktop.getDesktop();
        //     // desktop.browse(new URI("file:/home/yuichi/mysite/192.168.1.203/index.html"));
        // } catch (URISyntaxException e) {
        //     e.printStackTrace();
        // }catch(IOException e){
        //     e.printStackTrace();
        // }
    }
}
    