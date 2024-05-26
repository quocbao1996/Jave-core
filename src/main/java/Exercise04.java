import java.util.Scanner;

public class Exercise04 {
        void question01() {
            String string =  "a b c d      e  f g ";
            System.out.println("question01 = " + string);
            String[] words = string.split(" ");
            int count = 0;
            for (String word : words) {
                if (!word.isBlank()){
                    count++;
                }
            }
            System.out.println("tổng số ký tự = " + count);


        }
        void question02 () {
            String s1 = " Phạm Trương";
            String s2 = " Quốc Bảo";
            System.out.println("question2:" + s1+s2);
        }
        void question03 (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên vào: ");
            String name = scanner.nextLine();
            String out = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
            System.out.println("question03 = " + out);
        }
        void question04(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập tên:");
            String name = scanner.nextLine();
            int length = name.length();
            for ( int i = 0; i <length; i++) {
                int n = i + 1;
                int c = name.charAt(i);
                System.out.printf("Ký tự thứ %d là %C%n",n,c);
            }


        }
        void question05(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập họ");
            String ho = scanner.nextLine();
            System.out.println("Nhập tên");
            String ten = scanner.nextLine();
            System.out.println(ho+ " " +ten);
        }
        void question06(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập họ tên: ");
            String name = scanner.nextLine();
            int indexFirst = name.indexOf(' ');
            int ìndexLast = name.lastIndexOf(' ');
            String tenHo = name.substring(0,indexFirst);
            String ten = name.substring(ìndexLast +1);
            String tenDem = name.substring(indexFirst+1,ìndexLast);
            System.out.println("Tên họ là " +tenHo.substring(0,1).toUpperCase() + tenHo.substring(1));
            System.out.println("Tên là " +ten.substring(0,1).toUpperCase() + ten.substring(1) );
            System.out.println("Tên Đệm là " +tenDem.substring(0,1).toUpperCase()+ tenDem.substring(1));
        }
        void question07(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập họ tên: ");
            String name = scanner.nextLine();
            String name2 = name.trim();
            System.out.println("tên bạn là " + name2);

        }
        void question08(){
            String [] groups = {"Java core","Java", "SQL"};
            System.out.println("các group chứa java");
            for ( String group : groups){
                if(group.toLowerCase().contains("java")){
                    System.out.println(group);
                }
            }
            System.out.println("Question 9 : Group Java");
            for ( String group2 : groups) {
                if (group2.toLowerCase().equals("java")) {
                    System.out.println(group2);
                }
            }
        }
        void question11(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập 1 chuỗi: ");
            String s = scanner.nextLine();
            int length = s.length();
            int count = 0;
            for ( int i = 0; i < length; i++){
                if (s.charAt(i) == 'a'){
                    count++;
                }
            } System.out.println("ký tự chữ a trong chuỗi là: " + count);

        }

}


