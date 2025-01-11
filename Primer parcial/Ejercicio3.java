//[Ejercicio3.]( Secuencia de Fibbonacci)

//[Descripción: Crea un endpoint que reciba un número n y devuelva los primeros n números de la secuencia de Fibonacci....]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/fibonacci")
public class Ejercicio3Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Integer> getFibonacci(@QueryParam("n") int n) {
        return generarFibonacci(n);
    }

    private List<Integer> generarFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        if (n <= 0) return fibonacci;
        fibonacci.add(0);
        if (n == 1) return fibonacci;
        fibonacci.add(1);
        for (int i = 2; i < n; ++i) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }
        return fibonacci;
    }
}
