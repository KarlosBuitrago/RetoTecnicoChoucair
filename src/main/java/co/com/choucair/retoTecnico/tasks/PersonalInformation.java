package co.com.choucair.retoTecnico.tasks;

import co.com.choucair.retoTecnico.model.RegisterTestData;
import co.com.choucair.retoTecnico.userinterface.registro.PersonalInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.retoTecnico.userinterface.registro.PersonalInformationPage.*;

public class PersonalInformation implements Task {
     private PersonalInformationPage personalInformationPage;
    private List<RegisterTestData> data;

    public PersonalInformation(List<RegisterTestData> data) {
        this.data = data;
    }

    public static PersonalInformation OnThePage(List<RegisterTestData> data) {
       return Tasks.instrumented(PersonalInformation.class, data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrName()).into(NAME_INPUT),
                Enter.theValue(data.get(0).getStrLastName()).into(LASTNAME_INPUT),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL_INPUT),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(MONTH_SELECT),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(DAY_SELECT),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(YEAR_SELECT),
                Enter.theValue(data.get(0).getStrLanguage()).into(LANGUAGE_LIST),
                Click.on(LANGUAGE_SELECT.of(data.get(0).getStrLanguage())),
                Click.on(BUTTON_LOCATION)
        );
    }
}
