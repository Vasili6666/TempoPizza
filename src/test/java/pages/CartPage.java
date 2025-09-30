package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CartPage {

    private final String urlCartPage = "/menu/order/";
    private final String productName = "Акция \"Тройка\"";
    private final ElementsCollection cartProductNames = $$(".cart-product-name.title");

    @Step("Открываем корзину")
    public void openCart() {
        open(urlCartPage);
    }

    @Step("Проверяем наличие акционного товара 'Тройка' в корзине")
    public void checkTrojkaInCart() {
        cartProductNames.findBy(text(productName))
                .shouldBe(visible, Duration.ofSeconds(10));
    }
}
