import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VisibilityOfPlansDescriptions {
    @BeforeTest
    public WebDriver Setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    @Test
    public void EnteringPlansDescriptions(){
        WebDriver driver = Setup();
        driver.navigate().to("https://trello.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"BXP-APP\"]/header[1]/div/div[1]/div[1]/button[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"BXP-APP\"]/header[1]/div/div[2]/div/div[3]/div/div[1]/div/nav/a[1]")).click();
        //driver.quit();
    }
}
