package com.proyecto.prueba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;


@Path("serviciosSoporte")
@Produces("application/json")
public class ExampleServiceImpl implements ExampleService {
 
	@GET
    @Path("courses/{courseId}")
    public ExampleModel get(@PathParam("courseId") String courseId) {
        return new ExampleModel("example", 1001);
    }
	
	@GET
    @Path("obtenerCategoria")
	public String recibeMultiplesValores(@Context UriInfo ui){
		
		MultivaluedMap<String, String> map = ui.getQueryParameters();
	    String name = map.getFirst("name");
	    String age = map.getFirst("age");
	    System.out.println("Nombre:" + name);
	    System.out.println("Edad:" + age);
		
		return "ROJA";
	}
	@GET
    @Path("obtenerCategorias")
	public String obtenerCategorias(){
		String categorias ;
		
		categorias = "{\"Categorias\":"
				+ "{\"ROJA\":\"1\", \"AMARILLA\":\"2\", \"VERDE\":\"3\"}"
				+ "}";
		//{"ExampleModel":{"anInt":1001,"string":"example"}}
		return categorias;
	}
}