import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_9_Task_3 {
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
        // Open the hotel page
        driver.findElement(By.xpath("(//a[@class=\"hotel_name_link url\"])[1]")).click();
        Thread.sleep(3000);
        // Switch to the next tab
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            driver.switchTo().window(window);
        }
        // Reserve the rooms
        driver.findElement(By.xpath("//td[@class=\"submitButton\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();
        Thread.sleep(3000);
        // Info input
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Mikaelian");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test323test@mail.ru");
        driver.findElement(By.xpath("//input[@id=\"email_confirm\"]")).sendKeys("test323test@mail.ru");
        driver.findElement(By.xpath("//i[@class=\"submit-button__arrow\"]")).click();
        // Payment info input
        driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("Nezavisimost");
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Minsk");
        driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("299218282");
        WebElement cardType = driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
        Select select = new Select(cardType);
        select.selectByValue("Visa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"cc_number\"]")).sendKeys("4242 4242 4242 4242");
        Thread.sleep(2000);
        WebElement expirationDate = driver.findElement(By.xpath("//select[@id=\"ccYear\"]"));
        Select expiration = new Select(expirationDate);
        expiration.selectByValue("2021");
        driver.findElement(By.xpath("//input[@id=\"cc_cvc\"]")).sendKeys("424");
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
    }
}