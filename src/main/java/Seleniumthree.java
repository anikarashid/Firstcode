import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumthree {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
       // Select ps= new Select();
        Select i = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
       // i.selectByIndex();
        Thread.sleep(2000l);
        i.selectByVisibleText("Option 1");
        Thread.sleep(2000l);
       // i.selectByValue();
        driver.navigate().back();
        Thread.sleep(2000l);
        JavascriptExecutor sp= (JavascriptExecutor)driver;
        Thread.sleep(2000l);
        WebElement qs= driver.findElement(By.xpath("//a[text()='WYSIWYG Editor']"));
        sp.executeScript("arguments[0].scrollIntoView();",qs);
        Thread.sleep(2000l);
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
        driver.quit();
    }
}
