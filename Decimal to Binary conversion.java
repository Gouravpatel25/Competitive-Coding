import java.util.*;
 
public class A{
    
    public static String binaryConversion(int n){
        
        StringBuilder binary=new StringBuilder();
        int rem;
        
        while(n>0){
            rem=n%2;
            binary.append(rem);
            n=n/2;
        }
        
        return binary.reverse().toString();
        }
    
   
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        System.out.println(binaryConversion(n));
    }
}
