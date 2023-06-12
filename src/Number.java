import java.util.Arrays;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String numberString = Integer.toString(number);
        char[] arr = numberString.toCharArray();
        int[] intArr = new int[arr.length];
        for (int n = 0; n < arr.length; n++) {
            intArr[n] = Character.getNumericValue(arr[n]);
        }
        System.out.println(Arrays.toString(intArr));

    }
}
