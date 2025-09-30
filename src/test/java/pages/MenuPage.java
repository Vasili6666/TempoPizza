package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MenuPage {


    private final String urlSale = "/menu/sale.html";
    private final ElementsCollection itemProducts= $$(".item_product");
    private final String productName = "Акция \"Тройка\"";
    private final SelenideElement productButton = $(".orderButton.orderProductsButton");

    @Step("Открываем раздел \"Акции\"")
    public void openSalePage() {
        open(urlSale);
    }

    @Step("Нажимаем кнопку\"Заказ\"")
    public void addTrojkaToCart() {
        itemProducts.findBy(text(productName))
                .scrollIntoView(true);
        productButton
                .click();
    }
}
