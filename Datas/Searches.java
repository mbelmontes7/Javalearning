package Datas;
import java.util.Arrays;

public class Searches {
    public static double sequentialSearch(double[] arr, double key) {
        int arraySize = arr.length;
        for(int i = 0; i < arraySize; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] payments = {3.35, 12.07, 122.76, 7.33, 6.04, 681.78, -0.05, 45.25, 107.33, 6.25, 3.45, 3.45, 0.52};
        double searchKey = 7.33;
        System.out.println("Search Key found at: " + sequentialSearch(payments, searchKey));
    }
}
