package io.regres.services.rest.utils.enums;

public enum ServicioRest {
    BASE_URL("https://reqres.in"),
    CREAR_USUARIO("/api/users"),
    REGISTRAR_USUARIO("/api/register"),
    CONSULTAR_USUARIO("/api/users");

    private String uri;

    ServicioRest(String uri)
    {
        this.uri = uri;
    }
    @Override
    public String toString()
    {
        return uri;
    }

}
