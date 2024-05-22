public class ThrowDemo {
    public static void main(String[] args) {
        // throw: ném ra ngoại lệ
        var age = 15;
        if( age >= 18 ) {
            System.out.println("bạn đủ 18 tuổi");
        }else {
            throw new IllegalStateException("bạn chủa đủ 18 tuổi");
        }
    }
}
