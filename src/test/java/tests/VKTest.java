package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

@Epic("QA.GURU automation course")
@Story("VK tests")
@Tag("vk")
public class VKTest {

    @Test
    @Description("Positive test editing")
    void VKEdit() {
 //       Configuration.headless = true;

        open(VKurl);
        $("#index_email").setValue(VKlogin); // вбиваем логин-почту
        $("#index_pass").setValue(VKpass); //пароль, можно добавить .pressEnter()
        $("#index_login_button").click(); //но мы не ищем лёгких путей - кликаем по кнопке
        $("#top_profile_link").click(); //переходим в профиль по ссылке в выпадающем меню сверху-справа
        $("#top_edit_link").click(); // и жмём редактировать
        $("#pedit_home_town").setValue(VKtown); //прописываем город
        $x("//button[contains(text(),'Сохранить')]").click(); //сохраняем кнопкой
        $x("//span[contains(@class, 'left_label inl_bl') and text()='Моя страница']").click();//переходим в профиль по ссылке из сайдбара
        $x("//span[contains(@class, 'profile_label_more')]").click(); //жмякаем "Показать подробную информацию"
        $x("//div[@class='profile_info']").shouldHave(text(VKtown)); //проверяем что в профиле есть наш город

    }
    }