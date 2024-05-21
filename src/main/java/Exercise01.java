public class Exercise01 {

    void question01() {
        Department department = new Department();
        department.name = "Kỹ thuật";
        Account account = new Account();
        account.department = department;
        if (account.department == null) {
            System.out.println(" account này chưa có phòng ban");
        } else {
            System.out.println("account này thuộc phòng ban " + department.name);
        }
        ;
    }

    void question02() {
        Group[] groups = {new Group(), new Group()};
        Account account = new Account();
        account.groups = groups;
        if (account.groups == null || account.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account.groups.length == 1 || account.groups.length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    void question03() {
        Department department = new Department();
        Account account = new Account();
        account.department = department;
        String message = (account.department == null) ? "nhân viên này chưa có phòng ban" : " nhân viên này thuộc phòng ban " + department.name;
        System.out.println(message);
    }

    void question04() {
        Position position = new Position();
        position.name = PositionName.DEV;
        Account account = new Account();
        account.position = position;
        String message = (account.position == position) ? "Nhân viên này là Developer" : " nhân viên này không phải Developer";
        System.out.println(message);
    }

    ;

    void question05() {
        int account = 1;
        switch (account) {
            case 1:
                System.out.println("nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("nhóm có 3 thaành viên");
                break;
            default:
                System.out.println("nhóm có nhiều thành viên");
        }
    }

    void question07() {
        Position position = new Position();
        position.name = PositionName.DEV;
        Account account = new Account();
        account.position = position;
        switch (account.position.name) {
            case DEV:
                System.out.println("nhân viên này là developer");
            default:
                System.out.println("nhân viên này k phải là developer");
        }
    }

    void question08() {
        Department departmentA = new Department();
        departmentA.name = "Giám Đốc";
        Account accountA = new Account();
        accountA.fullName = " Quốc Bảo";
        accountA.email = "quocbao@gmail";
        accountA.username = "Bảo";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = " Bảo vệ";
        Account accountB = new Account();
        accountB.fullName = " Văn Thuận";
        accountB.email = "thuân@gmail";
        accountB.username = "thuận";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};
        for (Account account : accounts) {
            System.out.println("email = " + account.email);
            System.out.println("department = " + account.department.name);
            System.out.println("fullName = " + account.fullName);
            System.out.println("username = " + account.username);
        }

    }

    void question09() {
        Department department1 = new Department();
        department1.name = "Bảo vệ";
        department1.id = 1;
        Department department2 = new Department();
        department2.name = " Giám đốc";
        department2.id = 2;
        Department department3 = new Department();
        department3.name = " Thư ký";
        department3.id = 3;
        Department[] list = {department1, department2, department3};
        for (Department department : list) {
            System.out.println("department.id = " + department.id);
            System.out.println("department.name = " + department.name);
        }
    }

    void question10() {
        Department departmentA = new Department();
        departmentA.name = "sale";

        Account accountA = new Account();
        accountA.email = "nguyenvana@gmail.com";
        accountA.fullName = "Nguyễn Văn A";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Makerting";

        Account accountB = new Account();
        accountB.email = "nguyenvanb@gmail.com";
        accountB.fullName = "Nguyễn Văn B";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(" thông tin account thứ " + (i + 1) + " là :");
            System.out.println(" email = " + accounts[i].email);
            System.out.println("fullName = " + accounts[i].fullName);
            System.out.println("Department = " + accounts[i].department.name);
        }

    }

    void question11() {
        Department departmentA = new Department();
        departmentA.name = "Sale";
        Department departmentB = new Department();
        departmentB.name = "Makerting";
        Department[] departments = {departmentA, departmentB};
        for (int i = 0; i < departments.length; i++) {
            System.out.println("tên phòng ban " + (i + 1) + " là: " + departments[i].name);
        }
    }

    void question12() {
        Account account1 = new Account();
        account1.fullName = " Nguyên Văn A";
        account1.id = 1;
        Account account2 = new Account();
        account2.fullName = " Nguyên Văn B";
        account2.id = 2;
        Account account3 = new Account();
        account3.fullName = " Nguyên Văn C";
        account3.id = 3;
        Account[] accounts = {account1, account2, account3};
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("thông tin ngưới thứ " + (i + 1) + " là");
            System.out.println(" name = " + accounts[i].fullName);
            System.out.println("id = " + accounts[i].id);
        }
    }

    void question13() {
        Department departmentA = new Department();
        departmentA.name = "sale";

        Account accountA = new Account();
        accountA.email = "nguyenvana@gmail.com";
        accountA.fullName = "Nguyễn Văn A";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Makerting";

        Account accountB = new Account();
        accountB.email = "nguyenvanb@gmail.com";
        accountB.fullName = "Nguyễn Văn B";
        accountB.department = departmentB;

        Department departmentC = new Department();
        departmentC.name = "Dev";

        Account accountC = new Account();
        accountC.email = "nguyenvanc@gmail.com";
        accountC.fullName = "Nguyễn Văn C";
        accountC.department = departmentC;
        Account[] accounts = {accountA, accountB, accountC};
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("thông tin Account thứ " + (i + 1) + " là: ");
            System.out.println("name = " + accounts[i].fullName);
            System.out.println("email = " + accounts[i].email);
            System.out.println("phòn ban = " + accounts[i].department.name);
        }
    }

    void question14() {
        Department departmentA = new Department();
        departmentA.name = "sale";

        Account accountA = new Account();
        accountA.email = "nguyenvana@gmail.com";
        accountA.id = 1;
        accountA.fullName = "Nguyễn Văn A";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Makerting";

        Account accountB = new Account();
        accountB.email = "nguyenvanb@gmail.com";
        accountB.id = 2;
        accountB.fullName = "Nguyễn Văn B";
        accountB.department = departmentB;

        Department departmentC = new Department();
        departmentC.name = "Dev";

        Account accountC = new Account();
        accountC.email = "nguyenvanc@gmail.com";
        accountC.id = 3;
        accountC.fullName = "Nguyễn Văn C";
        accountC.department = departmentC;

        Department departmentD = new Department();
        departmentD.name = "Desgin";

        Account accountD = new Account();
        accountD.email = "nguyenvand@gmail.com";
        accountD.id = 4;
        accountD.fullName = "Nguyễn Văn D";
        accountD.department = departmentD;
        Account[] accounts = {accountA, accountB, accountC, accountD};
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].id < 4) {
                System.out.println("thông tin Account thứ " + (i + 1) + " là: ");
                System.out.println("name = " + accounts[i].fullName);
                System.out.println("id = " + accounts[i].id);
                System.out.println("email = " + accounts[i].email);
                System.out.println("phòn ban = " + accounts[i].department.name);

            }
        }
    }

    void question15() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
    void question16(){
        Account account1 = new Account();
        account1.fullName = " Nguyên Văn A";
        account1.id = 1;
        Account account2 = new Account();
        account2.fullName = " Nguyên Văn B";
        account2.id = 2;
        Account account3 = new Account();
        account3.fullName = " Nguyên Văn C";
        account3.id = 3;
        Account[] accounts = {account1, account2, account3};
        int i = 0;
        while (i< accounts.length){
            System.out.println("thông tin ngưới thứ " + (i + 1) + " là");
            System.out.println(" name = " + accounts[i].fullName);
            System.out.println("id = " + accounts[i].id);
            i++;
        }
    }
    void question17(){
        Account account1 = new Account();
        account1.fullName = " Nguyên Văn A";
        account1.id = 1;
        Account account2 = new Account();
        account2.fullName = " Nguyên Văn B";
        account2.id = 2;
        Account account3 = new Account();
        account3.fullName = " Nguyên Văn C";
        account3.id = 3;
        Account[] accounts = {account1, account2, account3};
        int i = 0;
        do {
            System.out.println("thông tin ngưới thứ " + (i + 1) + " là");
            System.out.println(" name = " + accounts[i].fullName);
            System.out.println("id = " + accounts[i].id);
            i++;
        }while (i< accounts.length);
    }

}
