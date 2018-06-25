package live.himanshuchoudhary.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

public class DirectoryController  {

    public ResponseContext getDirectoryInfo(RequestContext request , String name) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }

}

