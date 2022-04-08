package co.com.choucair.retoTecnico.tasks;

import co.com.choucair.retoTecnico.model.RegisterTestData;
import co.com.choucair.retoTecnico.userinterface.registro.DevicesInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.retoTecnico.userinterface.registro.DevicesInformationPage.*;

public class DevicesInformation implements Task {
    private List<RegisterTestData> data;

    public DevicesInformation(List<RegisterTestData> data) {
        this.data = data;
    }

    public static DevicesInformation onOtherPage(List<RegisterTestData> data) {
        return Tasks.instrumented(DevicesInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTAINER_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(COMPUTER),
                Hit.the(Keys.ENTER).into(COMPUTER),
                Click.on(CONTAINER_VERSION),
                Enter.theValue(data.get(0).getStrVersionComputer()).into(VERSION),
                Hit.the(Keys.ENTER).into(VERSION),
                Click.on(CONTAINER_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguageComputer()).into(LANGUAGE),
                Hit.the(Keys.ENTER).into(LANGUAGE),
                Click.on(CONTAINER_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(MOBILE),
                Hit.the(Keys.ENTER).into(MOBILE),
                Click.on(CONTAINER_MODEL),
                Enter.theValue(data.get(0).getStrModelMobile()).into(MODEL),
                Hit.the(Keys.ENTER).into(MODEL),
                Click.on(CONTAINER_OPERATING_SYSTEM),
                Enter.theValue(data.get(0).getStrOperatingSystem()).into(OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(OPERATING_SYSTEM),
                Click.on(LAST_STEP)
        );
    }
}
