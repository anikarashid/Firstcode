package Selenium;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URI;
import java.util.function.Predicate;

public class Authentication {


    @Test
    public void basicAuth() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      //driver.get("http:the-internet.herokuapp.com/basic_auth")  ;//pop pop security//
      //  user name,password//(username:admin:password:admin@URL)
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000l);
        driver.quit();
    }





}
