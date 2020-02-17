import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson_8_homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kayama/Documents/java_automation/homework/lesson_8/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://booking.com");
        driver.manage().window().maximize();
        WebElement webElement = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
        webElement.click();
        webElement.sendKeys("Москва");

        WebElement guestCount = driver.findElement(By.xpath(".//span[@class=\"xp__guests__count\"]"));
        guestCount.click();

        WebElement addGuest = driver.findElement(By.xpath(".//button[@aria-label=\"Increase number of Adults\"]"));
        addGuest.click();

        WebElement addRoom = driver.findElement(By.xpath(".//button[@aria-label=\"Increase number of Rooms\"]"));
        addRoom.click();

        WebElement searchDate = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
        searchDate.click();

        WebElement filterCheckbox = driver.findElement(By.xpath("//a[@data-id=\"review_score-90\"]"));
        filterCheckbox.click();

        try {
            WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class=\"hotel_name_link url\"])[1]"));
            firstHotel.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class=\"hotel_name_link url\"])[1]"));
            firstHotel.click();
        }
        WebElement firstRating = driver.findElement(By.xpath("(//div[@class=\"bui-review-score__badge\"])[1]"));
        double ratingNumber = Double.valueOf(firstRating.getText());
        System.out.println((ratingNumber >= 9) ? "The rating is more than 9" : "The rating is less than 9");
    }
}
