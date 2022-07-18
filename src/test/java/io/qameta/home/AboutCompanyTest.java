package io.qameta.home;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AboutCompanyTest {

    @Test
    @AllureId("11222")
    @DisplayName("Проверка наличия адреса компании")
    @Tags({@Tag("minor"), @Tag("web")})
    @Owner("allure8")
    @Feature("О компании")
    public void checkAddressOfCompany () {
        step("открыть страницу о компании");
        step("проверить наличия адреса компании");
    }

    @Test
    @AllureId("11223")
    @DisplayName("Проверка наличия лого компании и фото магазина на бэкграунде")
    @Tags({@Tag("minor"), @Tag("web")})
    @Owner("allure8")
    @Feature("О компании")
    public void checkLogoAndImages() {
        step("открыть страницу о компании");
        step("проверить лого магазина");
        step("проверить бэкграунд на наличие фото магазина");
    }

    @Test
    @AllureId("11213")
    @DisplayName("Проверка тайтла и дескрипшина")
    @Tags({@Tag("minor"), @Tag("web")})
    @Owner("allure8")
    @Feature("О компании")
    public void checkTitleAndDescription() {
        step("открыть страницу о компании");
        step("проверить тайтл на наличие названия");
        step("проверить дескрипшн на наличие описания");
    }
}
