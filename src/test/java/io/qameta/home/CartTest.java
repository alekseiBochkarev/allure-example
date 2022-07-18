package io.qameta.home;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CartTest {

    @Test
    @AllureId("11215")
    @DisplayName("Добавление товара в корзину")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Owner("allure8")
    @Feature("Операции с корзиной")
    public void addItemToCart () {
        step("Открыть главную страницу сайта");
        step("Добавить товар в корзину и проверить что товар добавлен", () -> {
            step("Добавить товар в корзину");
            step("Открыть корзину");
            step("Проверить наличие добавленного товара");
        });
    }

    @Test
    @AllureId("11216")
    @DisplayName("Удаление товара из корзины")
    @Tags({@Tag("major"), @Tag("web")})
    @Owner("allure8")
    @Feature("Операции с корзиной")
    public void deleteItemFromCart() {
        step("Открываем корзину");
        step("Кликаем по кнопке удалить товар");
        step("Проверяем отсутствие товара");
        step("Открываем главную страницу");
        step("Открываем корзину и проверяем что товар отсутствует");
    }
}
