package javaOOPs;

public class Product
{
	//non-static fields
	int productId;
	String productName;
	int productPrice;
	
	//static field
	public static String CompanyName;
	
	//default constructor
	public Product()
	{
		productId = 101;
		productName = "Iphone";
		productPrice = 120000;	
	}
	
	//parameterized constructor
	public Product(	int productId, 	String productName, int productPrice)
	{ 
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		
	}
	
	//static block
	static
	{
		CompanyName = "Apple";
	}
	
	//
	public void getProduct()
	{
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);
	}
	 
	public static void getProductCompanyName()
	{
		System.out.println(CompanyName);
	}
}
