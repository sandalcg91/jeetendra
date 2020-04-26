enum Months2{
	Jan(31), Feb(28), Mar(31), Apr(30);
	int i;
	private Months2(int i){
		this.i = i;
	}
}
class C{
	public static void main(String[] args){
		Months2 m1 = Months2.Feb;
		System.out.println(m1);
		System.out.println(m1.i);
	}
}