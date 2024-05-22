package entity;

public class Student {
   private String name;
   private int id;

    public Student( String name) {
        count++;
        this.id = count;
        this.name = name;
    }
    public static int moneyGroup;
    public static String college;
    public static int count;

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                ", name= " + name + '\'' +
                '}';
    }
}

