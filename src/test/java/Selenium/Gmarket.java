package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmarket {
    @Test
    public void Gmarket(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" http://global.gmarket.co.kr/Home/Main");
        driver.findElement(By.id("em[id='btn_okay']")).click();


    }
}
