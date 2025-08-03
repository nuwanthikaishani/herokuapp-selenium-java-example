import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginTest {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\IdeaProjects\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://the-internet.herokuapp.com/login");
        // Maximize window
        driver.manage().window().maximize();

        // Enter username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        // Enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        // Click Login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // Print success message
        System.out.println("Login attempt completed.");


    }
}
