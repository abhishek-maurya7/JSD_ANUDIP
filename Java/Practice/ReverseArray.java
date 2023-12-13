public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 10, 15, 64, 25, 36, 65, 12, 34, 64, 25, 25, 15};
        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
