#language:es
Característica: Eliminar un usuario en Reqres_in
  Quiero eliminar un usuario

  @EliminarUsuario
  Esquema del escenario: Eliminación de un usuario
    Cuando se elimina el usuario el usuario con
      |idUsuario|
      |<idUsuario>|
    Entonces deberia obtener el codigo
      |codRespues|
      |<codRespues>|
    Ejemplos:
      |idUsuario|codRespues|
      |2        |204       |