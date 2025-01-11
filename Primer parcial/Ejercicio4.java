//[Ejercicio4.]( Ordenar Arreglo)

//[Descripción: Crea un endpoint que reciba un arreglo de números y devuelva el arreglo ordenado (algoritmo de ordenación a elección).]

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

@Path("/ordenar-arreglo")
public class Ejercicio4Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Integer> ordenarArreglo(@QueryParam("arreglo") List<Integer> arreglo) {
        return arreglo.stream().sorted().collect(Collectors.toList());
    }
}