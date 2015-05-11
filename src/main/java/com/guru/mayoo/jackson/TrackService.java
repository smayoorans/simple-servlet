package com.guru.mayoo.jackson;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

<<<<<<< HEAD:src/main/java/com/guru/mayoo/jackson/JsonService.java
@Path("/json/metallica")
<<<<<<< HEAD:src/main/java/com/guru/mayoo/jackson/JsonService.java
public class JsonService {
=======
public class TrackService {
>>>>>>> parent of 509f9f0... Refactoring round 2:src/main/java/com/guru/mayoo/jackson/TrackService.java
=======
@Path("/json/track")
public class TrackService {
>>>>>>> 509f9f083de8ac79a33b6b3a0d3e3445968c2958:src/main/java/com/guru/mayoo/jackson/TrackService.java

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Like a Rolling Stone ");
        track.setSinger("Mayooran");
        return track;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {

        String result = "Track saved : " + track;
        return Response.status(200).entity(result).build();

    }

}
