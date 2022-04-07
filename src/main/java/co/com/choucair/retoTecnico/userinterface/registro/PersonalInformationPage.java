package co.com.choucair.retoTecnico.userinterface.registro;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PersonalInformationPage extends PageObject {

    public static final Target NAME_INPUT = Target
            .the("Enter the value first name")
            .located(By.id("firstName"));

    public static final Target LASTNAME_INPUT = Target
            .the("Enter the value apellido")
            .located(By.id("lastName"));

    public static final Target EMAIL_INPUT = Target
            .the("enter the value email")
            .located(By.id("email"));

    public static final Target MONTH_SELECT = Target
            .the("Select month")
            .located(By.id("birthMonth"));

    public static final Target DAY_SELECT = Target
            .the("select day")
            .located(By.id("birthDay"));

    public static final Target YEAR_SELECT = Target
            .the("Select year")
            .located(By.id("birthYear"));

    public static final Target LANGUAGE_SELECT = Target
            .the("Select year")
            .locatedBy("//*[@class='ui-select-choices-row-inner']//*[contains(text(), '{0}')]");

    public static final Target LANGUAGE_LIST = Target
            .the("Select year")
            .locatedBy("//*[@id='languages']/div[1]/input");

    public static final Target BUTTON_LOCATION = Target
            .the("Select year")
            .located(By.xpath("//a[@class='btn btn-blue']"));



}
