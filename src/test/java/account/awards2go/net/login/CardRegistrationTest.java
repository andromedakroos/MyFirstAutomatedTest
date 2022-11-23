package account.awards2go.net.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class CardRegistrationTest {
    WebDriver driver = new ChromeDriver();
    Duration duration = Duration.ofSeconds(10);
    WebDriverWait wait = new WebDriverWait(driver, duration);
    Random random = new Random();

    @Test
    public void registrationTest() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1920,1080 ));
        driver.get("https://account.awards2go.net/ind/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"/ind/registration\"]")));
        driver.findElement(By.cssSelector("[href=\"/ind/registration\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        driver.findElement(By.id("firstName")).sendKeys("Tom");
        driver.findElement(By.id("lastName")).sendKeys("Riddle");
        driver.findElement(By.id("address1")).sendKeys("5624 street");
        driver.findElement(By.id("addressCity")).sendKeys("New York");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              driver.findElement(By.id("addressState")).sendKeys("Texas");
        driver.findElement(By.id("addressZipCode")).sendKeys("48905");
        int randomNumber = random.nextInt(1000) + 1;
        String email = "harrypotter"+ randomNumber + "@gmail.com";
        driver.findElement(By.id("email")).sendKeys(email);
        long phoneNumber = random.nextInt(600000000) + 999999999;
        driver.findElement(By.id("phone")).sendKeys( ""+ phoneNumber);
        driver.findElement(By.id("cardNumber")).sendKeys( "4049 9780 4407 3619");
        driver.findElement(By.id("cardCvv")).sendKeys( "539");
        driver.findElement(By.cssSelector("button[class=\"btn btn-primary text-uppercase\"]")).click();
//        Thread.sleep(10000);
//        driver.quit();
    }
}
