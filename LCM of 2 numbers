public class LCM {
    // Method to calculate GCD
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num1;
    }

    // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return (num1 * num2) / gcd;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
