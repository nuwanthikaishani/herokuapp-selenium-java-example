package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValue {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\IdeaProjects\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown1 = driver.findElement(By.id("dropdown"));

        Select dropdown = new Select(dropdown1);

        dropdown.selectByValue("2");
    }
}
