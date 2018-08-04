package live.himanshuchoudhary.ezshare;

import live.himanshuchoudhary.ezshare.gateways.PostgresGateway;
import live.himanshuchoudhary.ezshare.services.DirectoryService;
import live.himanshuchoudhary.ezshare.services.FileService;
import org.hibernate.SessionFactory;

public class Application {

    private static Application instance = new Application();

    private SessionFactory sessionFactory;
    private FileService fileService;
    private DirectoryService directoryService;

    public Application(){
        sessionFactory = PostgresGateway.getSessionFactory();
        fileService = new FileService();
        directoryService = new DirectoryService();
    }

    public static Application getInstance(){
        if (instance != null){
            return instance;
        }
        instance = new Application();
        return instance;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public FileService getFileService() {
        return fileService;
    }

    public DirectoryService getDirectoryService() {
        return directoryService;
    }
}
