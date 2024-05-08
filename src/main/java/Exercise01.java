public class Exercise01 {

        void question01 () {
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
        void question03 (){
            Department department = new Department();
            Account account = new Account();
            account.department = department;
            String message = (account.department == null) ? "nhân viên này chưa có phòng ban" : " nhân viên này thuộc phòng ban " + department.name;
            System.out.println(message);
        }

        void question04 () {
                Position position = new Position();
                position.name = PositionName.DEV;
                Account account = new Account();
                account.position = position;
                String message = (account.position == position) ? "Nhân viên này là Developer" : " nhân viên này không phải Developer";
            System.out.println(message);
            };
        void question05(){
            int account = 1;
            switch (account){
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
        void question07(){
            Position position = new Position();
            position.name = PositionName.DEV;
            Account account = new Account();
            account.position = position;
            switch (account.position.name){
                case DEV :
                    System.out.println("nhân viên này là developer");
                default:
                    System.out.println("nhân viên này k phải là developer");
            }
        }
        void question15 (){
            for ( int i = 2; i <= 20; i += 2){
                System.out.println(i);
            }
        }


}
