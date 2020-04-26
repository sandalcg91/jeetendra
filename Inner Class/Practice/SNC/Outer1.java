class Outer1{
	static class Nested{
		public void m1(){
			System.out.println("Static Nested Class");
		}
	}
	public static void main(String[] args){
		new Nested().m1();
	}
}