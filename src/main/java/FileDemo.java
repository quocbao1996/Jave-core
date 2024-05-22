import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path ="src/main/resources/abc.txt";
        boolean createNewFile = FileManager.createFile(path);
        System.out.println("createNewFile = " + createNewFile);

        boolean delete = FileManager.delete("src/main/resources/abc.txt");
        System.out.println("delete = " + delete);

        String[] names = FileManager.list ("D:/");
        for(String name : names){
            System.out.println("name = " + name);
        }
    }
}
