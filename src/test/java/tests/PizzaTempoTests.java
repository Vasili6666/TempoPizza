package tests;

import org.junit.jupiter.api.*;
import pages.CartPage;
import pages.MainPage;
import pages.MenuPage;
import pages.RegistrationPage;

@Disabled
public class PizzaTempoTests extends TestBase {


    MainPage mainPage = new MainPage();
    MenuPage menuPage = new MenuPage();
    CartPage cartPage = new CartPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test

    @DisplayName("Проверка доступности главной страницы")
    void mainPageIsAccessible() {
       mainPage.openPage();
       mainPage.checkLogo();
    }

    @Test

    @DisplayName("Добавление пиццы в корзину")
    void addActionTrojkaToCart() {
        menuPage.openSalePage();
        menuPage.addTrojkaToCart();
        cartPage.openCart();
        cartPage.checkTrojkaInCart();
    }

    @Test

    @DisplayName("Проверка открытия страницы для регистрации")
    void openRegistrationPage() {
        mainPage.openPage();
        mainPage.openRegistrationPage();
        registrationPage.checkRegistrationTitle();
    }

    @Test

    @DisplayName("Проверка короткого номера телефона Доставки")
    void checkShortPhoneNumber() {
       mainPage.openPage();
       mainPage.checkShortNumber();
    }

    @Test

    @DisplayName("Проверка возможности выбора города")
    void checkPossibilityToChangeLocation() {
        mainPage.openPage();
        mainPage.openChangeCityPopup();
        mainPage.checkChangeCityPopup();
    }
}
