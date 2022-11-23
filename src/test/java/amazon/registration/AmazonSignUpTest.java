package amazon.registration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class AmazonSignUpTest {
    WebDriver driver = new ChromeDriver();
    Duration duration = Duration.ofSeconds(10);
    WebDriverWait wait = new WebDriverWait(driver, duration);
    Random random = new Random();

    @Test
    public void registrationTest() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
        driver.findElement(By.id("nav-link-accountList")).click();

        int randomNumber = random.nextInt(1000) + 1;
        String email = "tomriddle"+ randomNumber + "@gmail.com";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
        driver.findElement(By.id("createAccountSubmit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_customer_name")));
        driver.findElement(By.id("ap_customer_name")).sendKeys("Tom Riddle");
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("ap_password")).sendKeys("qwerty-123");
        driver.findElement(By.id("ap_password_check")).sendKeys("qwerty-123");

        driver.findElement(By.id("continue")).click();
    }
}
