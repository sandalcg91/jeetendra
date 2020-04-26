class Outer3{
	int x = 10;
	static int y = 20;
	private static int z = 30;
	static class Nested{
		public void m1(){
	//		System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
	public static void main(String[] args){
		new Nested().m1();
	}
}