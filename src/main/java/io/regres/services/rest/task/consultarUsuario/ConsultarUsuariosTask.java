package io.regres.services.rest.task.consultarUsuario;

import io.regres.services.rest.interactions.consultarusuario.ConsumoServicioConsultar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import io.regres.services.rest.models.Usuario;
import io.regres.services.rest.interactions.ConsumoServicio;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarUsuariosTask implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumoServicioConsultar.all());
    }

    public static ConsultarUsuariosTask all(){
        return instrumented(ConsultarUsuariosTask.class);
    }
}
