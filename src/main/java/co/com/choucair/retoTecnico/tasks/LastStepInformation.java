package co.com.choucair.retoTecnico.tasks;

import co.com.choucair.retoTecnico.model.RegisterTestData;
import co.com.choucair.retoTecnico.userinterface.registro.LastStepInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.retoTecnico.userinterface.registro.LastStepInformationPage.*;

public class LastStepInformation implements Task {

    private List<RegisterTestData> data;

    public LastStepInformation(List<RegisterTestData> data) {
        this.data = data;
    }

    public static LastStepInformation theLastPage(List<RegisterTestData> data) {
        return Tasks.instrumented(LastStepInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD_INPUT),
                Enter.theValue(data.get(0).getStrConfirmPassword()).into(CONFIRM_PASSWORD_INPUT),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMS_OF_USE),
                Click.on(CHECK_POLICY_PRIVACY),
                Click.on(COMPLETE_SETUP));
        
    }
}
