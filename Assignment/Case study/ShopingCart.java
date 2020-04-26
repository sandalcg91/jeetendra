import java.util.*;
public class ShopingCart
{
	static Scanner sc = new Scanner(System.in);

	static int ch = 0;

	public int menu()
	{
		System.out.println("\n---------------------+++++Shoping Cart+++++---------------------");
		System.out.println(
		"1. Add Customer \n"+
		"2. Add Product \n"+
		"3. Check Availability \n"+
		"4. Booked Products \n"+
		
		"\n\t Enter Your Choice : ");
		
		int n = sc.nextInt();
		
		return n;
	}
	
	public static void main(String[] args)
	{
		String storeName = "Spancer Home Appliances Shop";
		RetailStore rs = new RetailStore(storeName);
		ShopingCart scart = new ShopingCart();
		ch = scart.menu();
		
		double prodPrice;
		String[] prodName = new String[20];
	//	String prodName1;
	//	String prodName1 = "Sony";
	//	String prodName2 = "Vivo";
	//	String prodName3 = "Oppo";
		
		while(ch!=0 && ch<5)
		{
			switch(ch)
			{
				case 1: System.out.println("Add Customers : ");
				  		System.out.print("Enter Customer Name : ");
						String cnm = sc.next();
						System.out.print("Enter " +cnm+ " Contact Number : ");
						long cno = sc.nextInt();
						System.out.println("-------------------++++++++++++++++-----------------------");
						rs.addCustomer(cnm, cno);
						System.out.println("-------------------++++++++++++++++-----------------------");
						break;
				case 2: System.out.println("Add Products : ");
						System.out.print("Enter Product Name : ");
						String pnm = sc.next();
						System.out.print("Enter Product Status : ");
						String ps = sc.next();
						System.out.print("Enter Product price : ");
						double ppr = sc.nextDouble();
						System.out.println("-------------------++++++++++++++++-----------------------");
						rs.addProduct(pnm, ps, ppr);
						System.out.println("-------------------++++++++++++++++-----------------------");
						break;
						
				case 3: System.out.print("Enter customer id : ");
						int cid = sc.nextInt();
						System.out.print("Enter product name : ");
						String pnm1 = sc.next();
						System.out.print("Enter how many number of products do you want to book : ");
						int tnp = sc.nextInt();
						//rs.
				default:
						 System.out.println("please enter right choice");
			}
			if(ch<0)
				ch = 0;
				ch = scart.menu();
		}
	}
}