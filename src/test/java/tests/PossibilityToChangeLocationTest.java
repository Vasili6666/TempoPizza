package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class PossibilityToChangeLocationTest extends TestBase{

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка возможности выбора города")
    void checkPossibilityToChangeLocation() {
       mainPage.openPage();
       mainPage.openChangeCityPopup();
       mainPage.checkChangeCityPopup();

    }
}
