public class ArrayDemo {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        String [] name = new String[]{"khoa","huy","long"};
        int [] array = new int[0];

        // kích thước của mảng
        System.out.println("number.length = " + number.length);
        System.out.println("name.length = " + name.length);
        System.out.println("array.length = " + array.length);

        // truy cập dựa theo chỉ số (index)
        System.out.println("name[1] = " + name[1]);
        int lastIndex = number.length -1;
        System.out.println("number[lastIndex] = " + number[lastIndex]);

        // lặp các phần tử trong mảng
        for (int i = 0; i< number.length; i++) {
        System.out.println("number[i] = " + number[i]);
        }

        // lặp các phần tử trong mảng từ phải qua trái
        for (int i = number.length-1; i>= 0; i --) {

        }
    }
}
