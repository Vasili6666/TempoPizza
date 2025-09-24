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
        step("Открываем главную страницу", () ->{
            pages.mainPage.openPage();
        });

        step("Нажимаем кнопку выбора региона", () ->{
            pages.mainPage.openChangeCityPopup();
        });

        step("Проверяем открытие окна выбора региона", () ->{
            pages.mainPage.checkChangeCityPopup();
        });






    }
}
