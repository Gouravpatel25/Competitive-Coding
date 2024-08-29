/*
GCD of 2 numbers.
GCD is also called as HCF.
GCD means the highest common factors of 2 given numbers i.e, the highest factor which divides both the numbers.
*/

public class GCD {
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
