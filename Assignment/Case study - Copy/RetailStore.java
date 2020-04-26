class RetailStore
{
	String storeName;
	int[] cust1 = new int[20];
	String[] cust2 = new String[20];
 	long[] cust3 = new long[20];
	static int i=0;
	
	int[] prod1 = new int[20];
	String[] prod2 = new String[20];
	String[] prod3 = new String[20];
	double[] prod4 = new double[20];

	static int j = 0;
	RetailStore(String storeName)
	{
		this.storeName = storeName;
	}
	
	static int cid = 0;
	public static int generateCustomerId()
	{
		cid++;
		return cid;
	//	System.out.println(cid);
	}
	
	public void addCustomer(String customerName, long contactNumber)
	{
		int custid = generateCustomerId();
		cust1[i] = custid;
		cust2[i] = customerName;
		cust3[i] = contactNumber;
		i++;
		
		Customer cust = new Customer(custid,customerName,contactNumber);
	}

	static int pid = 0;
	public static int generateProductId()
	{
		pid++;
		return pid;
	//	System.out.println(pid);
	}
	
	public void addProduct(String productName, String productStatus, double productPrice)
	{
		int prodid = generateProductId();
		prod1[j] = prodid;
		prod2[j] = productName;
		prod3[j] = productStatus;
		prod4[j] = productPrice;
		j++;
		
		Product prod = new Product(prodid, productName, productPrice);
	}
}