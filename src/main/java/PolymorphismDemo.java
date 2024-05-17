public class PolymorphismDemo {
    public static void main(String[] args) {

            // Tính đa hình
            Runnable cat = new Cat();
            callRun(cat);
            Runnable bird = new Bird();
            callRun(bird);
            // instance0f
        }

        static void callRun(Runnable runnable) {
            if (runnable instanceof Cat){
            System.out.println("Mèo có chạy được k?");
             } else if (runnable instanceof Bird){
            System.out.println("Chim có chạy được k");
            }
            runnable.run();

        }

}
