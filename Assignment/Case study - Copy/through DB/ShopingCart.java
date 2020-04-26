import java.util.*;
public class ShopingCart
{
	static Scanner sc = new Scanner(System.in);
	static int ch = 0;
	static int pcnt = 0;
	static int avlpro = 0;
	static double dis = 0;
	static double amount = 0;
	public int menu()
	{
		System.out.println("\n-----------+++++-----+++++-----+++++-----Shoping Cart-----+++++-----+++++-----+++++-----------");
		System.out.println(
		"1. Add Customer \n"+
		"2. Add Product \n"+
		"3. Check Availability \n"+
		"4. Book Product \n"+
		"5. Get Details of your booked product \n"+
		
		"\n\t Enter Your choice : ");
		
		int n = sc.nextInt();
		return n;
	}
	
	public static void main(String[] args)
	{
		String storename = "Spancer Home Appliances Shop";
		RetailStore rts = new RetailStore(storename);
		ShopingCart scart = new ShopingCart();
		ch = scart.menu();

		while(ch!=0 && ch<5)
		{
			switch(ch)
			{
				case 1: System.out.println("Add Customers : ");
						System.out.print("Enter Customer Name : ");
						String cnm = sc.next();
						System.out.print("Enter " +cnm+ " Contact Number : ");
						long cno = sc.nextLong();
						System.out.println("-------------------++++++++++++++++-----------------------");
						rts.addCustomer(cnm,cno);
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
						rts.addProduct(pnm, ps, ppr);
						System.out.println("-------------------++++++++++++++++-----------------------");
						break;
				
	/*			case 3: System.out.print("Enter the product name : ");
						String ckpnm = sc.next();
						avlpro = rts.checkProductAvailability(ckpnm);
						if(avlpro>0){
							System.out.println("Available products : "+avlpro);
						}else{
							System.out.println("Not Available");
						}
						break;
				
				case 4: System.out.print("Enter Booked id : ");
						int bid = sc.nextInt();
						System.out.print("Enter customer id : ");
						int bcid = sc.nextInt();
						System.out.print("Enter product name : ");
						String bpnm = sc.next();
						System.out.print("Enter number of products for booking : ");
						int noPro = sc.nextInt();
						avlpro = rts.checkProductAvailability(bpnm);
						if(noPro<avlpro)
						{
							pcnt =  rts.bookProduct(bid, bcid, bpnm, noPro);
							
							if(pcnt>0)
							{
								System.out.println("Your Product is added into Cart please make payment");
								
								if(noPro>5)
								{
									dis = 10;
								}else
								{
									dis = 20;
								}
								
								amount = rts.calculateNetAmount(bcid, dis);
								System.out.println(amount);
								System.out.print("Enter the amount : ");
								double pay = sc.nextDouble();
								if(amount == pay)
								{
									System.out.println("you make payment successfully");
								}
								else
								{
									System.out.println("Please check the amount first couldn't make payment");
								}
							}
							else
							{
								System.out.println("Product is not available");
							}
						}
						else
						{
							pcnt = rts.bookProduct(bid, bcid, bpnm, noPro);
							if(pcnt>0)
							{
								System.out.println("Your Product is added into Cart please make payment");

								if(noPro>5)
								{
									dis = 10;
								}
								else
								{
									dis = 20;
								}
								
								amount = rts.calculateNetAmount(bcid, dis);
								System.out.println(amount);
								System.out.print("Enter the amount : ");
								double pay = sc.nextDouble();
								if(amount == pay)
								{
									System.out.println("you make payment successfully");
								}
								else
								{
									System.out.println("Please check the amount first couldn't make payment");
								}
							}
							else
							{
								System.out.println("Product is not available");
							}
						}						
						break;
				
				case 5: System.out.print("Enter Booked Product Order Id : ");
						int boid = sc.nextInt();
						Product.showBookedProductDetails(boid);
						break;
	*/			
				default :
						System.out.println("please enter right choice");
			}
			if(ch<0)
				ch = 0;
				ch = scart.menu();
		}
	}
}