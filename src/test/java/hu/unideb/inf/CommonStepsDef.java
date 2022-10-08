package hu.unideb.inf;

import io.cucumber.java.en.Given;

public class CommonStepsDef extends  AbstractStepDefs{

    @Given("the homepage is opened")
    public void theHomePageIsOpened() { homePage.openPage(); }
}
