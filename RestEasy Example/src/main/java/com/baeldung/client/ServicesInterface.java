package com.baeldung.client;

import com.baeldung.Movie;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public interface ServicesInterface {


    @GET
    @Path("/getinfo")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    Movie movieByImdbID(@QueryParam("imdbID") String imdbID);


    @POST
    @Path("/addmovie")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    Response addMovie(Movie movie);


    @PUT
    @Path("/updatemovie")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    Response updateMovie(Movie movie);


    @DELETE
    @Path("/deletemovie")
    Response deleteMovie(@QueryParam("imdbID") String imdbID);


    @GET
    @Path("/listmovies")
    @Produces({"application/json"})
    List<Movie> listMovies();

}
