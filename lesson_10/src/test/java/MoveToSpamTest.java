import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class MoveToSpamTest {
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
        loginPage.moveToSpam();
        Assert.assertTrue(loginPage.newSpamPresent());
    }
}
