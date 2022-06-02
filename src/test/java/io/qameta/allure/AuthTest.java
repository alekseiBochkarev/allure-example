package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Microservice("UAA")
@Owner("eroshenkoam")
@Feature("Авторизация")
@Story("Внешняя авторизация")
public class AuthTest {

    @Test
    @AllureId("1535")
    @JiraIssue("AE-1")
    @DisplayName("Авторизация через Apple")
    public void testAppleAuth() {
        step("Открываем главную страницу");
        step("Выбираем способ авторизации через Apple");
        step("Авторизуемся как пользователь `Mr. Random`", () -> {
            step("Вводим логин `random-user@gmail.com`");
            step("Вводим пароль `random-pass`");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что авторизовались успешно", () -> {
            step("Логин `random-user`");
            step("Имя `Mr. Random`");
            step("Email `random-user@gmail.com`");
        });
        step("Разлогиниваемся");
    }

    @Test
    @AllureId("1534")
    @DisplayName("Авторизация через Facebook")
    public void testFacebookAuth() {
        step("Открываем главную страницу");
        step("Выбираем способ авторизации через Facebook");
        step("Авторизуемся как пользователь `Mr. Random`", () -> {
            step("Вводим логин `random-user@gmail.com`");
            step("Вводим пароль `random-pass`");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что авторизовались успешно", () -> {
            step("Логин `random-user`");
            step("Имя `Mr. Random`");
            step("Email `random-user@gmail.com`");
        });
        step("Разлогиниваемся");
    }

}
