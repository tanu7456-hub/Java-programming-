// Practical 1 : to find the sum of odd and even numbers in an array. 
import java.util.Scanner;

class SumOddEven {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = obj.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}
