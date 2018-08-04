package live.himanshuchoudhary.ezshare.services;

import live.himanshuchoudhary.ezshare.Application;
import live.himanshuchoudhary.ezshare.models.FileModel;
import org.hibernate.Session;

import java.util.UUID;

public class FileService {

    public FileModel getFileById(UUID id){
        Session session = Application.getInstance().getSessionFactory().openSession();
        FileModel file = (FileModel) session.get(FileModel.class, id);
        session.close();
        return file;
    }

}
