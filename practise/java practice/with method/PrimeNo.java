public class PrimeNo{
	public void isPrime(int n){
		int i = 2;
		int tmp = 0;
		while(i<n/2){
			if(n%2==0){
				tmp = n;
			}
		}i++;
		if(n!=tmp){
			System.out.println(n+ " is a prime no");
		}else{
			System.out.println(n+ " is not a prime no");
		}
	}
	public static void main(String[] args){
		PrimeNo pno = new PrimeNo();
	//	pno.isPrime(5);
		pno.isPrime(11);
	}
}