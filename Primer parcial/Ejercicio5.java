//[Ejercicio5.](Numero Capicua)

//[Descripción: Crea un endpoint que reciba un número y determine si es un número capicúa (palíndromo).]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/capicua")
public class Ejercicio5Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String esCapicua(@QueryParam("numero") int numero) {
        if (esNumeroCapicua(numero)) {
            return numero + " El numero es Capicua.";
        } else {
            return numero + " El numero ni es Capicua.";
        }
    }

    private boolean esNumeroCapicua(int numero) {
        int original = numero;
        int reverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }

        return original == reverso;
    }
}
