package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement menuBtn = $(".menu-btn");
    SelenideElement menuText = $(".mob_container > .menu-block > .menu-block-heading");
    SelenideElement signInBtn = $(".menu-block > a");
    SelenideElement spanBtn = $(".other > span");
    SelenideElement cinemaName = $(".menu.right_menu.animatedlong.slideInUp > div:nth-child(3) > div:nth-child(3) > div > p.cname_s.cname > span");
    SelenideElement aboutUsLink = $(".menu_list > a:nth-child(8)");

    SelenideElement activeLangBtn = $("ul.langs > li.active > a");
    SelenideElement helpLink = $x("//a[text()='Допомога']");
    SelenideElement ruLangLink = $x("//a[text()='ru']");
    SelenideElement cinemaLink = $x("//a[text()='Кінотеатри']");

    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    public MainPage spanBtnClick() {
        spanBtn.shouldBe(visible).click();
        return this;
    }

    public MainPage CinemaNameClick() {
        cinemaName.shouldBe(visible).click();
        return this;
    }
    public MainPage menuBtnClick() {
        menuBtn.shouldBe(visible).click();
        return this;
    }
    public void checkMenuText(String text) {
        menuText.shouldHave(exactText(text));
    }

    public void checkSignInBtn() {
        signInBtn.shouldBe(visible).shouldBe(exist);
    }

    public AboutUsPage clickAboutUsLink() {
        aboutUsLink.shouldBe(visible).click();
        return new AboutUsPage();
    }

    public HelpPage clickHelpLink() {
        helpLink.shouldBe(visible).click();
        return new HelpPage();
    }

    public MainPage clickRuLangLink() {
        ruLangLink.shouldBe(visible).click();
        return this;
    }

    public CinemasPage clickCinemasLink() {
        cinemaLink.shouldBe(visible).click();
        return new CinemasPage();
    }

    public void checkActiveLangBtnText(String text) {
        activeLangBtn.shouldHave(exactText(text));
    }
}
