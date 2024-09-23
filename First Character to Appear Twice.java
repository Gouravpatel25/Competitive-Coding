import java.io.*;
import java.util.*;

public class A {
    
    public static Character firstCharToAppearTwice(String a){
        HashMap<Character,Integer> map= new HashMap();
        char[] arr=a.toCharArray();
        
        for(char i:arr){
            if(map.containsKey(i)){
                return i;
            }
            
            map.put(i,1);
        }
        
        return null;
    } 
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        System.out.println(firstCharToAppearTwice(a));
    }
}
