
package tests;

        import com.codeborne.selenide.Condition;
        import com.codeborne.selenide.Configuration;
        import io.qameta.allure.Description;
        import io.qameta.allure.Epic;
        import io.qameta.allure.Story;
        import org.junit.jupiter.api.Tag;
        import org.junit.jupiter.api.Test;
        import pages.YandexMarketPage;

        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.*;
        import static helpers.Environment.itemY;
        import static helpers.Environment.urlY;

@Epic("QA.GURU automation course")
        @Story("Market tests")
        @Tag("market")
        class YandexMarketTest extends TestBase {

        @Test
        @Description("Positive test with itemY")
        void successfulSearch() {
                Configuration.headless = true;

        YandexMarketPage marketPage = new YandexMarketPage();
        open(urlY); //переходим на ЯндексМаркет
        marketPage.typeSearch(itemY); //логика работы со страницей(вбиваем название товара и жмём Enter)
        $x("//h3/a[1]").click(); //кликаем по первому выданному товару
        switchTo().window(1); //переходим на открывшуюся вкладку с товаром
         $("h1").shouldHave(text(itemY)); //проверяем что в заголовке есть заданное имя товара

        }
}