package io.regres.services.rest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class RespuestaServicioCrearUsuario implements Question<Boolean> {
    private int cod;

    public RespuestaServicioCrearUsuario(int cod){
        this.cod = cod;
    }

    public static RespuestaServicioCrearUsuario es(int cod){
        return new RespuestaServicioCrearUsuario(cod);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        int response = lastResponse().statusCode();
        System.out.println(lastResponse().body().print());
        return response == cod;
    }
}
