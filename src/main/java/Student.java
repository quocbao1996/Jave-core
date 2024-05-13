public class Student {
    private String name;
    private int id;
    Student (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.length() <8 ){
            System.out.println("độ dài không hợp lệ");
        } else { this.name = name; }

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
