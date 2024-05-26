public class Exercise03 {
    void question01 (){
        Integer luong = 5000;

        // Chuyển đổi lương sang kiểu dữ liệu float
        float luongFloat = (float) luong;

        // Hiển thị lương lên màn hình với 2 số sau dấu thập phân
        System.out.printf("Lương: %.2f%n", luongFloat);
    }
    void question02(){
        String a = "1234567";
        int b = Integer.parseInt(a);
        System.out.println("b = " + b);
    }
}
