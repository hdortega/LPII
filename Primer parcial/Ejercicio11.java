//[Ejercicio11](Número Armstrong)

//[Descripción: Crea un endpoint que reciba un número y determine si es un número Armstrong (número que es igual a la suma de sus dígitos elevados a la potencia del número de dígitos)]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/armstrong")
public class Ejercicio11Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String esNumeroArmstrong(@QueryParam("numero") int numero) {
        if (esArmstrong(numero)) {
            return numero + " es un número Armstrong.";
        } else {
            return numero + " no es un número Armstrong.";
        }
    }

    private boolean esArmstrong(int numero) {
        int original = numero;
        int suma = 0;
        int n = 0;

        // Contar el número de dígitos
        while (original != 0) {
            original /= 10;
            ++n;
        }

        original = numero;

        // Calcular la suma de los dígitos elevados a la potencia n
        while (original != 0) {
            int digito = original % 10;
            suma += Math.pow(digito, n);
            original /= 10;
        }

        return suma == numero;
    }
}
