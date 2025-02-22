package io.regres.services.rest.utils;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static io.regres.services.rest.utils.enums.ServicioRest.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BeforeHook {
    @Before
    public void prepararEscenario()
    {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Actor").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
