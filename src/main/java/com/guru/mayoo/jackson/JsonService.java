package com.guru.mayoo.jackson;

import org.codehaus.jackson.map.ObjectMapper;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/json/metallica")
public class JsonService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Mayooran");

        ObjectMapper mapper = new ObjectMapper();

        try {
            System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(track));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return track;

    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {

        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();

    }

}
