import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoveFromSpamTest {
    private LoginPage loginPage;

    @BeforeTest
    public void setBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/kayama/Documents/java_automation/homework/lesson_8/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ru");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }
    @Test
    public void testSpam() throws InterruptedException {
        loginPage.enterLoginAndPass("test323test", "falligator323");
        loginPage.returnFromSpam();
        Assert.assertTrue(loginPage.returnedFromSpam());
    }
}
