/* Given n as input, Find the nth fibonacci series number.
Input 1: 1
Output: 1

Input 2: 9
Output: 34
Example od fibonacci series : 0,1,1,2,3,5,8,13,21,34,55.............
*/

import java.util.*;

public class A{
    public static int fibonacciSeries(int n, int a, int b){
        int c = 0; // Initialize c
        if (n == 0) return a;
        if (n == 1) return b;
        
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b; // Return the nth term
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
       
        System.out.println(fibonacciSeries(n, a, b));
    }
}
