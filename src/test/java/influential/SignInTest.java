package influential;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class SignInTest {
    @Test
    public void signUp() throws InterruptedException {
        Duration duration = Duration.ofSeconds(15);
        WebDriver driver = new ChromeDriver();
        Random random = new Random();
        WebDriverWait wait = new WebDriverWait(driver, duration);

        driver.manage().window().setSize(new Dimension(1920,1080 ));
        driver.get("https://www.influential.co");
        WebElement navbar = driver.findElement(By.id("navbar"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbar")));
        navbar.findElement(By.cssSelector("[href=\"/request-a-demo\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("request-form")));

        driver.findElement(By.id("name")).sendKeys("Andrew");
        int randomNumber = random.nextInt(1000) + 1;
        String email = "andrewmrz"+ randomNumber + "@gmail.com";
        System.out.println(email);
        driver.findElement(By.id("email")).sendKeys(email);
        int phoneNumber = random.nextInt(600000000) + 99999999;
        System.out.println(phoneNumber);
        driver.findElement(By.id("phone_number")).sendKeys("+48" + phoneNumber);
        driver.findElement(By.id("job_title")).sendKeys("Student");
        driver.findElement(By.id("company")).sendKeys("TeachMeSkills");
        driver.findElement(By.id("number_of_employees")).sendKeys("1");
        driver.findElement(By.id("country")).sendKeys("Poland");
        driver.findElement(By.id("service_to_demo")).sendKeys("I");
        driver.findElement(By.id("service_to_demo")).sendKeys("I");
        driver.findElement(By.id("referred_by")).sendKeys("S");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
//        driver.quit();

    }
}
