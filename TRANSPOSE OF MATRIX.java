/*
TRANSPOSE OF MATRIX 
Method 1 - Using extra space  
*/

import java.io.*; 
import java.util.*; 

class GFG { 
    
    public static void transposeMatrix(int[][] matrix,int row,int col){
        
        int temp[][]=new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                temp[i][j]=matrix[j][i];
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) 
	{ 
		int matrix[][] =  { {4,5,6}, 
		                    {7,8,9}, 
		                    {10,11,12}};
		
		int row=matrix.length;
		int col=matrix[0].length;
		
		transposeMatrix(matrix,row,col);
	} 
}


//Method 2- Without using Extra Space ; just by swapping elements using third variable temp

import java.io.*; 
import java.util.*; 

class GFG { 
    
    public static void transposeMatrix(int[][] matrix,int row,int col){
        
        for(int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) 
	{ 
		int matrix[][] =  { {4,5,6}, 
		                    {7,8,9}, 
		                    {10,11,12}};
		
		int row=matrix.length;
		int col=matrix[0].length;
		
		transposeMatrix(matrix,row,col);
	} 
}
