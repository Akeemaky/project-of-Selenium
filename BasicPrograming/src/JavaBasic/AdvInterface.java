package JavaBasic;

public class AdvInterface implements Interface {

	public static void main(String[] args)
	{
		AdvInterface obj1 = new AdvInterface();
		obj1.add();
		obj1.cos();
		obj1.sin();
		obj1.sub();

	}
	public void cos() 
	{
		System.out.println("The Interface is cos*****"+x);
		
	}public void sin() 
	{
		System.out.println("The Interface is sin*****"+x);
		
	}

	public void add() 
	{
		System.out.println("The Interface is add*****"+x);
		
	}

	public void sub() 
	{
		
		System.out.println("The Interface is sub*****"+x);
	}

}
