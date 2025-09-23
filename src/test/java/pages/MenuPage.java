package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MenuPage {

    public void openSalePage() {
        open("/menu/sale.html");
    }

    public void addTrojkaToCart() {
        $$(".item_product").findBy(text("Акция \"Тройка\""))
                .scrollIntoView(true)
                .$(".orderButton.orderProductsButton")
                .click();
    }
}
