/*
You are given two integers A and B. A represents a coordinate on the X-axis (0,𝐴)(0,A) and B represents a coordinate on the Y-axis (𝐵,0)(B,0).
These are two coordinate points of a right-angled triangle, with the third point being the origin 
(0,0)(0,0). You will be given N such triangles in the input. Find out and print the length of the hypotenuse of all the triangles.
Note:
The formula for the length of a hypotenuse is 
hypotenuse=sqrt(𝑎^2+𝑏^2)
​, where a and b represent the lengths of the other two sides of the triangle.
If the length of the hypotenuse is in decimal, round it to the next greater integer (use ceiling function).
Input Format:
The input consists of the following format:
The first line contains an integer N denoting the number of triangles.
The next N lines contain two space-separated integers representing A and B respectively.
The input will be read from the standard input by the candidate.

Output Format:
The output consists of N lines:
Each line representing the length of the hypotenuse of the triangle.
*/

import java.util.*;

public class A {
    public static int pythagoreanTheorem(int a, int b) {
        double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return (int) Math.ceil(hypo);  // Cast the result to int
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a, b;
        for(int i = 0; i < N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(pythagoreanTheorem(a, b)); // Call the method and print the result
        }
    }
}
