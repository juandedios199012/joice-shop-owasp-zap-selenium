package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static util.EnvConfig.OWASP_ZAP;

public class ChromeProxy implements IBrowser {
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--proxy-server=" + OWASP_ZAP);

        // esto es para el certificado ssl --> HTTPS
        chromeOptions.addArguments("ignore-certificate-errors");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credential_enable_service", false);
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.addArguments("--maxime");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
