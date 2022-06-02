package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("eroshenkoam")
@Feature("Авторизация")
@Story("Внешняя авторизация")
public class AppleTest {

    @Test
    @AllureId("1532")
    @DisplayName("Авторизация через Apple")
    public void testAuth() {
        step("Открываем главную страницу");
        step("Выбираем способ авторизации Apple");
        step("Авторизуемся как пользователь `random-user`", () -> {
            step("Вводим логин `random-user`");
            step("Вводим пароль `random-pass`");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что авторизовались правильно", () -> {
            step("Логин `random-user`");
            step("Имя `Mr Random`");
            step("Аватарка");
        });
    }

    @Test
    @AllureId("1531")
    @DisplayName("Авторизация через Facebook")
    public void authFacebook() {
        step("Открываем главную страницу");
        step("Выбираем способ авторизации Facebook");
        step("Авторизуемся как пользователь `random-user`", () -> {
            step("Вводим логин `random-user`");
            step("Вводим пароль `random-pass`");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что авторизовались правильно", () -> {
            step("Логин `random-user`");
            step("Имя `Mr Random`");
        });
    }

}
