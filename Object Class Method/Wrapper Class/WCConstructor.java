class WCConstructor
{
	public static void main(String[] args)
	{
	//	Byte B = new Byte(125);
		Byte B1 = new Byte("125");
	//	Byte B2 = new Byte("abc");
	//	System.out.println(B);
		System.out.println(B1);
	//	System.out.println(B2); // NFE
		

	//	Short s = new Short(128);
		Short s1 = new Short("128");
	//	Short s2 = new Short("xxx");
	//	System.out.println(s);
		System.out.println(s1);
	//	System.out.println(s2);  // NFE
	
		Integer I = new Integer("10");
		Integer I1 = new Integer(10);
		Integer I2 = 10;
		System.out.println(I);
		System.out.println(I1);
		System.out.println(I2);
		
		Float f = new Float(1.5f);
		Float f1 = new Float(1.5);
		Float f2 = new Float("1.5");
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("True");
		Boolean b3 = new Boolean("false");
		Boolean b4 = new Boolean("chandan");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		Character c = new Character('g');
		//Character c1 = new Character("g");
		System.out.println(c);
		//System.out.println(c1);
	}
}