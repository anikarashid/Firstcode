package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SuggestiveDropDown {

    @Test
    public void auto_Suggestive_Drop_Down() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("autocomplete")).sendKeys("ban");
        Thread.sleep(3000l);
        List<WebElement> allCountryNames = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//div"));

        System.out.println(allCountryNames.size());

         for (int i=0;i<allCountryNames.size();i++){
             System.out.println(allCountryNames.get(i).getText());
             String CountryName =allCountryNames.get(i).getText();

             if(CountryName.equals("Bangladesh")){
                 allCountryNames.get(i).click();

             }
         }
         driver.quit();

    }
}
