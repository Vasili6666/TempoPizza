package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CartPage {

    public void openCart() {
        open("https://www.pizzatempo.by/menu/order/");
    }

    public void checkTrojkaInCart() {
        $$(".cart-product-name.title")
                .findBy(text("Акция \"Тройка\""))
                .should(exist);
    }
}
