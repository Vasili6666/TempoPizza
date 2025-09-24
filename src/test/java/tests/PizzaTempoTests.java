package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import pages.Pages;



@Disabled
public class PizzaTempoTests extends TestBase {

    Pages pages = new Pages();

    @Test
    @Disabled
    @DisplayName("Проверка доступности главной страницы")
    void mainPageIsAccessible() {
        pages.mainPage.openPage();
        pages.mainPage.checkLogo();
    }

    @Test
    @Disabled
    @DisplayName("Добавление пиццы в корзину")
    void addActionTrojkaToCart() {
        pages.menuPage.openSalePage();
        pages.menuPage.addTrojkaToCart();
        pages.cartPage.openCart();
        pages.cartPage.checkTrojkaInCart();
    }

    @Test
    @Disabled
    @DisplayName("Проверка открытия страницы для регистрации")
    void openRegistrationPage() {
        pages.mainPage.openPage();
        pages.mainPage.openRegistrationPage();
        pages.registrationPage.checkRegistrationTitle();
    }

    @Test
    @Disabled
    @DisplayName("Проверка короткого номера телефона Доставки")
    void checkShortPhoneNumber() {
        pages.mainPage.openPage();
        pages.mainPage.checkShortNumber();
    }

    @Test
    @Disabled
    @DisplayName("Проверка возможности выбора города")
    void checkPossibilityToChangeLocation() {
        pages.mainPage.openPage();
        pages.mainPage.openChangeCityPopup();
        pages.mainPage.checkChangeCityPopup();
    }
}
