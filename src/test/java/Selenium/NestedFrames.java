package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class NestedFrames {
     
    @Test
    public void NestedFrames() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/nested_frames");

        Actions ac = new Actions(driver);
        List<WebElement> x = driver.findElements(By.tagName("iframe"));
        System.out.println(x.size());

        WebElement parentTop = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(parentTop);

        List<WebElement> y = driver.findElements(By.tagName("frame"));
        System.out.println(y.size());
        ac.contextClick().perform();

        Thread.sleep(3000l);

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        ac.contextClick().perform();

        Thread.sleep(3000l);

        driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle'")));
        ac.contextClick().perform();

        Thread.sleep(3000l);

         driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
         Thread.sleep(3000l);
         driver.switchTo().defaultContent();

         ac.contextClick().perform();

         Thread.sleep(3000l);

         driver.quit();




    }
}
