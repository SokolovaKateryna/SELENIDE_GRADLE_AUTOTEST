package pages;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CinemasPage {

    public void openCinemasPage() {
        open(baseUrl + "/cinemas");
    }

    public void checkPageTitle() {
        assertThat(title(), equalTo("Кінотеатри MULTIPLEX | Київ, Харків, Дніпро, Херсон, Львів, Одеса, Черкаси та Кривий Ріг"));
    }
}
