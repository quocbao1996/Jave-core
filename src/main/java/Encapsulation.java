public class Encapsulation {
    public static void main(String[] args) {
        // Tính đóng gói
        // 1. Thêm private cho tất cả thuộc tính
        // 2. Truy cập thông qua getter (lấy dữ liệu ra) / setter (truyền dữ liệu vào)
        Student student = new Student("Khoa");
        System.out.println("student.getName() = " + student.getName());
        student.setName("Đức");
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student = " + student);
    }

}

