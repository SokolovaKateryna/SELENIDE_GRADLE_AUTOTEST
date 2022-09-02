import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HelpPage;
import pages.MainPage;

public class MainPageTests extends BaseTest{
    MainPage mainPage = new MainPage();

    @BeforeClass

    public void closeSpanBtn() {
        mainPage.openMainPage()
                .spanBtnClick();
    }
    public void chooseCinemaName() {
        mainPage.CinemaNameClick();
    }

    @Test
    public void checkMenu() {
        mainPage.openMainPage()
                .menuBtnClick()
                .checkMenuText("ОСОБИСТИЙ КАБІНЕТ");
    }

    @Test
    public void checkSignInBtn() {
        mainPage.openMainPage()
                .menuBtnClick()
                .checkSignInBtn();
    }

    @Test
    public void checkMenuHelpLink() {
        HelpPage helpPage = mainPage
                .openMainPage()
                .menuBtnClick()
                .clickHelpLink();
        helpPage.checkPageTitle();
        helpPage.checkFaqHeader();
    }

    @Test
    public void checkMenuAboutUsLink() {
        mainPage.openMainPage()
                .menuBtnClick()
                .clickAboutUsLink()
                .checkTitle();
    }

    @Test
    public void checkRuLangLink() {
        mainPage.openMainPage()
                .menuBtnClick()
                .clickRuLangLink()
                .menuBtnClick()
                .checkActiveLangBtnText("ru");
    }

    @Test
    public void checkMenuCinemasLink() {
        mainPage.openMainPage()
                .menuBtnClick()
                .clickCinemasLink()
                .checkPageTitle();

    }



    }
