package co.com.choucair.retoTecnico.questions;

import co.com.choucair.retoTecnico.model.RegisterTestData;
import co.com.choucair.retoTecnico.userinterface.registro.LastStepInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class Answer implements Question <Boolean>{

    private List<RegisterTestData> data;

    public Answer(List<RegisterTestData> data) {
        this.data = data;
    }

    public static Answer toTheData(List<RegisterTestData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textButton = Text.of(LastStepInformationPage.COMPLETE_SETUP).viewedBy(actor).asString();
        if (data.get(0).getStrButonLastStep().equals(textButton)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
