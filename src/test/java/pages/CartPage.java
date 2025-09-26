package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CartPage {

    @Step("Открываем Корзину")
    public void openCart() {
        open("https://www.pizzatempo.by/menu/order/");
    }

    @Step("Проверяем наличие акционного товара в корзине")
    public void checkTrojkaInCart() {
        $$(".cart-product-name.title")
                .findBy(text("Акция \"Тройка\""))
                .should(exist);
    }
}
