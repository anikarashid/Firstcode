import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https:www.google.com");
        Thread.sleep(2000l);
         String google_Page_Title=driver.getTitle();
         System.out.println(google_Page_Title);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000l);
         String faceBookPageTitle  = driver.getTitle();
         System.out.println(faceBookPageTitle);

         Thread.sleep(2000l);
        driver.navigate().back();
        Thread.sleep(2000l);

        String Title=driver.getTitle();
        System.out.println(Title);
        Thread.sleep(2000l);

        driver.navigate().forward();
        String Titlee=driver.getTitle();
        System.out.println(Titlee);
        Thread.sleep(2000l);

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        String rahulshettyacademyPageTitlee =driver.getTitle();
         System.out.println(rahulshettyacademyPageTitlee);
         driver.findElement(By.xpath("//button[text()='Home']")).click();
         Thread.sleep(2000l);
         driver.navigate().back();

        driver.navigate().refresh();
        driver.quit();


        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    // My Name is Anika
    }
}
