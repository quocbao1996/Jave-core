public class AbstractionDemo {
    public static void main(String[] args) {
        // tính trừu tượng: Abstract class, interface
        // 1. không thể khởi tạo đối tượng từ abstract class (vd: class Animal)
        // Animal animal = new Animal ();
        // 2. Class con phải là abstract
        // hoặc phải triển khai abstract method của class cha

        Cat cat = new Cat ();
        cat.run();
        cat.makeSound();
        //3. Abstract class có thể k có Abstract method nào
        // interface
        // Mặc định method: public abstract
        // - k có constructor
        // - không thể khởi tạo đối tượng
        // từ khóa: implements
        // Đa kế thừa
        Bird bird   = new Bird();
        bird.fly();
        bird.run();
    }
}
