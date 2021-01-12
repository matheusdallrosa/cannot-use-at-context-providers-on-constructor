package bug.reproducer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class Reproducer {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String get() {
        return "Hello RESTEasy";
    }
}