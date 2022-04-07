package co.com.choucair.retoTecnico.userinterface.registro;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LocationInformationPage extends PageObject {
    public static final Target CITY = Target
            .the("Input for information of city")
            .located(By.id("city"));
    public static final Target CODE_POSTAL = Target
            .the("Input for information of code postal")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target
            .the("Input for information of country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target SELECT_COUNTRY = Target
            .the("Input for select the country of the list")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_DEVICE = Target
            .the("Button for page devices")
            .located(By.xpath("//*[@class='btn btn-blue pull-right']//*[contains(text(), 'Next: Devices')]"));
}
