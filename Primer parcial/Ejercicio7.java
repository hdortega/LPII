//[Ejercicio7.](Número Perfecto)

//[Descripción: Crea un endpoint que reciba un número y determine si es un número perfecto (igual a la suma de sus divisores propios)]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/numero-perfecto")
public class Ejercicio7Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String esNumeroPerfecto(@QueryParam("numero") int numero) {
        if (esPerfecto(numero)) {
            return numero + " es un número perfecto,guapisimo.";
        } else {
            return numero + " no es un número perfecto. Ivai";
        }
    }

    private boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; ++i) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}