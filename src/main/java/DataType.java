public class DataType {
    public static void main(String[] args) {
        // cú pháp khơi tạo biến
        // [kieu_du_lieu] [ten_bien] = [gia_tri_khoi_tao];
        // kiểu số nguyên: byte(1), short (2), int(4), long(8)
        int age = 18;
        System.out.println("age = " + age);

        // kiểu số thực: float (4), double (8)
        float pi = 3.14f;
        System.out.println("pi = " + pi);

        // kiểu boolean
        boolean isloading = true;
        System.out.println("isloading = " + isloading);

        // kiểu ký tự: char (2)
        char C = 'a';
        System.out.println("C = " + C);

        // kiểu xâu ký tự
        String name = "khoa"; // viết hoa String và dùng dấu ""
        System.out.println("name = " + name);

        // Kiểu Emun
       Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // Class & Object
        Dog dog1 = new Dog();
        dog1.name = "shiba";
        dog1.age = 6;
        dog1.gender = Gender.MALE;
        dog1.bark();
        int sum = dog1.sum(1,10);
        System.out.println("sum = " + sum);
    }
}
