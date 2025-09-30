package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class ShortPhoneNumberTest extends TestBase{
    MainPage mainPage = new MainPage();

    @Test
    @Tag("check")
    @DisplayName("Проверка короткого номера телефона Доставки")
    void checkShortPhoneNumber() {
       mainPage.openPage();
       mainPage.checkShortNumber();

    }
}
