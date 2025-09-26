package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MainPage {

    @Step("Открываем главную страинцу")
    public void openPage() {
        open("https://www.pizzatempo.by");
    }

    @Step("Проверяем Логотип")
    public void checkLogo() {
        $(".logo span").shouldHave(attribute("title", "Пицца Темпо"));
    }

    @Step("Открываем страницу регистрации")
    public void openRegistrationPage() {
        $("a[href='https://www.pizzatempo.by/registration/']").click();
    }

    @Step("Прверяем наличие короткого номера")
    public void checkShortNumber() {
        $(".delivery .short_number").shouldHave(text("7773"));
    }

    @Step("Открываем окно смены локации")
    public void openChangeCityPopup() {
        $(".choose_region_link").click();
    }

    @Step("Проверяем открытие окна смены локации")
    public void checkChangeCityPopup() {
        $(".choose_region .window").shouldHave(text("Выберите город доставки"));
    }
}
