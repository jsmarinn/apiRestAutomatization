package io.regres.services.rest.task.registrarUsuario;

import io.regres.services.rest.interactions.ConsumoServicio;
import io.regres.services.rest.models.RegistroUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuarioRest implements Task{
    private RegistroUsuario usuario;

    public RegistrarUsuarioRest(RegistroUsuario usuario)
    {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumoServicio.withPostRegister(usuario.toString()));
    }

    public static RegistrarUsuarioRest with(RegistroUsuario usuario)
    {
        return instrumented(RegistrarUsuarioRest.class,usuario);
    }
}
