package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static io.qameta.allure.Allure.step;

public class AddActionTrojkaToCartTest extends TestBase{

    Pages pages = new Pages();

    @Test
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

    }
}
