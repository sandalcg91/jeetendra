import java.util.Scanner;
public class DecimalToBinary
{
	public void printBinary(int n)
	{
		int[] binary = new int[n];
		int index = 0;
		while(n > 0)
		{
			binary[index++] = n%2;
			n = n/2;
		}
		for(int i = index-1; i>=0; i--)
			System.out.print(binary[i]);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to convert into binary : ");
		DecimalToBinary db = new DecimalToBinary();
		db.printBinary(sc.nextInt());
		System.out.println("");
	}
}