public class Student {
    private String name;
    private int age;

    public static int  count;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

