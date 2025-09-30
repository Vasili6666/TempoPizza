package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegistrationPage;

import static io.qameta.allure.Allure.step;

public class OpenRegistrationPageTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("smoke")
    @DisplayName("Проверка открытия страницы для регистрации")
    void checkOpenRegistrationPage() {
        mainPage.openPage();
        mainPage.openRegistrationPage();
        registrationPage.checkRegistrationTitle();
    }

}
