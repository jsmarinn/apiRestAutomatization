package io.regres.services.rest.runners.eliminarUsuario;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/feature/eliminarUsuario/eliminar_usuario.feature"},
        glue = {"io.regres.services.rest.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class EliminarUsuarioRestRunner {
}
