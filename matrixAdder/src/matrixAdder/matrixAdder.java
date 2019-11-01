/*
 * Written by Bradley Grose
 */

package matrixAdder;

import java.util.Scanner;

public class matrixAdder {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt Size matrix 1
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Please enter the length and width of the first matrix");
		int m1n1 = keyboard.nextInt();
		int m1n2 = keyboard.nextInt();
		int[][] matrix1 = new int[m1n1][m1n2];
		
		for(int i=0; i<m1n2; i++)
		{
			for(int j=0; j<m1n1; j++)
			{
				System.out.println("Enter value at index "+i+" "+j);
				matrix1[i][j] = keyboard.nextInt();
			}
		}
		System.out.println(); //Spacer
		
		//Get second size of matrix
		System.out.println("Please enter the length and width of the second matrix");
		int m2n1 = keyboard.nextInt();
		int m2n2 = keyboard.nextInt();
		int[][] matrix2 = new int[m2n1][m2n2];
		
		if(m1n1==m2n1&&m1n2==m2n2)
		{
			for(int i=0; i<m2n2; i++)
			{
				for(int j=0; j<m2n1; j++)
				{
					System.out.println("Enter value at index "+i+" "+j);
					matrix2[i][j] = keyboard.nextInt();
				}
			}
		}
		else  //Invaid Dimensions and Quit Code
		{
			System.out.println("Invalid Dimensions");
			System.exit(0);
		}
		
		System.out.println(); //Spacer
		
		//Print first Matrix
		for(int i=0; i<m1n2; i++)
		{
			for(int j=0; j<m1n1; j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("+");
		
		//Print Second Matrix
		for(int i=0; i<m2n2; i++)
		{
			for(int j=0; j<m2n1; j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("=");
		
		for(int i=0; i<m1n2; i++)  //Assume Same Sizee
		{
			for(int j=0; j<m1n1; j++)
			{
				System.out.print((matrix1[i][j]+matrix2[i][j])+" ");
			}
			System.out.println();
		}
	}
	

}
