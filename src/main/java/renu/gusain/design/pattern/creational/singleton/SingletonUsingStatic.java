package renu.gusain.design.pattern.creational.singleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class DatabaseConnection implements Serializable {
    String url;
    String credentials;
    private DatabaseConnection()
    {

    }
    private static final DatabaseConnection INSTANCE=new DatabaseConnection();
    public static DatabaseConnection getInstance()
    {
        return INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "url='" + url + '\'' +
                ", credentials='" + credentials + '\'' +
                '}';
    }
    protected  Object readResolve()
    {
        return INSTANCE;
    }
}
public class SingletonUsingStatic {
    static void saveToFile(DatabaseConnection connection,String filePath) throws IOException {
        Path path= Paths.get(filePath);
        if(Files.notExists(path.getParent()))
        {
            Files.createDirectories(path.getParent());
        }
        try(ObjectOutputStream os=new ObjectOutputStream(Files.newOutputStream(path))) {
            os.writeObject(connection);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    static DatabaseConnection readFromFile(String fileName)throws Exception
    {
        Path path=Paths.get(fileName);
        try (ObjectInputStream is=new ObjectInputStream(Files.newInputStream(path))){
            return (DatabaseConnection)is.readObject();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws Exception {
        DatabaseConnection connection1=DatabaseConnection.getInstance();
        DatabaseConnection connection2=DatabaseConnection.getInstance();
        connection1.setUrl("jdvcs//mydab");
        connection1.setCredentials("test:test");
        System.out.println(connection1);
        System.out.println(connection2);
        if (connection1==connection2)
        {
            System.out.println("getting same instance");
        }
        //Breaking singleton using reflection
        String fileName="serialization/singleton.bin";
        saveToFile(connection1,fileName);
        DatabaseConnection connection3=readFromFile(fileName);
        if(connection3==connection1)
        {
            System.out.println("same instance");
        }
        else
        {
            System.out.println("Singleton is broken different instance");
        }




    }
}
