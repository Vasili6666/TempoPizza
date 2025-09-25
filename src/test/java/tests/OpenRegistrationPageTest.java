package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static io.qameta.allure.Allure.step;

public class OpenRegistrationPageTest extends TestBase {

    Pages pages = new Pages();
    @Test
    @Tag("smoke")
    @DisplayName("Проверка открытия страницы для регистрации")
    void checkOpenRegistrationPage() {
        step("Открываем главную страницу", () ->{
            pages.mainPage.openPage();
        });

        step("Открываем страницу регистрации", () ->{
            pages.mainPage.openRegistrationPage();
        });

        step("Проверяем открылась ли страница регистрации", () ->{
            pages.registrationPage.checkRegistrationTitle();

        });
    }

}
