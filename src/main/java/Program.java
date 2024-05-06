
import java.time.LocalDate;
public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.id = 1;
        department1.name= "Giám Đốc";
        Department department2 = new Department();
        department2.id = 3;
        department2.name= "Kế Toán";
        Department department3 = new Department();
        department3.id = 3;
        department3.name= "Nhân sự";
        System.out.println("department3 = " + department3.name);

        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;
        System.out.println("position1 = " + position1.name);
        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.TEST;
        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.SCRUM_MASTER;
        Position position4 = new Position();
        position4.id = 4;
        position4.name = PositionName.PM;

        Account account1 = new Account();
        account1.id = 1;
        account1.email = "Nguyenthanhluan@gmail.com";
        account1.username = "luan";
        account1.fullName = "Nguyễn Thành Luân";
        account1.department = department3;
        account1.position =  position1;
        account1.createdDate = LocalDate.now();
        System.out.println("account1 = " + account1.fullName);
        System.out.println("account1 = " + account1.createdDate);
        Account account2 = new Account();
        account2.id = 2;
        account2.email = "Nguyenvanthuan@gmail.com";
        account2.username = "thuan";
        account2.fullName = "Nguyễn Văn Thuận";
        account2.department = department3;
        account2.position =  position3;
        account2.createdDate = LocalDate.now();
        Account account3 = new Account();
        account3.id = 3;
        account3.email = "trantruonggiang@gmail.com";
        account3.username = "giang";
        account3.fullName = "Trần Trường Giang";
        account3.department = department3;
        account3.position =  position2;
        account3.createdDate = LocalDate.now();
        Account account4 = new Account();
        account4.id = 4;
        account4.email = "phamtruongquocbao@gmail.com";
        account4.username = "bao";
        account4.fullName = "Phạm Trương Quốc Bảo";
        account4.department = department1;
        account4.position =  position4;
        account4.createdDate = LocalDate.now();

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java Core";
        group1.creator = account4;
        group1.createdDate = LocalDate.of(2023, 7, 28);
        System.out.println("Tên nhóm: " + group1.name);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "MySQL";
        group2.creator = account4;
        group2.createdDate = LocalDate.of(2023, 7, 28);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Back-End";
        group3.creator = account4;
        group3.createdDate = LocalDate.of(2023, 7, 28);

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.group = group1;
        groupAccount1.account = account4;
        groupAccount1.joinDate = LocalDate.of(2023, 7, 29);
        System.out.println("Tên nhân viên: " + groupAccount1.account.fullName + " đã tham gia nhóm " + groupAccount1.group.name );
        System.out.println("Ngày tham gia nhóm: " + groupAccount1.joinDate);
        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.group = group2;
        groupAccount2.account = account4;
        groupAccount2.joinDate = LocalDate.of(2023, 12, 19);
        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.group = group3;
        groupAccount3.account = account4;
        groupAccount3.joinDate = LocalDate.of(2024, 2, 22);

        TypeQuestion typequestion1 = new TypeQuestion();
        typequestion1.id = 1;
        typequestion1.name = TypeName.ESSAY;
        TypeQuestion typequestion2 = new TypeQuestion();
        typequestion2.id = 2;
        typequestion2.name = TypeName.MULTIPLE_CHOICE;
        System.out.println("typequestion1 = " + typequestion1.name);

        CategoryQuestion categoryquestion1 = new CategoryQuestion();
        categoryquestion1.id = 1;
        categoryquestion1.name = "Java";
        CategoryQuestion categoryquestion2 = new CategoryQuestion();
        categoryquestion2.id = 2;
        categoryquestion2.name = "SQL";
        System.out.println("categoryquestion1 = " + categoryquestion1.name);

        Question question1 = new Question();
        question1.id = 1;
        question1.content = "Kiểu dữ liệu nguyên thủy Java có mấy loạiJ";
        question1.category = categoryquestion1;
        question1.type = typequestion1;
        question1.creator = account1;
        question1.createdDate = LocalDate.of(2024,3,16);
        Question question2 = new Question();
        question2.id = 2;
        question2.content = "SQL là gì";
        question2.category = categoryquestion1;
        question2.type = typequestion1;
        question2.creator = account1;
        question2.createdDate = LocalDate.of(2024,3,6);
        System.out.println("question1 = " + question1.content);

        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "Có 8 loại: boolean, char, byte, short, int, long, float, double";
        answer1.question =  question1;
        answer1.isCorrect = true;
        Answer answer2 = new Answer();
        answer2.id = 2;
        answer2.content = "là cơ sở dữ liệu, quản lý dữ liệu wed";
        answer2.question =  question1;
        answer2.isCorrect = true;
        System.out.println("answer1 = " + answer1.content);

        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "HK1";
        exam1.title = " thi HK1";
        exam1.category = categoryquestion1;
        exam1.duration = 120;
        exam1.creator = account4;
        exam1.createdDate = LocalDate.of(2023,10,27);
        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = "HK2";
        exam2.title = " thi HK2";
        exam2.category = categoryquestion1;
        exam2.duration = 120;
        exam2.creator = account4;
        exam2.createdDate = LocalDate.of(2023,12,27);
        System.out.println("exam1 = " + exam1.title);

        ExamQuestion examquestion1 = new ExamQuestion();
        examquestion1.exam = exam1;
        examquestion1.question = question1;
        ExamQuestion examquestion2 = new ExamQuestion();
        examquestion2.exam = exam2;
        examquestion2.question = question2;

    }
}
