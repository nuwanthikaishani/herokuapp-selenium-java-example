package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllOptions {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\IdeaProjects\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open a website
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));

        Select oSelect = new Select(dropdown1);
        List<WebElement> elementCount = oSelect.getOptions();
        System.out.println(elementCount.size());


    }
}
