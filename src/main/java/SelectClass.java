import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {


        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");

          // driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
            Select a = new Select( driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
           a.selectByIndex(2);
           a.selectByVisibleText("Option2");//Option3
           a.selectByValue("option2");
    }
}
