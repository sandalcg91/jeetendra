public class PalindromeNo
{
	static int p = 0, rem =0, tmp=0;
	public static int palindromeNo(int n)
	{
		tmp = n;
		while(n>0)
		{
			rem = n%10;
			p = p*10 + rem;
			n = n/10;
		}
		return p;
	}
	public static void main(String[] args){
		PalindromeNo.palindromeNo(12321);
		if(tmp==p){
			System.out.println(tmp+" is a Palindrome number");
		}else{
			System.out.println(tmp+" is not a Palindrome number");
		}
	}
}