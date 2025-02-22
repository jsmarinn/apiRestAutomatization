package io.regres.services.rest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class RespuestaServicioConsultarUsuarios implements Question<Boolean> {
    private int codigo;

    public RespuestaServicioConsultarUsuarios(int codigo){
        this.codigo = codigo;
    }

    public static RespuestaServicioConsultarUsuarios es(int codigo){
        return new RespuestaServicioConsultarUsuarios(codigo);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        return lastResponse().statusCode() == codigo;
    }
}
