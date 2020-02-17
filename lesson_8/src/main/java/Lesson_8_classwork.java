//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Lesson_8_classwork {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/kayama/Documents/java_automation/homework/lesson_8/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://booking.com");
//        driver.manage().window().maximize();
//        WebElement webElement = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
//        webElement.click();
//        webElement.sendKeys("Москва");
//
//        WebElement guestCount = driver.findElement(By.xpath(".//span[@class=\"xp__guests__count\"]"));
//        guestCount.click();
//
//        WebElement addGuest = driver.findElement(By.xpath(".//button[@aria-label=\"Increase number of Adults\"]"));
//        addGuest.click();
//
//        WebElement addRoom = driver.findElement(By.xpath(".//button[@aria-label=\"Increase number of Rooms\"]"));
//        addRoom.click();
//
//        WebElement searchButton = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
//        searchButton.click();
//
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        WebElement startDate = driver.findElement(By.xpath("(.//span[@class=\"c2-day-inner\"])[22]"));
//        startDate.click();
//
//        WebElement searchDate = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
//        searchDate.click();
//
//        WebElement hotelCount = driver.findElement(By.xpath(".//*[@id=\"filterbox_options\"]/div/div[4]/div[2]/a[1]/label/div/span[2]"));
//        int hotels = Integer.parseInt(hotelCount.getText());
//        System.out.println((hotels > 0) ? "There are some free hotels!" : "Sorry! There are no hotels!");
//    }
//}
