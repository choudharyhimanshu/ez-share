package live.himanshuchoudhary.ezshare.services;

import live.himanshuchoudhary.ezshare.Application;
import live.himanshuchoudhary.ezshare.models.Directory;
import live.himanshuchoudhary.ezshare.models.FileModel;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDateTime;
import java.util.List;

public class DirectoryService {

    public Directory getDirectoryByName(String name){
        Session session = Application.getInstance().getSessionFactory().openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<FileModel> query = criteriaBuilder.createQuery(FileModel.class);
        Root<FileModel> root = query.from(FileModel.class);
        query.select(root).where(criteriaBuilder.equal(root.get("directory"),name));

        List files = session.createQuery(query).getResultList();

        if(files != null && files.size() > 0){
            Directory dir = new Directory();
            dir.setName(name);
            dir.setFiles(files);
            dir.setCreatedOn(getFirstModifiedDate(files));
            dir.setLastModified(getLastModifiedDate(files));

            return dir;
        }
        return null;
    }

    private LocalDateTime getLastModifiedDate(List<FileModel> files){
        LocalDateTime max = files.get(0).getCreatedOn();
        for(int i=1; i<files.size(); i++){
            if(max.isBefore(files.get(i).getCreatedOn())){
                max = files.get(i).getCreatedOn();
            }
        }
        return max;
    }

    private LocalDateTime getFirstModifiedDate(List<FileModel> files){
        LocalDateTime min = files.get(0).getCreatedOn();
        for(int i=1; i<files.size(); i++){
            if(min.isAfter(files.get(i).getCreatedOn())){
                min = files.get(i).getCreatedOn();
            }
        }
        return min;
    }
}
