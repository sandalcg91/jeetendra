import java.util.*;
public class MatrixMani
{
	int[][] mat1 = new int[3][3];
	int[][] mat2 = new int[3][3];
	
	int[][] AdditionMatrix(int[][] mat1, int[][] mat2)
	{
		int[][] sum = new int[3][3];
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1.length; j++)
			{
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		System.out.println("Addition of Two Matrix : ");
		for(int i=0; i<sum.length; i++)
		{
			for(int j=0; j<sum.length; j++)
			{
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
		return sum;
	}
	
	int[][] SubstractionMatrix(int[][] mat1, int[][] mat2)
	{
		int[][] sub = new int[3][3];
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1.length; j++)
			{
				sub[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		
		System.out.println("Substraction of Two Matrix : ");
		for(int i=0; i<sub.length; i++)
		{
			for(int j=0; j<sub.length; j++)
			{
				System.out.print(sub[i][j]+ " ");
			}
			System.out.println();
		}
		return sub;
	}
	
	int[][] MultiplicationMatrix(int[][] mat1, int[][] mat2)
	{
		int[][] mul = new int[3][3];
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1.length; j++)
			{
				for(int k=0; k<mat1.length; k++)
				{
					mul[i][j] = mul[i][j] + mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		System.out.println("Multiplication of Two Matrix : ");
		for(int i=0; i<mul.length; i++)
		{
			for(int j=0; j<mul.length; j++)
			{
				System.out.print(mul[i][j]+ " ");
			}
			System.out.println();
		}
		return mul;
	}
	
	int[][] TransposeofMatrix(int[][] mat1)
	{
		int[][] trans = new int[3][3];
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1.length; j++)
			{
				trans[i][j] = mat1[j][i];
			}
		}
		System.out.println("Transpose of a Matrix : ");
		for(int i=0; i<trans.length; i++)
		{
			for(int j=0; j<trans.length; j++)
			{
				System.out.print(trans[i][j]+ " ");
			}
			System.out.println();
		}
		return trans;
	}
	
	
	public static void main(String[] args)
	{
		MatrixMani mm = new MatrixMani();
		
		Scanner sc = new Scanner(System.in);
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		
		System.out.println("Enter the First Matrix Elements : ");
		for(int i =0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1.length; j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the Second Matrix Elements : ");
		for(int i =0; i<mat2.length; i++)
		{
			for(int j=0; j<mat2.length; j++)
			{
				mat2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First Matrix is : ");
		for(int i=0; i<mat1.length; i++)
		{
			for(int j =0; j<mat1.length; j++)
			{
				System.out.print(mat1[i][j]+ " ");
			}
			System.out.println("");
		}
		
		
		System.out.println("Second Matrix is : ");
		for(int i=0; i<mat2.length; i++)
		{
			for(int j =0; j<mat2.length; j++)
			{
				System.out.print(mat2[i][j]+ " ");
			}
			System.out.println("");
		}
		
		
		mm.AdditionMatrix(mat1,mat2);
		mm.SubstractionMatrix(mat1,mat2);
		mm.MultiplicationMatrix(mat1,mat2);
		mm.TransposeofMatrix(mat1);
	}
}