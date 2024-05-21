

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Exercise04 {
        void question01 () {
            Random random = new Random();
            int a = random.nextInt();
            System.out.println("in ngẫu nhiên 1 số = " + a);
        }
        void question02() {
            Random random = new Random();
            float b = random.nextFloat();
            System.out.println("in số thực ngẫu nhiên = " + b);
        }
        void question03 () {
            String[] names = {"Bảo", "Giang", "Thuận", "Huy"};
            Random random = new Random();
            int index = random.nextInt(names.length);
            System.out.printf("name %d : %s%n",index + 1,names[index]);
        }
        void question04(){
            Random random = new Random();
            LocalDate minDate = LocalDate.of(1995, 7, 24);
            LocalDate maxDate = LocalDate.of(1995, 12, 20);
            int minDay = (int) minDate.toEpochDay();
            int maxDay = (int) maxDate.toEpochDay();
            int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
            LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
            System.out.println("Random date: " + randomDate);
        }
        void question07 () {
            Random random = new Random();
        int min = 100;
        int max = 999;
        int tong = min + random.nextInt(max - min + 1);
        System.out.println("random 3 chữ số = " + tong);
        }

}
