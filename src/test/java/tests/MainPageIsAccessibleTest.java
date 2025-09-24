package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static io.qameta.allure.Allure.step;

public class MainPageIsAccessibleTest extends TestBase {
    Pages pages = new Pages();

    @Test
    @DisplayName("Проверка доступности главной страницы")
    void checkMainPageIsAccessibleTest() {
        step("Открываем главную страницу", () ->{
            pages.mainPage.openPage();
        });
        step("Проверяем загружен ли логотип", () ->{
            pages.mainPage.checkLogo();
        });

    }
}
