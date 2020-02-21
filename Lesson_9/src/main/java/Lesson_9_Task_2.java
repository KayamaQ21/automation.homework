import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_9_Task_2 {
    public static void main(String[] args) throws InterruptedException {
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

        driver.findElement(By.xpath("//span[@class=\"xp__guests__count\"]")).click();
        driver.findElement(By.xpath("//button[@aria-label=\"Increase number of Adults\"]")).click();
        driver.findElement(By.xpath("//button[@aria-label=\"Increase number of Adults\"]")).click();
        driver.findElement(By.xpath("//button[@aria-label=\"Increase number of Rooms\"]")).click();
        // Search
        driver.findElement(By.xpath("//button[@data-sb-id=\"main\"]")).click();
        Thread.sleep(3000);

        // Filter the highest price
        driver.findElement(By.xpath("(//div[@class=\"bui-checkbox__label filter_item css-checkbox\"])[5]")).click();
        Thread.sleep(3000);

        // Filter the cheapest
        driver.findElement(By.xpath("//a[@data-category=\"price\"]")).click();


        Thread.sleep(3000);
        WebElement price = driver.findElement(By.xpath("(//div[@class=\"bui-price-display__value prco-inline-block-maker-helper\"])[1]"));
        Thread.sleep(3000);

        Matcher matcher = Pattern.compile("[-]?[0-9]+(.[0-9]+)?").matcher(price.getText());
        matcher.find();
        String priceOnlyNumbers = matcher.group();
        String priceForInt = priceOnlyNumbers.replace(",","");
        int priceForNight = Integer.parseInt(priceForInt) / 7;
        System.out.println(priceForNight);
        System.out.println((priceForNight >= 951) ? "All correct" : "Incorrect value");
    }
}
