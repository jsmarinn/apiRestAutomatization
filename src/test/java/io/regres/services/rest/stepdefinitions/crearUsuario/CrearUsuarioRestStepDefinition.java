package io.regres.services.rest.stepdefinitions.crearUsuario;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;
import io.regres.services.rest.models.RegistroUsuario;
import io.regres.services.rest.models.Usuario;
import io.regres.services.rest.task.crearUsuario.CrearUsuarioRest;
import io.regres.services.rest.questions.RespuestaServicioCrearUsuario;
import io.regres.services.rest.task.registrarUsuario.RegistrarUsuarioRest;
import io.regres.services.rest.utils.Constante;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuarioRestStepDefinition {

    @Cuando("se crea el usuario")
    public void seCreaElUsuario(DataTable dataUsuario) {
        List<List<String>> listaUsuario = dataUsuario.asLists();
        Usuario usuario = new Usuario(listaUsuario.get(1).get(0),listaUsuario.get(1).get(1));
        theActorInTheSpotlight().attemptsTo(CrearUsuarioRest.with(usuario));
    }

    @Cuando("se registra el usuario")
    public void seRegistraElUsuario(DataTable dataRegistroUsuario) {
        List<List<String>> listRegistroUsuario = dataRegistroUsuario.asLists();
        RegistroUsuario registroUsuario = new RegistroUsuario(listRegistroUsuario.get(1).get(0),listRegistroUsuario.get(1).get(1),listRegistroUsuario.get(1).get(2));
        theActorInTheSpotlight().attemptsTo(RegistrarUsuarioRest.with(registroUsuario));
    }

    @Entonces("deberia ver el usuario creado")
    public void deberiaVerElUsuarioCreado() {
        theActorInTheSpotlight().should(seeThat(RespuestaServicioCrearUsuario.es(Constante.VALUE_SUCCESS)));
    }

    @Entonces("deberia ver el usuario registrado")
    public void deberiaVerElUsuarioRegistrado() {
        theActorInTheSpotlight().should(seeThat(RespuestaServicioCrearUsuario.es(Constante.VALUE_SUCCESS_REGISTER)));
    }
}