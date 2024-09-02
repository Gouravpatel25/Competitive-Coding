/*
Given an array of N integers, the task is to replace elements with their rank in the array.

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted, the array becomes 2, 6, 15, 20, 26, 98. The rank of 2 is 1, rank of 6 is 2, rank of 15 is 3, and so on.
*/

import java.util.*;

public class A{
    
    public static void replaceElements(int[] arr,int n){
        
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {       // can be replaced by writing  int[] temp = Arrays.copyOf(arr, n);  
        temp[i] = arr[i];
        }

        Arrays.sort(arr);
        int rank=1;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,rank);
                rank++;
            }
        }
        
        for(int j=0;j<n;j++){
            System.out.print(map.get(temp[j])+" ");
        }
    } 
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        replaceElements(arr,n);
    }
}
