#language:es
  Característica: Crear un usuario en Reqres_in
    Quiero crear un usuario

    @CrearUsuario
    Esquema del escenario: Creación de un usuario
      Cuando se crea el usuario
        |name|job|
        |<name>|<job>|
      Entonces deberia ver el usuario creado
      Ejemplos:
        |name|job|
        |Jhon|java|

    @RegistrarUsuario
    Esquema del escenario: Registro de un usuario
      Cuando se registra el usuario
        |username|email|password|
        |<username>|<email>|<password>|
      Entonces deberia ver el usuario registrado
      Ejemplos:
        |username|email|password|
        |user01  |eve.holt@reqres.in|user01@|