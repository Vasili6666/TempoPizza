package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static io.qameta.allure.Allure.step;

public class ShortPhoneNumberTest extends TestBase{
    Pages pages = new Pages();

    @Test
    @Tag("check")
    @DisplayName("Проверка короткого номера телефона Доставки")
    void checkShortPhoneNumber() {
       pages.mainPage.openPage();
      pages.mainPage.checkShortNumber();

    }
}
