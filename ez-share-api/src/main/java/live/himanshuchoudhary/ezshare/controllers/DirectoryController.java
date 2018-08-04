package live.himanshuchoudhary.ezshare.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import live.himanshuchoudhary.ezshare.Application;
import live.himanshuchoudhary.ezshare.models.ApiResponse;
import live.himanshuchoudhary.ezshare.models.Directory;
import live.himanshuchoudhary.ezshare.services.DirectoryService;

import javax.ws.rs.core.Response.Status;

public class DirectoryController  {

    public ResponseContext getDirectoryInfo(RequestContext request , String name) {
        Directory dir = Application.getInstance().getDirectoryService().getDirectoryByName(name);

        if(dir != null){
            return new ResponseContext().status(Status.OK).entity(dir);
        }
        return new ResponseContext().status(Status.NOT_FOUND).entity(new ApiResponse("Directory not found with requested name"));
    }

}
