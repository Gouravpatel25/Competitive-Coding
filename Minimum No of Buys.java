/*
You need to find out the minimum number of times you need to buy coconut sweets to stay alive on an island where:

You can buy at most 1 box of sweets per day (each box contains N sweets).
You need to consume E sweets daily for D days.
You cannot buy sweets on Sundays.
Constraints:
If you cannot buy enough sweets to survive, return -1.
The week starts from Monday.

If the inputs are:
N = 10 (each box has 10 sweets)
E = 2 (you need to eat 2 sweets daily)
D = 12 (you need to survive for 12 days)

The output will be:
Minimum number of boxes needed: 3
*/

import java.util.*;

public class A {
    
    public static int minimumNoOfBuys(int N,int E,int D){
        
        int totalSweetNeeded =E*D;
        
        int buyDays= D-(D/7);
        
        int maxSweetBuy = buyDays*N;
        
        if(maxSweetBuy<totalSweetNeeded){
            return -1;
        }
        
        int minbox = (int)Math.ceil((double)totalSweetNeeded/N);
        
        return minbox;
    }
   
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt(); //no of sweets per box
        int E=sc.nextInt(); //no of requirements per day
        int D=sc.nextInt(); //no of days
        
        System.out.println("The minimum no of times you need to buy sweets is :" + minimumNoOfBuys(N,E,D) );
    }
}
