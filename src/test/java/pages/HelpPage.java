package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



public class HelpPage {
    SelenideElement faqHeader = $("h1.faq-container--header");

    public void openAboutPage() {
        open(baseUrl + "/faq#open_feedbeck_menu");
    }

    public void checkPageTitle() {
        assertThat(title(), equalTo("Допомога - Кінотеатр Multiplex | Київ, Харків, Дніпро, Херсон і вся Україна"));
    }

    public void checkFaqHeader() {
        assertThat(faqHeader.text(), equalTo("Поширені питання"));
    }
}
