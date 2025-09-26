package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MenuPage {

    @Step("Открываем раздел \"Акции\"")
    public void openSalePage() {
        open("/menu/sale.html");
    }
    @Step("Нажимаем кнопку\"Заказ\"")
    public void addTrojkaToCart() {
        $$(".item_product").findBy(text("Акция \"Тройка\""))
                .scrollIntoView(true)
                .$(".orderButton.orderProductsButton")
                .click();
    }
}
