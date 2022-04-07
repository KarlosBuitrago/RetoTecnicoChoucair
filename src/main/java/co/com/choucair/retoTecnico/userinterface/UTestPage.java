package co.com.choucair.retoTecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://utest.com/")
public class UTestPage extends PageObject {
    public static final Target BUTTON_REGISTER = Target
            .the("This button to register")
            .located(By.xpath("//*[@class='nav navbar-nav']//*[contains(text(), 'Join Today')]"));
}
