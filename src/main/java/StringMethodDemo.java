public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String empty = "";
        String blank = "  ";
        String search = "    Samsung   ";
        String name = "Nguyễn Văn Khoa";

        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("empty.isEmpty() = " + empty.isEmpty()); // kiểm tra có khoảng cách hay k
        System.out.println("blank.isBlank() = " + blank.isBlank()); // kiểm tra có rỗng hay k
        System.out.println("s.charAt(0) = " + s.charAt(0)); // tìm thứ tự của 1 chuỗi
        System.out.println("s.indexOf('a') = " + s.indexOf('a')); // trả ký tự từ trái qua phải
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a')); // trả ký tự từ phải qua trái
        System.out.println("s.contains(\"Core\") = " + s.contains("Core")); // kiểm tra chuỗi có chứa chuỗi cần tìm hay k
        System.out.println("search.trim() = " + search.trim()); // loại bỏ khoảng cách
        String[] words = name.split(" "); // tách các chữ qua dấu cách
        for (String word : words) {
            System.out.println("word = " + word);
        }
        // begin <= ... < end lấy các ký tự trong chuỗi lấy ký tự đầu tiên và k lấy ký tự cuối
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));

    }
}
