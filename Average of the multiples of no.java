/*
Problem Statement:
Complete the average function in the editor below. It has the following parameters:

Parameters	Name	Type	Description
N	INTEGER	denotes the integer
P	INTEGER	denotes the number of multiples
Return:

The function must return an INTEGER denoting the average of the multiples of a given number.
This problem requires you to implement a function that calculates the average of the first P multiples of the integer N and returns the result as an integer.

Input: N :6
M:5
Output:18
*/

import java.util.*;
 
public class Main{
    
    public static float averageOfMultiples(int N,int P){
        
        int sum = 0;

        // Calculate the sum of the first P multiples of N
        for (int i = 1; i <= P; i++) {
            sum += N * i;
        }

        // Calculate and return the average as an integer
        int avg = sum / P;
        return avg;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int P=sc.nextInt();
        
        System.out.println(averageOfMultiples(N,P));
    }
}
