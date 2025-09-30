package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageIsAccessibleTest extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Tag("smoke")
    @DisplayName("Проверка доступности главной страницы")
    void checkMainPageIsAccessibleTest() {
        mainPage.openPage();
        mainPage.checkLogo();
    }
}
