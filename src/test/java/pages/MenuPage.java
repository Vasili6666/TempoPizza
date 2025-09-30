package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MenuPage {

    private final String urlSale = "/menu/sale.html";
    private final ElementsCollection itemProducts = $$(".item_product");
    private final String productName = "Акция \"Тройка\"";

    @Step("Открываем раздел 'Акции'")
    public void openSalePage() {
        open(urlSale);
    }

    @Step("Добавляем акцию 'Тройка' в корзину")
    public void addTrojkaToCart() {
        itemProducts.findBy(text(productName))
                .scrollIntoView(true)
                .find(".orderButton.orderProductsButton")
                .shouldBe(visible, Duration.ofSeconds(10))
                .click();
    }
}
