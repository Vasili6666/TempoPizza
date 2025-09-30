package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class MainPage {

    private final String urlMainPage = "https://www.pizzatempo.by";

    private final SelenideElement logo = $(".logo span");
    private final String logoText = "Пицца Темпо";

    private final SelenideElement registrationLink = $("a[href='https://www.pizzatempo.by/registration/']");
    private final SelenideElement shortNumber = $(".delivery .short_number");
    private final String shortNumberText = "7773";

    private final SelenideElement regionalLink = $(".choose_region_link");
    private final String regionalText = "Выберите город доставки";

    @Step("Открываем главную страницу")
    public void openPage() {
        open(urlMainPage);
    }

    @Step("Проверяем логотип")
    public void checkLogo() {
        logo.shouldHave(text(logoText));
    }

    @Step("Открываем страницу регистрации")
    public void openRegistrationPage() {
        registrationLink.click();
    }

    @Step("Проверяем наличие короткого номера доставки")
    public void checkShortNumber() {
        shortNumber.shouldHave(text(shortNumberText));
    }

    @Step("Открываем окно смены города доставки")
    public void openChangeCityPopup() {
        regionalLink.click();
    }

    @Step("Проверяем, что открылось окно смены города")
    public void checkChangeCityPopup() {
        regionalLink.shouldHave(text(regionalText));
    }
}














/*
public class MainPage {


    private final String urlMainPage = "https://www.pizzatempo.by";
    private final SelenideElement logo = $(".logo span");
    private final String logoText = "Пицца Темпо";
    private final SelenideElement registrationLink = $("a[href='https://www.pizzatempo.by/registration/']");
    private final SelenideElement shortNumber = $(".delivery .short_number");
    private final String shortNumberText = "7773";
    private final String attribute = "title";
    private final SelenideElement regionalLink = $(".choose_region_link");
    private final String regionalText = "Выберите город доставки";


    @Step("Открываем главную страницу")
    public void openPage() {
        open(urlMainPage);
    }

    @Step("Проверяем Логотип")
    public void checkLogo() {
        logo.shouldHave(attribute(attribute, logoText));
    }

    @Step("Открываем страницу регистрации")
    public void openRegistrationPage() {
        registrationLink.click();
    }

    @Step("Проверяем наличие короткого номера")
    public void checkShortNumber() {
        shortNumber.shouldHave(text(shortNumberText));
    }

    @Step("Открываем окно смены локации")
    public void openChangeCityPopup() {
        regionalLink.click();
    }

    @Step("Проверяем открытие окна смены локации")
    public void checkChangeCityPopup() {
        regionalLink.shouldHave(text(regionalText));
    }
}
*/
