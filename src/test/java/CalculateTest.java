import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static java.lang.Thread.sleep;

public class CalculateTest {
    WebDriver driver;
    PageObject pg;
    SoftAssert softAssert;

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        pg = new PageObject(driver);
    }

    @BeforeTest
    public void beforeTest() {
        softAssert = new SoftAssert();
    }

    @Test
    public void case1() throws InterruptedException {
        driver.navigate().to("https://www.google.ru/");
        pg.searchString.sendKeys("Калькулятор");
        sleep(1000);
        pg.searchButton.click();
        pg.openBrace.click();
        pg.number1.click();
        pg.plus.click();
        pg.number2.click();
        pg.closeBrace.click();
        pg.umn.click();
        pg.number3.click();
        pg.minus.click();
        pg.number4.click();
        pg.number0.click();
        pg.del.click();
        pg.number5.click();
        pg.ravno.click();
        softAssert.assertEquals(pg.history.getText(), "(1 + 2) × 3 - 40 ÷ 5 =");
        softAssert.assertEquals(pg.result.getText(), "1");
        softAssert.assertAll();
    }

    @Test
    public void case2() throws InterruptedException {
        driver.navigate().to("https://www.google.ru/");
        pg.searchString.sendKeys("Калькулятор");
        sleep(1000);
        pg.searchButton.click();
        pg.number6.click();
        pg.del.click();
        pg.number0.click();
        pg.ravno.click();
        softAssert.assertEquals(pg.history.getText(), "6 ÷ 0 =");
        softAssert.assertEquals(pg.result.getText(), "Infinity");
        softAssert.assertAll();
    }

    @Test
    public void case3() throws InterruptedException {
        driver.navigate().to("https://www.google.ru/");
        pg.searchString.sendKeys("Калькулятор");
        sleep(1000);
        pg.searchButton.click();
        pg.sin.click();
        pg.ravno.click();
        softAssert.assertEquals(pg.history.getText(), "sin() =");
        softAssert.assertEquals(pg.result.getText(), "Error");
        softAssert.assertAll();
    }

    @AfterClass
    public void after() {
        driver.close();

    }

}
