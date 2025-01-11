 //Crea un endpoint que reciba un número entero y lo convierta a su representación binaria.]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/convertir-binario")
public class Ejercicio12Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String convertirABinario(@QueryParam("numero") int numero) {
        return "La representación binaria de " + numero + " es " + aBinario(numero);
    }

    private String aBinario(int numero) {
        if (numero == 0) return "0";
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            binario.insert(0, numero % 2);
            numero /= 2;
        }
        return binario.toString();
    }
}
