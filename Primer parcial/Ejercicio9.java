//[Ejercicio9.](Sumatoria de Arreglo)

//[Descripción: Crea un endpoint que reciba un arreglo de números y devuelva la sumatoria de los elementos.]

```java
package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Path("/sumatoria-arreglo")
public class Ejercicio9Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sumarElementos(@QueryParam("arreglo") List<Integer> arreglo) {
        int suma = arreglo.stream().mapToInt(Integer::intValue).sum();
        return "La sumatoria de los elementos del arreglo es: " + suma;
    }
}
