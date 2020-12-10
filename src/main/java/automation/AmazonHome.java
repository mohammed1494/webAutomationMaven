package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonHome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammed Ali\\IdeaProjects\\SeleniumProject1\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //10 seconds to throw error
//        driver.get("https://www.amazon.com/");
//        driver.manage().window().fullscreen();
//        driver.findElement(By.id("twotabsearchtextbox"))
//                .sendKeys("Books", Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
//        driver.findElement(By.id("twotabsearchtextbox"))
//               .sendKeys("OnePlus 8", Keys.ENTER);
//        //sendkeys is the computer keys for the web browser
//        driver.close();

        driver.get("https://www.google.com/");
        //driver.manage().window().fullscreen();
        driver.findElement(By.name("q"))
                .sendKeys("MSFT", Keys.ENTER);
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q"))
                .sendKeys("TSLA", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //driver.close();
    }
}
