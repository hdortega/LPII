//[Ejercicio1.]( Generar Números Primos)

//[Descripción: Crea un endpoint que reciba un número n y devuelva los primeros n números primos...]

```java

package org.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/primos")
public class Ejercicio1Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Integer> getPrimos(@QueryParam("n") int n) {
        return primerosNPrimos(n);
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i * i <= numero; ++i) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    private List<Integer> primerosNPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2;
        while (primos.size() < n) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            ++numero;
        }
        return primos;
    }
}
```
