package io.regres.services.rest.interactions.consultarusuario;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static io.regres.services.rest.utils.enums.ServicioRest.CONSULTAR_USUARIO;

public class All implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(CONSULTAR_USUARIO.toString())
                .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                        .headers("accept","application/json")));
    }


}
