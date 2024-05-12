public class WrapperClassDemo {
    public static void main(String[] args) {
        // byte     ->      Byte
        // short    ->      Short
        // int      ->      Integer
        // long     ->      Long
        // float    ->      Float
        // double   ->      Double
        // boolean  ->      Boolean
        // char     ->      Character

        //boxing: primive (nguyên thủy) -> wrapper class
        Integer a = Integer.valueOf(100);
        //unboxing: wrapper class -> primive
        int b = a.intValue();
        //bài toán: String -> number
        int c = Integer.parseInt("123");
        System.out.println("c = " + c + 1000);
        System.out.println("123" + 1000  );
    }
}
