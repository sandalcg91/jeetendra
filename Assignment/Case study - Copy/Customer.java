class Customer
{
	int customerID;
	String customerName;
	long contactNo;
	
	int[] cid = new int[20];
	String[] cnm = new String[20];
	long[] cno = new long[20];
	static int i=0;
	
	Customer(int customerID, String customerName, long contactNo)
	{
		this.customerID = customerID;
		this. customerName = customerName;
		this.contactNo = contactNo;
		
		cid[i] = customerID;
		cnm[i] = customerName;
		cno[i] = contactNo;
		i++;
		
		System.out.println("CustomerID : "+customerID + " Customer Name : "+customerName + " Contact Number : " +contactNo);
	}
}