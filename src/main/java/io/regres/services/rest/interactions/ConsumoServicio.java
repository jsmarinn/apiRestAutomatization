package io.regres.services.rest.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumoServicio {

    private ConsumoServicio(){
    }

    public static WithPost withPost(String body){
        return Tasks.instrumented(WithPost.class,body);
    }

    public static WithPostRegister withPostRegister(String body){
        return Tasks.instrumented(WithPostRegister.class, body);
    }

}
