import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandels {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("openwindow")).click();
        Set<String> window = driver.getWindowHandles();

        Iterator<String> it = window.iterator();

        String parent = it.next();
        String child = it.next();

        driver.switchTo().window(parent);
        String title = driver.getTitle();
        System.out.println(title);

        driver.switchTo().window(child);
        String title1 = driver.getTitle();
        System.out.println(title1);

        driver.switchTo().window(parent);
        String a= driver.getTitle();
        System.out.println(a);

        Thread.sleep(2000l);

         driver.switchTo().window(child);
         String x=driver.getTitle();
         System.out.println(x);

        Thread.sleep(3000l);
        driver.quit();
         driver.close();



    }
}
