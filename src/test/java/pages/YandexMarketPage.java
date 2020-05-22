package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class YandexMarketPage {
    // Здесь храним элементы и css/xpath локаторы к ним
    SelenideElement searchInput = $("#header-search"),
            htmlBody = $("html");

    // Здесь реализована логика работы со страницей
    public void typeSearch(String itemY) {
        searchInput.val(itemY).pressEnter();
    }
    public void verifySearchHasResult(String itemY) {
        htmlBody.shouldHave(text(itemY)); // тоже самое, что и $(byText(text)).shouldBe(visible);
    }

}
