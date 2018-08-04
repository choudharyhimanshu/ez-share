package live.himanshuchoudhary.ezshare.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;

import javax.ws.rs.core.Response.Status;

import live.himanshuchoudhary.ezshare.Application;
import live.himanshuchoudhary.ezshare.models.ApiResponse;
import live.himanshuchoudhary.ezshare.models.FileModel;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileController  {

    public ResponseContext downloadFile(RequestContext request , String id) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }

    public ResponseContext getFileInfo(RequestContext request , String id) {

        try {
            UUID uid = UUID.fromString(id);

            FileModel file = Application.getInstance().getFileService().getFileById(uid);

            if(file != null){
                return new ResponseContext().status(Status.OK).entity(file);
            }

            return new ResponseContext().status(Status.NOT_FOUND).entity(new ApiResponse("FileModel not found with requested id"));
        }
        catch (IllegalArgumentException exc){
            return new ResponseContext().status(Status.BAD_REQUEST).entity(new ApiResponse("Invalid id format"));
        }
    }

    public ResponseContext uploadFile(RequestContext request , File file, String directory) {

        System.out.println(request.getContext().getPropertyNames().toArray());
        System.out.println(request.getContext().getEntityStream().toString());
        System.out.println(request.getContext().getMediaType());
        System.out.println(request.getContext().getRequest());

        try {
            System.out.println(request.getContext().getEntityStream().read());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseContext().status(Status.NOT_IMPLEMENTED).entity(directory);
    }

}
