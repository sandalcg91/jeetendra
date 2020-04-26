public class ArmstrongNo
{
	static int a = 0, rem =0, tmp=0;
	public static int armstrongNo(int n)
	{
		tmp = n;
		while(n>0)
		{
			rem = n%10;
			a = a+rem*rem*rem;
			n = n/10;
		}
		return a;
	}
	public static void main(String[] args){
		ArmstrongNo.armstrongNo(153);
		if(tmp==a){
			System.out.println(tmp+" is a Armstrong number");
		}else{
			System.out.println(tmp+" is not a Armstrong number");
		}
	}
}