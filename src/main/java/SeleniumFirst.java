import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFirst {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.findElement(By.xpath("//input[@value='radio1']")).click();
    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("SouthKorea");
   driver.findElement(By.xpath("//input[@value='option3']")).click();
   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Anika");
    driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Anika");
   driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("Rashid");
   driver.findElement(By.xpath("//input[@name='enter-name']")).clear();
  driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys("mohoshina");
  // driver.findElement(By.cssSelector("input[value='radio3']")).click();
   //driver.findElement(By.cssSelector("")).click();

//Allert;
    driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
     //Thread.sleep(5000l);

     String  alertmsg = driver.switchTo().alert().getText();
     System.out.println(alertmsg);
        driver.switchTo().alert().accept();
 //practice page
     String pageHeader =driver.findElement(By.xpath("//h1")).getText();
        System.out.println(pageHeader);
 //How to Scroll
        WebElement scrollone = driver.findElement(By.xpath("//button[@id='mousehover']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",scrollone);
         Thread.sleep(3000l);
      WebElement sb = driver.findElement(By.xpath("//a[text()='Latest News']"));

      js.executeScript("arguments[0].scrollIntoView();",sb);
         Thread.sleep(3000l);
      WebElement  sd = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
        Thread.sleep(3000l);
     js.executeScript("arguments[0].scrollIntoView();",sd);

       WebElement ps=driver.findElement(By.xpath("//button[text()='Practice']"));
       Thread.sleep(5000l);
       js.executeScript("arguments[0].scrollIntoView();",ps);

       driver.findElement(By.xpath("//button[text()='Practice']")).click();
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.xpath("//button[text()='Signup']")).click();
        driver.findElement(By.xpath("//button[text()='Home']")).click();

        driver.navigate().back();







    //Thread.sleep(5000l);
       // driver.quit();
//Locators(TagName,Attribute,Value
//<input type="text" id="autocomplete" class="inputs ui-autocomplete-input" placeholder="Type to Select Countries" autocomplete="off">
    /*

    Xpath://TagName[@Attribute='Value'],

     Css: TagName[Attribute='Value'],
    Id
    Name
    linktext
    partiallinktext
    Class Name
    TagName

    */
// driver.findElement(By.xpath("//input[@value='radio01']")).click();
// driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Anika");
 //driver.findElement(By.xpath("//input[id='checkboxOption3']")).click();
// driver.findElement(By.xpath("//input[id='checkboxOption3']")).sendKeys("South Korea");
 //driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("Mohoshina");


        //driver.quit();
    }
}
