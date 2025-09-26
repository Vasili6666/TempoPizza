package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static io.qameta.allure.Allure.step;

public class PossibilityToChangeLocationTest extends TestBase{

    Pages pages = new Pages();

    @Test
    @DisplayName("Проверка возможности выбора города")
    void checkPossibilityToChangeLocation() {
       pages.mainPage.openPage();
       pages.mainPage.openChangeCityPopup();
       pages.mainPage.checkChangeCityPopup();

    }
}
