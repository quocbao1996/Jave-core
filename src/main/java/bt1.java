import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        // Bài tập 1: Yêu cầu người dùng nhập vào tên.
// Sau đó viết hoa chữ cái đầu tiên của tên.
     Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào tên");
     String name = scanner.nextLine();
     String kq = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("kq = " + kq);
// Bài tập 2: Yêu cầu người dùng nhập vào họ và tên.
// Đếm số từ trong tên
// VD: Nguyễn Văn Khoa -> 3
        System.out.println("nhập họ và tên :");
        String bt2 = scanner.nextLine();
        String array[] = bt2.split(" ");
        int count = 0;
        for (String word : array) {
            if (!word.isEmpty()){
                count++;
            }
        }
        System.out.println("count = " + count);


    }
}
