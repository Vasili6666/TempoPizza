package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class RegistrationPage {
    public void checkRegistrationTitle() {
        $(".pageTitle").shouldHave(text("Регистрация"));
    }
}
