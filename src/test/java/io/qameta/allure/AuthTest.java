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

}
