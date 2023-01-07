package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FlipCart {
    @Test
    public void Dynamic_Drop_Down() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
  driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone14");
    driver.quit();
    }
}
