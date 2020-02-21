import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

    private LoginPage loginPage;
    private WebDriver driver;

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/kayama/Documents/java_automation/homework/lesson_8/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://mail.ru");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
        loginPage.enterLoginAndPass("test323test", "falligator323");
        Thread.sleep(5000);
        Assert.assertTrue(loginPage.logoutLinkPresent());
    }
}
