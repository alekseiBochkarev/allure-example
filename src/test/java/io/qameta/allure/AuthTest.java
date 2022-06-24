package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Авторизация")
@Owner("eroshenkoam")
@Story("Авторизация через сторонние системы")
public class AuthTest {

    @Test
    @AllureId("10647")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("blocker"), @Tag("web")})
    public void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь `Mr. Random`", () -> {
            step("Вводим логин `random-user-123`");
            step("Вводим пароль `random-pass-123`");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя `Mr. Random`");
            step("Login `random-user-123`");
        });
        step("Разлогиниваемся");
    }

    @Test
    @AllureId("10649")
    @DisplayName("Авторизация через GitHub")
    @Tags({@Tag("blocker"), @Tag("web")})
    public void testGitHubAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Github");
        step("Авторизуемся как пользователь `Мистер Рандом`", () -> {
            step("Вводим логин `random-user`");
            step("Вводим пароль `random-pass`");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GitHub", () -> {
            step("Имя `Мистер Рандом`");
            step("Login `random-user`");
        });
        step("Разлогиниваемся");
    }

    @Test
    @AllureId("10648")
    @DisplayName("Авторизация через Facebook")
    @Tags({@Tag("blocker"), @Tag("web")})
    public void testFacebookAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Facebook");
        step("Авторизуемся как пользователь Artem Eroshenko", () -> {
            step("Вводим логин eroshenkoam@gmail.com");
            step("Вводим пароль 12398123981231");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GoogleFacebook", () -> {
            step("Имя Artem Eroshenko");
            step("Login eroshenkoam");
            step("Авататарка");
        });
        step("Разлогиниваемся");
    }


    @Test
    @DisplayName("Авторизация через Apple")
    @Tags({@Tag("blocker"), @Tag("web")})
    public void testAppleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Apple");
        step("Авторизуемся как пользователь `Mr. Apple`", () -> {
            step("Вводим логин random@icloud.com");
            step("Вводим пароль 123123-123123-123123-123123");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Apple", () -> {
            step("Имя `Mr. Apple`");
            step("Login `mr-random`");
            step("Авататарка");
        });
        step("Разлогиниваемся");
    }
}
