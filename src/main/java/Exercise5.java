import java.util.Scanner;

public class Exercise5 {
    void question05 () {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("nhập vào id account");
        account.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào username");
        account.username = scanner.nextLine();
        System.out.println("nhập vào fullname");
        account.fullName = scanner.nextLine();
        System.out.println("nhập vào email");
        account.email = scanner.nextLine();
        Position position = new Position();
        System.out.println("nhập vào position id: ");
        position.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("chọn position name: ");
        System.out.println("1. DEV");
        System.out.println("2. PM");
        System.out.println("3. TEST");
        System.out.println("4. SCRUM MASTER");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println(position.name = PositionName.DEV);
                break;
            case 2:
                System.out.println(position.name = PositionName.PM);
                break;
            case 3:
                System.out.println(position.name = PositionName.TEST);
                break;
            case 4:
                System.out.println(position.name = PositionName.SCRUM_MASTER);
                break;
        }
        System.out.println("id = " + account.id);
        System.out.println("username = " + account.username);
        System.out.println("fullName = " + account.fullName);
        System.out.println("email = " + account.email);
    }
    void question06 () {
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        System.out.println("nhập id department= ");
        department.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập name department = ");
        department.name = scanner.nextLine();
        System.out.println("department.id = " + department.id);
        System.out.println("department.name = " + department.name);


    }
}
