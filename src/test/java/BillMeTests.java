import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillMeTests {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LOGGER.info("Privet");
        System.out.println("Hello, World!");
    }
}
