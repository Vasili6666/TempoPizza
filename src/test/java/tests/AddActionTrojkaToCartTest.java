package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.MenuPage;

import static io.qameta.allure.Allure.step;
public class AddActionTrojkaToCartTest extends TestBase{

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


    /*@Test
    @DisplayName("Добавление пиццы в корзину")
    void checkAddActionTrojkaToCartTest() {
        step("Открываем страницу Акция", () ->{
            pages.menuPage.openSalePage();
        });

        step("Нажимаем на кнопку Заказ", () ->{
            pages.menuPage.addTrojkaToCart();
        });

        step("Открываем Корзину", () ->{
            pages.cartPage.openCart();
        });
        step("Проверяем добавлен ли товар", () ->{
            pages.cartPage.checkTrojkaInCart();
        });

    }*/
}
