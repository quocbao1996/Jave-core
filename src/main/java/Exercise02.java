import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Exercise02 {
     void question01() {
            int i = 5;
            System.out.printf("%d%n", i);
        }
        void  question02() {
            System.out.printf("%,d%n", 10000000);
        }
        void question03() {
            double t = 5.567098;
            System.out.printf("%.4f%n", t);
        }
        void question04() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào tên của bạn :");
            String name = scanner.nextLine();
            System.out.println("Tên của bạn là " + name + "và tôi đang độc thân");
        }
        void question05(){
            LocalDateTime now = LocalDateTime.now();
            System.out.printf("%1$td/%1$tm/%1$tY %1$tHh:%1$tMp:%1$tSs%n", now);
        }
        void question06 () {
            Department departmentA = new Department();
            departmentA.name = "Giám đốc";

            Account accountA = new Account();
            accountA.email = "khoa.nv@gmail.com";
            accountA.fullName = "Nguyễn Văn Khoa";
            accountA.department = departmentA;

            Department departmentB = new Department();
            departmentB.name = "Bảo vệ";

            Account accountB = new Account();
            accountB.email = "duy.nn@gmail.com";
            accountB.fullName = "Nguyễn Ngọc Duy";
            accountB.department = departmentB;

            Account[] accounts = {accountA, accountB};

            System.out.println("+-------------------+-------------------+-------------------+");
            System.out.println("|       EMAIL       |     FULL NAME     |  DEPARTMENT NAME  |");
            System.out.println("+-------------------+-------------------+-------------------+");
            for (Account account : accounts) {
                System.out.printf("| %-17s | %-17s | %-17s |%n",
                        account.email, account.fullName, account.department.name);
                System.out.println("+-------------------+-------------------+-------------------+");
            }
        }

}
