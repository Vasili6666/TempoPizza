package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.MenuPage;

import static io.qameta.allure.Allure.step;
public class AddActionTrojkaToCartTest extends TestBase {

    MenuPage menuPage = new MenuPage();
    CartPage cartPage = new CartPage();

    @Test
    @DisplayName("Добавление пиццы в корзину")
    void checkAddActionTrojkaToCartTest() {

        menuPage.openSalePage();
        menuPage.addTrojkaToCart();
        cartPage.openCart();
        cartPage.checkTrojkaInCart();
    }

}