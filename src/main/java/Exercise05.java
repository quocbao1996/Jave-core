import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {
        String[] departments = {"Accounting", "Boss of director", "Marketing", "Sale", "Waiting room"};

        // Sắp xếp mảng theo thứ tự tăng dần theo tên
        Arrays.sort(departments);
        System.out.println("Danh sách phòng ban theo thứ tự tăng dần theo tên:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}

