import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private GioiTinh gioiTinh;
    private LocalDate ngaySinh;
    private String diachia;

    public Person() {
    }

    public Person(String name, String diachia, LocalDate ngaySinh, GioiTinh gioiTinh) {
        this.name = name;
        this.diachia = diachia;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        this.name = scanner.nextLine();
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = scanner.nextLine();
        if (menu.equals("1")) {
            this.gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            this.gioiTinh = GioiTinh.NU;
        } else {
            this.gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào ngày sinh:");
        this.ngaySinh = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ:");
        this.diachia = scanner.nextLine();
    }
}

