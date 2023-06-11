package AutomationPracticeTest.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver driver;
    protected static final String URL_BASE = "http://automationpractice.pl";
    protected static final String CAMINHO_DRIVER = "src/test/java/AutomationPracticeTest/resource/chromedriver.exe";

    @Before
    public void Iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    //@After
    public void encerrar() {
        driver.quit();
    }
    
}
