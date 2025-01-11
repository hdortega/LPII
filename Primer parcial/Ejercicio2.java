//[Ejercicio2.]( Suma de Digitos)

//[Descripción: Crea un endpoint que reciba un número n y devuelva la suma de sus digitos...]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/suma-digitos")
public class Ejercicio2Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sumaDigitos(@QueryParam("numero") int numero) {
        if (numero >= -9 && numero <= 9) {
            return "El numero tiene un solo digito. Por favor, introduce un número con más de un digito.";
        }
        int suma = calcularSumaDigitos(numero);
        return "La suma de los digitos de " + numero + " es " + suma;
    }

    private int calcularSumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}