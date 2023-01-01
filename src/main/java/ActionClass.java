import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement scrollone = driver.findElement(By.xpath("//button[@id='mousehover']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollone);
        Thread.sleep(2000L);

     //   WebElement sd = driver.findElement(By.xpath("//a[text()='Latest News']"));

        Actions a = new Actions(driver);
        a.moveToElement(scrollone).perform();
        //relod
        a.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();
        WebElement scrolltwo = driver.findElement(By.xpath("//button[@id='mousehover']"));
        JavascriptExecutor ps = (JavascriptExecutor) driver;
         ps.executeScript("arguments[0].scrollIntoView();", scrolltwo);
          a.moveToElement(scrolltwo).perform();
        Thread.sleep(2000l);
        //Top
        a.moveToElement(driver.findElement(By.xpath("//a[text()='Top']"))).click().perform();

        Thread.sleep(2000l);
        driver.quit();



    }
}