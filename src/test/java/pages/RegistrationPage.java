package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class RegistrationPage {

    private final SelenideElement pageTitle = $(".pageTitle");
    private final String textRegistration = "Регистрация";

    @Step("Проверяем заголовок страницы регистрации")
    public void checkRegistrationTitle() {
        pageTitle.shouldHave(text(textRegistration));
    }
}
