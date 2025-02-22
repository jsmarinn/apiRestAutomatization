package io.regres.services.rest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static io.regres.services.rest.utils.enums.ServicioRest.REGISTRAR_USUARIO;

public class WithPostRegister implements Interaction{
    private String body;

    public WithPostRegister (String body){
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(REGISTRAR_USUARIO.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type","application/json").body(body))
        );
    }
}
