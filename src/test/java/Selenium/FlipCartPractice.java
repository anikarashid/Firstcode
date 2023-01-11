package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipCartPractice {
    @Test
    public void fashion() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        WebElement xy= driver.findElement(By.xpath("//div[contains(@class,'_37M3Pb')]//div[@class='eFQ30H'][3]"));
   //   WebElement a= driver.findElement(By.xpath("//div[@class='_37M3Pb']//div[@class='eFQ30H'][3]//div[text()='Fashion']"));
  // WebElement b = driver.findElement(By.xpath("//div[@class='eFQ30H'][3]//div[text()='Fashion']"));
        Actions ac = new Actions(driver);
         ac.moveToElement(xy).perform();
         WebElement pq = driver.findElement(By.xpath("//a[@class='_6WOcW9'][5]"));
          ac.moveToElement(pq).click().build().perform();
         Thread.sleep(3000l);

//driver.quit();
    }
}
// //div[contains(@class,'_37M3Pb')]//div[@class='eFQ30H'][3]
// //div[@class='eFQ30H'][3]//div[text()='Fashion']
//
// //div[@class='_37M3Pb']//div[@class='eFQ30H'][3]//div[text()='Fashion']
// //a[@class='_6WOcW9'][5]