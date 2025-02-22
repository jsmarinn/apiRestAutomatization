package io.regres.services.rest.task.crearUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import io.regres.services.rest.models.Usuario;
import io.regres.services.rest.interactions.ConsumoServicio;
import net.serenitybdd.screenplay.Tasks;

public class CrearUsuarioRest implements Task {
   private Usuario usuario;

   public CrearUsuarioRest (Usuario usuario){
       this. usuario = usuario;
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumoServicio.withPost(usuario.toString()));
    }

   public static CrearUsuarioRest with(Usuario usuario){
       return Tasks.instrumented(CrearUsuarioRest.class,usuario);
   }


}
