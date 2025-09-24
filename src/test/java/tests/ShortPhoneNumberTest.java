package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static io.qameta.allure.Allure.step;

public class ShortPhoneNumberTest extends TestBase{
    Pages pages = new Pages();

    @Test
    @DisplayName("Проверка короткого номера телефона Доставки")
    void checkShortPhoneNumber() {
        step("Открываем главную страницу", () ->{
            pages.mainPage.openPage();
        });

        step("Проверяем наличие короткого номера", () ->{
            pages.mainPage.checkShortNumber();
        });

    }
}
