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
      Thread.sleep(3000l);


        // List<WebElement> allNames =driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']//li//div//a//div[2]//span"));
  List<WebElement>abc= driver.findElements(By.xpath("//div[contains(@class,'lrtEPN _17d0yO')]"));
            System.out.println(abc.size());
            for (int i=0;i<abc.size();i++){
               String Names= abc.get(i).getText();
               System.out.println(abc.get(i).getText());
               if(Names.equalsIgnoreCase("iphone14 cover")){
                   abc.get(i).click();
               }

              // break;
            }
           driver.quit();

        }



    }




