package com.example;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/segundo-parcial")
public class SegundoParcialResource {

    // Inyectamos el servicio
    @Inject
    SegundoParcialService segundoParcialService;

    // Endpoint para procesar los palíndromos
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response procesarPalindromos(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                           .entity("La lista no puede estar vacía o ser nula.")
                           .build();
        }

        int totalPalindromos = segundoParcialService.contarPalindromos(lista);
        List<String> listaPalindromos = segundoParcialService.obtenerPalindromos(lista);

        return Response.ok(new ResultadoPalindromos(totalPalindromos, listaPalindromos)).build();
    }
}

// Clase para envolver la respuesta
class ResultadoPalindromos {
    public int TotalPalindromos;
    public List<String> ListaPalindromos;

    public ResultadoPalindromos(int totalPalindromos, List<String> listaPalindromos) {
        this.TotalPalindromos = totalPalindromos;
        this.ListaPalindromos = listaPalindromos;
    }
}
