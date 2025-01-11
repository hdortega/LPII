
//[Ejercicio10.](Máximo Común Divisor (MCD))

//[Descripción: Crea un endpoint que reciba dos números y devuelva su máximo común divisor (MCD)]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/mcd")
public class Ejercicio10Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calcularMCD(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
        int mcd = calcularMCD(num1, num2);
        return "El máximo común divisor de " + num1 + " y " + num2 + " es " + mcd;
    }

    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
