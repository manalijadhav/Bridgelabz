
public class PointTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child c = new Child(100,300);
	}

}
class GrandFather
{
	int a;
	GrandFather(int a)
	{
		//super;
		this.a=a;
		System.out.println("\n\t GrandFather ctor : "+a);
	}
	
}
class Father extends GrandFather
{
	
	Father(int x)
	{
		super(x);
	    
		System.out.println("\n\t Father ctor : ");		
	}

}
class Child extends Father
{
	int c;
	Child(int g, int c)
	{
		super(g);
		this.c=c;
		System.out.println("\n\t Child ctor : "+c);
	
	}
}