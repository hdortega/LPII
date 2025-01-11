@Path("/segundo-parcial-constructor")
public class SegundoParcialConstructorResource {

    private final SegundoParcialService segundoParcialService;

    // Inyección por constructor
    public SegundoParcialConstructorResource(SegundoParcialService segundoParcialService) {
        this.segundoParcialService = segundoParcialService;
    }

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
