public class Cat extends Animal implements  Runnable{
    @Override
    public void makeSound() {
        System.out.println("meo meo");

    }

    @Override
    public void run() {
        System.out.println("cat can run");

    }
}
