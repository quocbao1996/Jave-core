public class StaticDemo {
    public static void main(String[] args) {
        // static sẽ thuộc về class
    Student s1 = new Student(15,"khoa");
    Student s2 = new Student(20,"linh");
    s1.count = 10;
        System.out.println("s2 = "+ s2.count);
        // có thể truy cập thông qua tên của class
        System.out.println("Student = " + Student.count);
        int max = Student.max(10,100);
        System.out.println("max = " + max);
        // static k thể truy cập non-static
        // non-staic có thể truy cập static
    }
}
