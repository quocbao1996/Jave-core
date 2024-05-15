

public class program {
    public static void main(String[] args) {
        // Question1
        System.out.println("Question1");
        Department department = new Department("Bảo vệ");
        System.out.println(department.name);
        System.out.println(department.id);

        // Question 2
        System.out.println("Question2");
        Position position1 = new Position(1,"DEV");
        Account account1 = new Account();
        Account account2 = new Account(1,"quocbao@gmail","bao","Quốc","Bảo");
        Account account3 = new Account(2,"thanhhuy@gmail","huy","Thanh","Huy");

        Circle circle = new Circle();
        System.out.println("circle = " + circle);
        System.out.println("circle.getArea() = " + circle.getArea());
    }

}
