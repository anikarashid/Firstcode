import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);

        WebElement Source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions ac= new Actions(driver);
        ac.dragAndDrop(Source,target).build().perform();

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//[text()='Draggable']")).click();

        Thread.sleep(2000l);
        driver.quit();

    }
}
