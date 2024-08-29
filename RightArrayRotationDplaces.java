/*
Input : 
arr= {1, 3, 5, 7, 9}
d = 2;

Output : 7 9 1 3 5 
*/

import java.util.*;
public class RightArrayRotationDplaces {
    public static void reverse(int [] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void RightRotation(int []arr,int d,int n){
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,0,n-1);
    }

    public static void main(String args[]){
       int[] arr= {1, 3, 5, 7, 9};
       int d = 2;
       int n=arr.length;
       RightRotation(arr,d,n);

       for(int i=0;i< arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
