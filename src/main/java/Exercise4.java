

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        // Question01
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("in ngẫu nhiên 1 số = " + a);
        // Question02
        float b = random.nextFloat();
        System.out.println("in số thực ngẫu nhiên = " + b);
        // Question03
        String [] names = { "Bảo","Giang","Thuận","Huy"};
        int index = random.nextInt(names.length);
        String name = names[index];
        System.out.println("index = " + name);
        // Question07
        int min = 100;
        int max = 999;
        int tong = min + random.nextInt(max - min + 1);
        System.out.println("random 3 chữ số = " + tong);

    }
}
