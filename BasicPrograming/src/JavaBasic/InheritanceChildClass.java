package JavaBasic;

public class InheritanceChildClass extends InheritanceBaseClass{

	public static void main(String[] args)
	{
		InheritanceChildClass obj1 = new InheritanceChildClass();
		
		obj1.add();
		obj1.sub();
		obj1.div();
		obj1.mul();

	}
			
	
	public  void div() 
	{
		System.out.println("hey am akeem from Inheritance is div....");		

	}
	public  void mul() 
	{
		System.out.println("hey am akeem from Inheritance is mul....");		

	}
}
