enum Months1{
	Jan(31), Feb(28), Mar(31), Apr(30);
	
	Months1(int i){
		System.out.println(i);
	}
/*	Months1(String s){
		System.out.println("String");
	}*/
}
class B{
	public static void main(String[] args){
		Months1 m1 = Months1.Feb;
		System.out.println(m1);
	}
}