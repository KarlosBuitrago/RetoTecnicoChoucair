package co.com.choucair.retoTecnico.tasks;

import co.com.choucair.retoTecnico.model.RegisterTestData;
import co.com.choucair.retoTecnico.userinterface.registro.LocationInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.retoTecnico.userinterface.registro.LocationInformationPage.*;

public class LocationInformation implements Task {
    private LocationInformationPage locationInformationPage;
    private List<RegisterTestData> data;

    public LocationInformation(List<RegisterTestData> data) {
        this.data = data;
    }

    public static LocationInformation onPage(List<RegisterTestData> data) {
        return Tasks.instrumented(LocationInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.keyValues(data.get(0).getStrCodePostal()).into(CODE_POSTAL),
                Hit.the(Keys.ARROW_DOWN).into(CODE_POSTAL),
                Hit.the(Keys.ENTER).into(CODE_POSTAL),
                Click.on(COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(SELECT_COUNTRY),
                Click.on(NEXT_DEVICE));
    }
}
