package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    @FindBy(id = "mailbox:login")
    private WebElement loginField;

    @FindBy(id = "mailbox:password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value=\"Ввести пароль\"]")
    private WebElement loginEnter;

    @FindBy(xpath = "//a[@title=\"выход\"]")
    private WebElement logOut;

    @FindBy (xpath = "(//div[@class=\"ll-av__container\"])[1]")
    private WebElement firstMailIcon;

    @FindBy (xpath = "(//div[@class=\"llc__avatar\"])[1]")
    private WebElement firstSpamElement;

    @FindBy (xpath = "//div[@class=\"portal-menu-element portal-menu-element_spam portal-menu-element_expanded portal-menu-element_not-touch\"]")
    private WebElement spamButton;

    @FindBy (xpath = "//div[@class=\"portal-menu-element portal-menu-element_unspam portal-menu-element_expanded portal-menu-element_not-touch\"]")
    private WebElement notASpamButton;

    @FindBy (xpath = "(//div[@data-bem=\"b-checkbox\"])[7]")
    private WebElement firstMailCheckbox;

    @FindBy (xpath = "(//div[@class=\"checkbox\"])[7]")
    private WebElement firstSpamCheckbox;

    @FindBy (xpath = "//a[@href=\"/spam/\"]")
    private WebElement spamTab;

    @FindBy (xpath = "//a[@href=\"/inbox/\"]")
    private WebElement inboxTab;

    @FindBy (xpath = "//span[@title=\"Написать письмо\"]")
    private WebElement createNewMail;

    @FindBy (xpath = "//input[@tabindex=\"100\"]")
    private WebElement toField;

    @FindBy (xpath = "//span[@title=\"Отправить\"]")
    private WebElement sendButton;

    @FindBy (xpath = "data-test-id=\"false\"")
    private WebElement sendDoubleCheck;

    @FindBy (xpath = "//input[@name=\"Subject\"]")
    private WebElement subjectField;

    @FindBy (xpath = "//div[@tabindex=\"505\"]")
    private WebElement emailBody;

    @FindBy (xpath = "//span[@tabindex=\"1000\"]")
    private WebElement closeSendWindow;

    @FindBy (xpath = "//span[@title=\"Пометить прочитанным\"]")
    private WebElement newSpamIndicator;

    @FindBy (xpath = "//span[@title=\"Пометить прочитанным\"]")
    private WebElement newMailIndicator;

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLoginAndPass(String login, String password) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginField.sendKeys(login);
        loginEnter.click();
        passwordField.sendKeys(password);
        loginEnter.click();
    }

    public void moveToSpam() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions (driver);
        actions.moveToElement(firstMailIcon).build().perform();
        firstMailCheckbox.click();
        spamButton.click();
    }

    public void returnFromSpam() throws InterruptedException {
        Actions actions = new Actions (driver);
        spamTab.click();
        Thread.sleep(1000);
        actions.moveToElement(firstSpamElement).build().perform();
        Thread.sleep(1000);
        firstSpamCheckbox.click();
        Thread.sleep(1000);
        notASpamButton.click();
        Thread.sleep(1000);
        inboxTab.click();
        Thread.sleep(1000);
    }

    public void sendMailToSeveral() throws InterruptedException {
        createNewMail.click();
        toField.sendKeys("test323test@mail.ru");
        subjectField.sendKeys("Test");
        emailBody.sendKeys("Test");
        sendButton.click();
        Thread.sleep(1000);
        sendDoubleCheck.click();
        Thread.sleep(5000);
        closeSendWindow.click();
    }

    public boolean returnedFromSpam() {
        return newMailIndicator.isDisplayed();
    }

    public boolean newSpamPresent() {
        return newSpamIndicator.isDisplayed();
    }
}
