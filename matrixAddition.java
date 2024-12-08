package lab_1;
import java.util.Scanner;

public class matrixAddition {
	
	private static void readMatrix1(int[][] matrix1,Scanner scan)
	{
		System.out.println("enter the matrix one elements");
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				matrix1[i][j]=scan.nextInt();
			}
		}
	}
	private static void readMatrix2(int[][] matrix2,Scanner scan)
	{
		System.out.println("enter the matrix two elements");
		for(int i=0;i<matrix2.length;i++)
		{
			for(int j=0;j<matrix2[i].length;j++)
			{
				matrix2[i][j]=scan.nextInt();
			}
		}
	}
	
	private static void addition(int[][] matrix1,int[][] matrix2,int[][] sumMatrix,Scanner scan)
	{
		System.out.println("sumof two matrix");
		for(int i=0;i<sumMatrix.length;i++)
		{
			for(int j=0;j<sumMatrix[i].length;j++)
			{
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.printf("%d",sumMatrix[i][j]);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		if(args.length==0)
			System.out.println("there no any comman line arrguments are given");
		
		int N=Integer.parseInt(args[0]);
		
		int matrix1[][]=new int[N][N];
		int matrix2[][]=new int[N][N];
		int sumMatrix[][]=new int[N][N];
		
		Scanner scan =new Scanner(System.in);
		
		matrixAddition.readMatrix1(matrix1, scan);
		
		matrixAddition.readMatrix2(matrix2, scan);
		
		matrixAddition.addition(matrix1, matrix2, sumMatrix, scan);
		
		

	}

}
