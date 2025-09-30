package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import helpers.Attach;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.hasWebDriverStarted;

public class TestBase {

    public static final String BASE_URL = System.getProperty("baseUrl", "https://www.pizzatempo.by");
    public static final String BROWSER = System.getProperty("browser", "chrome");
    public static final String BROWSER_VERSION = System.getProperty("version", "127");
    public static final String BROWSER_SIZE = System.getProperty("windowSize", "1920x1080");
    //public static final String REMOTE_DRIVER_URL = System.getProperty("remoteDriverUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

    public static final String REMOTE_DRIVER_URL = System.getProperty("remoteDriverUrl", "");
    public static final int TIMEOUT = Integer.parseInt(System.getProperty("timeout", "5000"));

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = BROWSER;
        Configuration.browserVersion = BROWSER_VERSION;
        Configuration.browserSize = BROWSER_SIZE;
        Configuration.timeout = TIMEOUT;
        Configuration.pageLoadStrategy = "eager";

        if (!REMOTE_DRIVER_URL.isEmpty()) {
            Configuration.remote = REMOTE_DRIVER_URL;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        if (hasWebDriverStarted()) {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();


            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            closeWebDriver();  
        }
    }


    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }
}
