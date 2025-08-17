import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\IdeaProjects\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open a website
//        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

    }
}
