package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class RegistrationPage {

    @Step("Проверяем доступность страницы регистрации")
    public void checkRegistrationTitle() {
        $(".pageTitle").shouldHave(text("Регистрация"));
    }
}
