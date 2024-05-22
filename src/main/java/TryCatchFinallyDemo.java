public class TryCatchFinallyDemo {
    public static void main(String[] args) {

        try{
            var caculator = new Calculator();
            var result = caculator.divide(1,1);
            System.out.println("result = " + result);

            String s = null;
            int length = s.length();
            System.out.println(length);
        }catch (ArithmeticException exception){
            System.out.println("k thể chia cho 0");
        } catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("finally luôn được gọi");
        }
    }
}
