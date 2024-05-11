public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String empty = "";
        String blank = "      ";
        String search = "    Samsung   ";
        String name = "Nguyễn Văn Khoa";

        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("empty.isEmpty() = " + empty.isEmpty());
        System.out.println("blank.isBlank() = " + blank.isBlank());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("s.contains(\"Core\") = " + s.contains("Core"));
        System.out.println("search.trim() = " + search.trim());
        String[] words = name.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
// begin <= ... < end
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));
    }
}
