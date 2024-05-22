import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    void question01(){
        float account1 = 5240.5f;
        float account2 = 10970.055f;
        int acc1 = (int) account1;
        int acc2 = (int) account2;
        System.out.printf("%,d%n",acc1);
        System.out.printf("%,d%n",acc2);
    };
    void question02() {
        Random random = new Random();
        int a = random.nextInt(100000);
        System.out.printf("số ngãu nhiên 5 chữ số: %05d.",a);
    };
    void question03(){
        Random random = new Random();
        int a = random.nextInt(100000);
        System.out.printf("2 số cuối: %05d%n",a%100);
    }
    void  question04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số tự nhiên: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(" thương của 2 số vừa nhập  " + a/b);
    }
}
