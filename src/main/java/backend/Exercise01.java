package backend;

import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Exercise01 {
    public static void question01(){
            Student s1 = new Student( "Nguyễn Văn A");
            Student s2 = new Student("Nguyễn Văn B");
            Student s3 = new Student( "Nguyễn Văn C");
            Student[] students = {s1, s2, s3};

            Student.college = "Đại học bách khoa";
            System.out.println("s1.college = " + s1.college);
            System.out.println("s2.college = " + s2.college);
            System.out.println("s3.college = " + s3.college);

            Student.college = "Đại học công nghệ";
            System.out.println("s1.college = " + s1.college);
            System.out.println("s2.college = " + s2.college);
            System.out.println("s3.college = " + s3.college);
    }
    public static void question02(){
        Student s1 = new Student( "Nguyễn Văn A");
        Student s2 = new Student("Nguyễn Văn B");
        Student s3 = new Student("Nguyễn Văn C");

        s1.moneyGroup += 100;
        s2.moneyGroup += 100;
        s3.moneyGroup += 100;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);
        s1.moneyGroup -= 50;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);
        s2.moneyGroup -=20;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);
        s3.moneyGroup -=150;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);
        s1.moneyGroup += 50;
        s2.moneyGroup += 50;
        s3.moneyGroup += 50;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);
    }
    public static void question03(){
        int b = MyMath.min(4,7);
        System.out.println(b);
    }
    public static void question04(){
        // thêm getter và setter
    }
    public static void question05(){
        Student s1 = new Student( "Nguyễn Văn A");
        Student s2 = new Student("Nguyễn Văn B");
        Student s3 = new Student("Nguyễn Văn C");
        System.out.println("Student.count = " + Student.count);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
    public static void question06(){
    Student s1 = new PrimaryStudent("A");
    Student s2 = new PrimaryStudent("B");
    Student s3 = new SecondaryStudent("C");
    Student s4 = new SecondaryStudent("D");
    Student s5 = new SecondaryStudent("E");
    Student s6 = new SecondaryStudent("F");
    }
}
