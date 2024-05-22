import java.io.File;
import java.io.IOException;

public class FileManager {
    // kiểm tra file có tồn tại hay k
    public static boolean exists(String path){
        File file = new File(path);
        return file.exists();
    }
    // tạo mới file
    public static boolean createFile (String path) throws IOException {
        if(exists(path)){
            throw new IllegalStateException("Error !! File is Exists");
        }
        File file = new File(path);
        return file.createNewFile();
    }
    // xóa file
    public static boolean delete(String path){
        if (!exists(path)){
            throw new IllegalStateException("Error!! File not Exists");
        }
        File file = new File(path);
        return file.delete();
    }
    // kiểm tra file
    public static boolean isFile(String path){
        File file =new File(path);
        return file.isFile();
    }
    // kiểm tra folder
    public static boolean isFolder(String path){
        File file =new File(path);
        return file.isDirectory();
    }
    // lấy ra danh sách file trong floder
    public  static  String[] list (String path){
        File file =new File(path);
        return file.list();
    }
    // tạo folder
    public static boolean mkdisk (String path){
        File file = new File(path);
        return file.mkdir();
    }
}
