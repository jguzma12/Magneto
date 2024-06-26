#language:es
Característica: Se realiza la compra

  Escenario: El usuario comprara una maleta
    Dado el usuario entra en la pagina
      | usuario       | contrasena   |
      | standard_user | secret_sauce |
    Cuando el usuario compra la maleta
      | nombre | apellido | zip    |
      | Juan   | Guzman   | 050035 |
    Entonces el usuario deberia ver su compra realizada con exito
