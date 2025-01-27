package com.example.service;

import com.example.model.Gasto;
import com.example.repository.GastoRepository;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/gastos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GastoService {

    private GastoRepository gastoRepository = new GastoRepository();

    @GET
    public List<Gasto> getAllGastos() {
        return gastoRepository.getAllGastos();
    }

    @GET
    @Path("/{id}")
    public Gasto getGastoById(@PathParam("id") int id) {
        return gastoRepository.getGastoById(id);
    }

    @POST
    public void addGasto(Gasto gasto) {
        gastoRepository.addGasto(gasto);
    }

    @PUT
    @Path("/{id}")
    public void updateGasto(@PathParam("id") int id, Gasto gasto) {
        gastoRepository.updateGasto(id, gasto);
    }

    @DELETE
    @Path("/{id}")
    public void deleteGasto(@PathParam("id") int id) {
        gastoRepository.deleteGasto(id);
    }

    @GET
    @Path("/promedio")
    public double getPromedioGastos() {
        return gastoRepository.getPromedioGastos();
    }

    @GET
    @Path("/rango")
    public List<Gasto> getGastosPorRango(@QueryParam("inicio") long inicio, @QueryParam("fin") long fin) {
        return gastoRepository.getGastosPorRangoFecha(inicio, fin);
    }
}
