package co.com.choucair.certification.choucairPrueba.stepdefinitions;

import co.com.choucair.certification.choucairPrueba.model.UtestData;
import co.com.choucair.certification.choucairPrueba.questions.Answer;
import co.com.choucair.certification.choucairPrueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants to create user in utest$")
    public void thanCarlosWantsToCreateUserInUtest(List<UtestData> utestData) throws Exception{
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), (Register.onThePage(utestData.get(0))));
    }


    @When("^assignee city and password continue use$")
    public void assigneeCityAndPasswordContinueUse(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().wasAbleTo(Location.onThePage(utestData.get(0).getStrCity(), utestData.get(0).getStrZip(), utestData.get(0).getStrCountry()));
        OnStage.theActorInTheSpotlight().wasAbleTo(Devices.onThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(Password.the(utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPassword()));
    }

    @Then("^he finds the page init$")
    public void heFindsThePageInit(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrConfirmPage())));
    }

}
