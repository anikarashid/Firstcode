package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.css.model.CSSMedia;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameDragAndDropPractice {
    @Test

    public  void dragAndDrop() throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
      WebElement framePage =driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(framePage);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions ac = new Actions(driver);
        ac.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Draggable']")).click();
        Thread.sleep(3000l);
        driver.quit();


    }

}
