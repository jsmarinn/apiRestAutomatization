package io.regres.services.rest.interactions.consultarusuario;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsumoServicioConsultar {

    private ConsumoServicioConsultar(){}

    public static All all(){
        return instrumented(All.class);
    }
}
