package live.himanshuchoudhary.ezshare;

import live.himanshuchoudhary.ezshare.gateways.PostgresGateway;
import live.himanshuchoudhary.ezshare.models.FileModel;
import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.UUID;

public class FileCreateTest {
    public static void main(String[] args){
        createRandomFile("public");
        createRandomFile("public");
        createRandomFile("public");
        createRandomFile("public");
        createRandomFile("test");
        createRandomFile("test");
        createRandomFile("test");
    }

    private static void createRandomFile(String directory){
        Session session = PostgresGateway.getSessionFactory().openSession();
        session.beginTransaction();

        FileModel testfile = new FileModel();
        testfile.setName("test" + (int)(Math.random()*100));
        testfile.setId(UUID.randomUUID());
        testfile.setSize(100);
        testfile.setCreatedOn(LocalDateTime.now());
        testfile.setDirectory(directory);
        session.save(testfile);

        session.getTransaction().commit();
        session.close();
    }
}
