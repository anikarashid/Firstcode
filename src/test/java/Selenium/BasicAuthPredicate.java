package Selenium;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthPredicate {
    @Test
    public void basicAuthPredicate() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Predicate<URI> uriPredicate = uri -> uri.getHost().contains("the-internet.herokuapp.com");
        ((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
        driver.get("http://the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000l);
      //  driver.quit();

    }
}
