package JavaBasic;

public class RemoveSpacesOnString {

	public static void main(String[] args) 
		{
		//Method 1
		String str = "You Are Mine";
		String str1="******";
		
		char[] Chars = str.toCharArray();
		
		for(int i=0;i<Chars.length; i++)
		{
			if(Chars[i]!=' ')
			{
				str1= str1 + Chars[i];
			}
		}
		System.out.println(str1);
		
		//Method 2
		System.out.println("\n.................");
		
		String str2 = str.replaceAll(" ","");
		System.out.println(str2);
		
		//Method 3
		System.out.println("\n.....................");
		String str3 ="^^^^^^";
		for(int i=0;i<Chars.length; i++)
		{
			if(Chars[i]!=' ') 
			{
				
				str3= str3 + str.charAt(i);
			
			}
		}
	
		System.out.println(str3);
	}
}
