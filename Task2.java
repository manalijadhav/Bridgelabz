class Factory
{
	Product createProduct() 
	{
		System.out.println("Raw materials in factory");
		System.out.println("product in making");
		Product prod=new Product();
		System.out.println("product is created");
		return prod;
	}
	
	Product2 createProduct2() 
{
	System.out.println("Raw materials in factory");
	System.out.println("product2 in making");
	Product2 prodref2=new Product2();
	System.out.println("product2 is created");
	return prodref2;
}
}

class Product2
{
	void use2()
	{
		System.out.println("product2 in use");
	}
}

class Product
{
	void use()
	{
		System.out.println("product in use");
	}
}
public class Task2
{
	public static void main(String[] args)
	{
		Factory factObj=new Factory();
		Product prod1= factObj.createProduct();
		prod1.use();
		System.out.println("----------------------------------------------");
		Product2 prod2=factObj.createProduct2();
		prod2.use2();
	}

}
