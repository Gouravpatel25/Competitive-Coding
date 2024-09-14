/*
Given a row x col 2D matrix where each row and each column is sorted in increasing order, write a program to find the position of a target element n in the matrix. If the element exists, print its position as (i, j). If the element is not found, print "Element not found."
The code should maintain a linear time complexity in searching the element in the 2D array.

Input Format:
The first line contains two integers, row and col, representing the number of rows and columns of the matrix.
The next row lines contain col integers each, representing the elements of the matrix.
The last line contains the integer n, the element to search for in the matrix.

Input:
4
4
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50
29

Output: Element found at: (2, 1)
*/

import java.util.Scanner;

public class A {

    // Method to find the position of an element in a sorted 2D matrix
    public static String findPositionInMatrix(int row, int colm, int[][] arr, int n) {
        int i = 0;
        int j = colm - 1;

        // Start searching from the top-right corner of the matrix
        while (i < row && j >= 0) {
            if (arr[i][j] == n) {
                return "Element found at: (" + i + ", " + j + ")";
            } else if (arr[i][j] < n) {
                i++; // Move down if the current element is smaller than 'n'
            } else {
                j--; // Move left if the current element is larger than 'n'
            }
        }

        return "Element not found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows and columns
        int row = sc.nextInt();
        int colm = sc.nextInt();

        // Declare the 2D array
        int[][] arr = new int[row][colm];

        // Input the elements of the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input the element to search
        int n = sc.nextInt();

        // Print the result of the search
        System.out.println(findPositionInMatrix(row, colm, arr, n));
    }
}
