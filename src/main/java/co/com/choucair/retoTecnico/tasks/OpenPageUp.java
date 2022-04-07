package co.com.choucair.retoTecnico.tasks;

import co.com.choucair.retoTecnico.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.retoTecnico.userinterface.UTestPage.*;

public class OpenPageUp implements Task {
    private UTestPage utestPage;
    public static OpenPageUp thePage() {
        return Tasks.instrumented(OpenPageUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage),
                Click.on(BUTTON_REGISTER));
    }
}
