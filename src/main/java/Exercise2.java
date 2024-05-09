import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Question 1
        int i = 5;
        System.out.printf("%d%n",i);
        // Question 2
        System.out.printf("%,d%n",10000000);
        // Question 3
        double t = 5.567098;
        System.out.printf("%.4f%n",t);
        // Question 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn :");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là " + name);
    }
}
