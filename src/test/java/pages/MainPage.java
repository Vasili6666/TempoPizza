package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MainPage {

    public void openPage() {
        open("https://www.pizzatempo.by");
    }

    public void checkLogo() {
        $(".logo span").shouldHave(attribute("title", "Пицца Темпо"));
    }

    public void openRegistrationPage() {
        $("a[href='https://www.pizzatempo.by/registration/']").click();
    }

    public void checkShortNumber() {
        $(".delivery .short_number").shouldHave(text("7773"));
    }

    public void openChangeCityPopup() {
        $(".choose_region_link").click();
    }

    public void checkChangeCityPopup() {
        $(".choose_region .window").shouldHave(text("Выберите город доставки"));
    }
}
