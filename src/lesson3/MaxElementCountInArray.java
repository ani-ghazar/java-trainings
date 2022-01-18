package lesson3;

public class MaxElementCountInArray {

    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 23, 55, 111, 45, 45, 55, 45, 111};

        if (arr.length < 1) {
            System.out.print("Array is empty");
            return;
        }

        int max = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= max) {
                if (arr[i] == max) {
                    count++;
                } else {
                    count = 1;
                }
                max = arr[i];
            }

        }

        System.out.printf("Maximum element in array is " + max + ", which exists " + count + " times");
    }
}
