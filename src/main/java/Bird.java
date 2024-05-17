public class Bird extends Animal implements  Flyable, Runnable {
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {

    }
    @Override
    public void run(){
        System.out.println("Bird can run");
    }
}
