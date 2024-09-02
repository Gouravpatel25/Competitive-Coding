/*
Consider the following series: 1, 1, 2, 3, 4, 7, 8, 15, 9, 24, 16, 40, 32, 72, 104, 27 ...

This series is a mixture of 3 series:

All the prime position values are powers of 2.
All the perfect square positions are powers of 3.
Remaining positions are the sum of the previous 2 values.
For example, if N = 15, the 15th term in the series is 104, so only value 104 should be printed to STDOUT.

You can assume that N will not exceed 40.
*/

import java.util.Scanner;

public class SeriesGenerator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        int[] series = new int[N];
        series[0] = 1;
        series[1] = 1;
        int j=0;  //for prime power
        int k=0;  // for perfectSquare
        for (int i = 2; i < N; i++) {
            if (isPrime(i + 1)) {
                series[i] = (int) Math.pow(2, j);
                j++;
            } else if (isPerfectSquare(i + 1)) {
                series[i] = (int) Math.pow(3, k);
                k++;
            } else {
                series[i] = series[i - 1] + series[i - 2];
            }
        }
        
        System.out.println("The " + N + "th term in the series is: " + series[N - 1]);
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
