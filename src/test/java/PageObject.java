import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    @FindBy(css="input[title='Поиск']")
    public WebElement searchString;

    @FindBy(css="input[aria-label='Поиск в Google']")
    public WebElement searchButton;


   @FindBy(xpath=".//div[text()='1']")
    public WebElement  number1;
    @FindBy(xpath=".//div[text()='2']")
    public WebElement  number2;
    @FindBy(xpath=".//div[text()='3']")
    public WebElement  number3;
    @FindBy(xpath=".//div[text()='4']")
    public WebElement  number4;
    @FindBy(xpath=".//div[text()='5']")
    public WebElement  number5;
    @FindBy(xpath=".//div[text()='6']")
    public WebElement  number6;
    @FindBy(xpath=".//div[text()='7']")
    public WebElement  number7;
    @FindBy(xpath=".//div[text()='8']")
    public WebElement  number8;
    @FindBy(xpath=".//div[text()='9']")
    public WebElement  number9;
    @FindBy(xpath=".//div[text()=')']")
    public WebElement  closeBrace;
    @FindBy(xpath=".//div[text()='(']")
    public WebElement  openBrace;
    @FindBy(xpath=".//div[text()='÷']")
    public WebElement  del;
    @FindBy(xpath=".//div[text()='×']")
    public WebElement  umn;
    @FindBy(xpath=".//div[text()='−']")
    public WebElement  minus;
    @FindBy(xpath=".//div[text()='+']")
    public WebElement  plus;
    @FindBy(xpath=".//div[text()='sin']")
    public WebElement  sin;
    @FindBy(xpath=".//div[text()='cos']")
    public WebElement  cos;
    @FindBy(xpath=".//div[text()='0']")
    public WebElement  number0;
    @FindBy(xpath=".//div[text()='=']")
    public WebElement  ravno;

    @FindBy(css="span[jsname='ubtiRe']")
    public WebElement  history;
    @FindBy(css="span#cwos")
    public WebElement result;

    public WebDriver driver;
    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
}
