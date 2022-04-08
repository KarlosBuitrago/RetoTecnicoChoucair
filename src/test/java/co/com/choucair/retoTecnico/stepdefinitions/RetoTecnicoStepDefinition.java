package co.com.choucair.retoTecnico.stepdefinitions;

import co.com.choucair.retoTecnico.model.RegisterTestData;
import co.com.choucair.retoTecnico.questions.Answer;
import co.com.choucair.retoTecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage( new OnlineCast());
    }

    @Given("^that Carlos wants create a new user in the platform$")
    public void that_Carlos_wants_create_a_new_user_in_the_platform() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenPageUp.thePage());

    }

    @When("^he fill all inputs in the platform$")
    public void heFillAllInputsInThePlatform(List<RegisterTestData> data) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.OnThePage(data), LocationInformation.onPage(data),
                DevicesInformation.onOtherPage(data), LastStepInformation.theLastPage(data)
        );
    }

    @Then("^is confirmed the new user created$")
    public void is_confirmed_the_new_user_created(List<RegisterTestData> data) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toTheData(data)));
    }

}
