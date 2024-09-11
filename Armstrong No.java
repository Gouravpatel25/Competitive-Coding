/*
Input: 153 Or 407
Output: Armstrong No
*/

import java.util.*;
 
public class ArmstrongNo{
    
    public static String armstrongornot(int n){
        
        int power=0, rem, sum=0;
        int temp=n;
        
        while(temp>0){
            temp=temp/10;
            power++;
        }
        
        temp=n;
        
        while(temp>0){
           rem= temp%10;
           sum+= Math.pow(rem,power);
           temp= temp/10;
        }
        
        if(sum==n){
            return "Armstrong No";
        }
        
        else{
            return "Not Armstrong No";
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        System.out.println(armstrongornot(n));
    }
}
