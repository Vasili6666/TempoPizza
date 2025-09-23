package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class PizzaTempoTests {

    @BeforeAll
    @Owner("Platonov")
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

    }

    @AfterEach
    void tearDown() {
        // Закрыть браузер после каждого теста
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @DisplayName("Проверка доступности главной страницы")
    void mainPageIsAccessibleTest() {
        open("https://www.pizzatempo.by");
        //$(".logo span").shouldHave(Condition.text("Пицца Темпо"));
        $(".logo span").shouldHave(Condition.attribute("title", "Пицца Темпо"));

    }


    @Test
    @DisplayName("Добавление пиццы в корзину")
    void addActionTrojkaToCartTest() {
        open("https://www.pizzatempo.by/menu/sale.html");

        $$(".item_product").findBy(Condition.text("Акция \"Тройка\""))
                .scrollIntoView(true)       // скроллим к элементу
                .$(".orderButton.orderProductsButton")
                .click();
        open("https://www.pizzatempo.by/menu/order/");
        $$(".cart-product-name.title")
                .findBy(Condition.text("Акция \"Тройка\""))
                .should(Condition.exist);
    }


    @Test
    @DisplayName("Проверка открытия страницы для регистрации")
    void openRegistrationPageTest() {
        open("https://www.pizzatempo.by");
        $("a[href='https://www.pizzatempo.by/registration/']").click();
        $(".pageTitle").shouldHave(text("Регистрация"));
    }

    @Test
    @DisplayName("Проверка короткого номера телефона Доставки")
    void checkShortPhoneNumberTest() {
        open("https://www.pizzatempo.by");
        $(".delivery .short_number").shouldHave(text("7773"));
    }

    @Test
    @DisplayName("Проверка возможности выбора города")
    void checkPossibilityToChangeLocation() {
        open("https://www.pizzatempo.by");
        $(".choose_region_link").click();
        $(".choose_region .window").shouldHave(text("Выберите город доставки"));
    }
}

