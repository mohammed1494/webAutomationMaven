package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonHomeWithTestControl {
    WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammed Ali\\IdeaProjects\\SeleniumProject1\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //10 seconds to throw error
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();
    }

    @AfterMethod
    public void cleanUp(){
        //driver.close();
    }

    @Test
    public void test1(){
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Books", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("ALL", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("OnePlus 8", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //using testNG jar file to run the test
    }
    @Test
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Laptops", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("ALL", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Monitors", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //using testNG jar file to run the test
    }
}
