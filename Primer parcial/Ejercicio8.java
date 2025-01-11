//[Ejercicio8.](Calcular Factorial)

//[Descripción: Crea un endpoint que reciba un número y devuelva su factorial.]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/factorial")
public class Ejercicio8Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calcularFactorial(@QueryParam("numero") int numero) {
        if (numero < 0) {
            return "El factorial no está definido para números negativos.";
        }
        long resultado = calcularFactorial(numero);
        return "El factorial de " + numero + " es " + resultado;
    }

    private long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}
