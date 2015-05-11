package com.guru.mayoo.cmm;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/smart-card")
public class CmmService {

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
