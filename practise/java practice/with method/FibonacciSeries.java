import java.util.*;
public class FibonacciSeries
{
	int f1 = 0;
	int f2 = 1, f3;
	int n;
	public void fibonacci(int n)
	{
		System.out.print(f1+" "+f2+" ");
	
		for(int i=2; i<=n; i++)
		{
			f3 = f1 + f2;
			System.out.print(f3+" ");
			f1 = f2;
			f2 = f3;
		}
		System.out.print("\n");
	}
	public static void main(String[] args)
	{
		FibonacciSeries fs = new FibonacciSeries();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range : ");
		fs.fibonacci(sc.nextInt());
	}
}