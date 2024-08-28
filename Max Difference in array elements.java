/* Given an Integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return zero. 
Nums:[3,6,9,1] 
Output :3 
*/

import java.util.*;

public class A{
    public static int maxDifference(int[] arr,int n){
        
        //Arrays.sort(arr);
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        int maxdiff=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff>maxdiff){
                maxdiff=diff;
            }
        }
        
        return maxdiff;
    } 
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       
       System.out.println(maxDifference(arr,n));
   }
}
