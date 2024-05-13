import java.util.Scanner;

public class Exercise04 {
        void question01() {
            String string =  "a b c d   e  f g ";
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
            String [] word = name.split("");
            for( String words : word){
                System.out.println("ký tự là = " + words);
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
        void question07(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập họ tên: ");
            String name = scanner.nextLine();
            String name2 = name.trim();
            System.out.println("tên bạn là " + name2);



        }
}


