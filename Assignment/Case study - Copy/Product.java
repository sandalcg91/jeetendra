class Product
{
	int productID;
	String productName;
	String productStatus;
	double productPrice;
	
	static String status = "avl";
	static int i = 0;
	int[] pid = new int[20];
//	String[] pn
	
	
	Product(int productID, String productName, double productPrice)
	{
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		
		System.out.println("ProductId : " +productID + " Product Name : " +productName + " Product Price : " +productPrice);
	}
}