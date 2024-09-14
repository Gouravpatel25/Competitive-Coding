/*
BRUTE FORCE APPROCH
TIME COMPLEXITY :- O(n^2)
*/

import java.util.*;

public class A {

    public static void findPositionInMatrix(int row, int colm, int[][] arr, int n) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                if (arr[i][j] == n) {
                    System.out.println("Element Found at: " + i + "," + j);
                    return; // Exit the method immediately after finding the element
                }
            }
        }
        // If we finish the loop without finding the element, print this message
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int colm = sc.nextInt();
        
        int[][] arr = new int[row][colm];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int n = sc.nextInt();
        
        findPositionInMatrix(row, colm, arr, n);
    }
}
