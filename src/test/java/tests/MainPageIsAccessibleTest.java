package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Pages;
import static io.qameta.allure.Allure.step;

public class MainPageIsAccessibleTest extends TestBase {
    Pages pages = new Pages();

    @Test
    @Tag("smoke")
    @DisplayName("Проверка доступности главной страницы")
    void checkMainPageIsAccessibleTest() {
        pages.mainPage.openPage();
        pages.mainPage.checkLogo();
    }
}
