import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_9_Task_1 {
    public static void main(String[] args) {
        // Setup driver
        System.setProperty("webdriver.chrome.driver", "/Users/kayama/Documents/java_automation/homework/lesson_8/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");
        driver.manage().window().maximize();
        // City input
        driver.findElement(By.xpath(".//input[@type=\"search\"]")).sendKeys("Париж");
        driver.findElement(By.xpath("//div[@class=\"xp__dates-inner\"]")).click();

        // Find dates
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDate = LocalDateTime.now();

        LocalDateTime plusThreeDays = currentDate.plusDays(3);
        String checkIn = plusThreeDays.format(dateTimeFormatter);
        String[] checkInArray = checkIn.split(" ");

        LocalDateTime plusSevenDays = plusThreeDays.plusDays(7);
        String checkOut = plusSevenDays.format(dateTimeFormatter);
        String[] checkOutArray = checkOut.split(" ");

        // Choose dates
        driver.findElement(By.xpath(".//td[@data-date='" + checkInArray[0] + "']")).click();
        driver.findElement(By.xpath(".//td[@data-date='" + checkOutArray[0] + "']")).click();

        // Search
        driver.findElement(By.xpath("//button[@data-sb-id=\"main\"]")).click();

        WebElement cheapCount = driver.findElement(By.xpath("(//span[@class=\"filter_count\"])[1]"));
        int intCheapCount = Integer.parseInt(cheapCount.getText());

        // Filter the cheapest
        driver.findElement(By.xpath("(//div[@class=\"bui-checkbox__label filter_item css-checkbox\"])[1]")).click();

        // Filter the highest score
        driver.findElement(By.xpath("//a[@data-category=\"review_score_and_price\"]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement price = driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]/div"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Matcher matcher = Pattern.compile("[-]?[0-9]+(.[0-9]+)?").matcher(price.getText());
        matcher.find();
        String priceOnlyNumbers = matcher.group();
        int priceForNight = Integer.parseInt(priceOnlyNumbers) / 7;
        System.out.println((priceForNight <= 119) ? "All correct" : "Incorrect value");
    }
}
