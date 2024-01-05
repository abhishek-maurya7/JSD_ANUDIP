package javaCore;

class DuplicateArrayElements {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 10, 15, 64, 25, 36, 65, 12, 34, 64, 25, 25, 15};
        for(int i = 0; i<numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}
