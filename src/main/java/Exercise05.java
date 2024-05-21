import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Exercise05 {
    void question01(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhập vào 3 số nguyên");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
    }
    void question02 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 3 số thực :  ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

    }
    void question03 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào họ tên: ");
        String name = scanner.nextLine();
    }
    void question04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào ngày sinh của bạn: ");
        LocalDate date = LocalDate.parse(scanner.next());
    }
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
    void question07 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" hãy nhập vào 1 số chắn:  ");
        while (true){
            int a = scanner.nextInt();
            if (a % 2 == 0){
                System.out.printf("số bạn nhập là: %d%n ",a);
                break;
            } else {
                System.out.println("số nhập đã sai xin hãy nhập lại");

            }
        }
    }
    void question08(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn chức năng muốn sử dụng: ");
        System.out.println("1. tạo acc count");
        System.out.println("2. tạo department");
        while(true){
            int a = scanner.nextInt();
            if(a == 1 ){
               question05();
                break;
            }else if (a == 2){
              question06();
                break;
            } else {
                System.out.println("mời bạn nhập lại");
            }
        }

    }
    void question09() {
        Scanner scanner = new Scanner(System.in);

        Group groupA = new Group();
        groupA.id = 1;
        groupA.name = "Database";
        groupA.createdDate = LocalDate.now();

        Group groupB = new Group();
        groupB.id = 2;
        groupB.name = "Java Core";
        groupB.createdDate = LocalDate.now();

        Group groupC = new Group();
        groupC.id = 3;
        groupC.name = "Frontend Basic";
        groupC.createdDate = LocalDate.now();

        Account accountA = new Account();
        accountA.id = 1;
        accountA.email = "khoa.nv@gmail.com";
        accountA.username = "khoa.nv";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.createdDate = LocalDate.now();

        Account accountB = new Account();
        accountB.id = 2;
        accountB.email = "cuong.nq@gmail.com";
        accountB.username = "cuong.nq";
        accountB.fullName = "Nguyễn Quốc Cường";
        accountB.createdDate = LocalDate.now();

        Account accountC = new Account();
        accountC.id = 3;
        accountC.email = "trang.nnm@gmail.com";
        accountC.username = "trang.nnm";
        accountC.fullName = "Nguyễn Ngọc Minh Trang";
        accountC.createdDate = LocalDate.now();

        Group[] groups = {groupA, groupB, groupC};
        Account[] accounts = {accountA, accountB, accountC};

        System.out.println("Danh sách account:");
        for (Account account : accounts) {
            System.out.println("- username: " + account.username);
        }

        System.out.println("Nhập vào username:");
        String username = scanner.nextLine();

        System.out.println("Danh sách group:");
        for (Group group : groups) {
            System.out.println("- group: " + group.name);
        }

        System.out.println("Nhập vào group name:");
        String name = scanner.nextLine();

        System.out.printf("Bạn vừa thêm account \"%s\" vào group \"%s\".%n",
                username, name);
    }
    void question10(){
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Chọn chức năng muốn sử dụng: ");
        System.out.println("1. tạo acc count");
        System.out.println("2. tạo department");
        System.out.println("3. thêm group vào account");
        System.out.println("4.thêm acc vào group ngẫu nhiên");
            int a = scanner.nextInt();
            if(a == 1 ){
                question05();
            }else if (a == 2){
                question06();
            } else if (a == 3){
                question09();
            }
             else if (a == 4){
            question11();
            }
            else {
                System.out.println("mời bạn nhập lại");
                continue;
            }
            while (true){
                System.out.println("bạn có muốn dùng chức năng khác không ?");
                System.out.println("Chọn Có hoặc Không");
                String answer = scanner.next();
                if (answer.equals("Có")){
                    break;
                }else if (answer.equals("Không")){
                    return;
                }else{
                    System.out.println("xin hãy chọn đúng");
                }
            }
        }

    }
    void question11(){
        Account account1 = new Account();
        account1.username = "Bảo";
        Account account2 = new Account();
        account2.username = "Huy";
        Account account3 = new Account();
        account3.username = "Linh";
        Account [] user = {account1,account2,account3};
        System.out.println("Danh sách user: ");
        for(Account account : user)
        {
            System.out.println(account.username);
        }
        System.out.println("hãy điền vào tên user");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Group groupA = new Group();
        groupA.name = "Database";
        Group groupB = new Group();
        groupB.name = "Java Core";
        Group groupC = new Group();
        groupC.name = "Frontend Basic";
        Group [] groups = {groupA,groupB,groupC};
        Random random = new Random();
        int index = random.nextInt(groups.length);
        System.out.printf("Bạn đã thêm %s vào group %s ",name,groups[index].name);

    }

}
