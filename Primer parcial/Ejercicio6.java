//[Ejercicio6.](Potencia de un Numero)

//[Descripción: Crea un endpoint que reciba dos números: base y exponente, y devuelva el resultado de la potencia]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/potencia")
public class Ejercicio6Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calcularPotencia(@QueryParam("base") double base, @QueryParam("exponente") double exponente) {
        double resultado = Math.pow(base, exponente);
        return base + " elevado a " + exponente + " es " + resultado;
    }
}
