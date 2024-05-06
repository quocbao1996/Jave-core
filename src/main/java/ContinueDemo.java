public class ContinueDemo {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++ ){
            if (i == 5){
                continue; // Next
            }
            System.out.println(i);
        }
        System.out.println("xong");
    }
}
