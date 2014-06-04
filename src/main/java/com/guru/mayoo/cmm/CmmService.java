package com.guru.mayoo.cmm;

import com.guru.mayoo.jackson.Track;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Path("/smart-card")
public class CmmService {

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

    @POST
    @Path("/authenticate")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response authenticate(AuthRequest request) {

        AuthResponse response = new AuthResponse();
        response.setRequestId("001");
        response.setStatusCode("S1000");
        response.setStatusDescription("Success");
        Map<String, Object> results = new HashMap<>();
        results.put("msisdn", "6282112345600");
        response.setResults(results);

        return Response.status(200).type(MediaType.APPLICATION_JSON).entity(response).build();

    }

}
