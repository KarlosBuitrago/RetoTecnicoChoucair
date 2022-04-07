package co.com.choucair.retoTecnico.userinterface.registro;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LastStepInformationPage extends PageObject {
    public static final Target PASSWORD_INPUT = Target
            .the("Enter the value first name")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target
            .the("Enter the value first name")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target
            .the("Enter the value first name")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS_OF_USE = Target
            .the("Enter the value first name")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_POLICY_PRIVACY = Target
            .the("Enter the value first name")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target
            .the("Enter the value first name")
            .located(By.xpath("//a[@class='btn btn-grey btn-rounded pull-left']//*[contains(text(),'chevron_left')]"));
}
