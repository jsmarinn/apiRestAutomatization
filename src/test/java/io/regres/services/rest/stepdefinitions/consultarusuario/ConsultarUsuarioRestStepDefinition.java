package io.regres.services.rest.stepdefinitions.consultarusuario;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;
import io.regres.services.rest.questions.RespuestaServicioConsultarUsuarios;
import io.regres.services.rest.task.consultarUsuario.ConsultarUsuariosTask;

import static io.regres.services.rest.utils.Constante.VALUE_SUCCESS_GET;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarUsuarioRestStepDefinition
{
    @Cuando("se consulta usuarios")
    public void seConsultaUsuarios() {
        theActorInTheSpotlight().attemptsTo(ConsultarUsuariosTask.all());

    }
    @Entonces("se visualiza la respuesta exitosa")
    public void seVisualizaLaRespuestaExitosa() {
        theActorInTheSpotlight().should(seeThat(RespuestaServicioConsultarUsuarios.es(VALUE_SUCCESS_GET)));
    }
}
