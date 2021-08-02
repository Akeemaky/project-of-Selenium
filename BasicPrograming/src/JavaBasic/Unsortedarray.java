package JavaBasic;

import java.util.HashSet;
import java.util.Set;

public class Unsortedarray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,3};
		int len= arr.length;

		Set<Integer> hs = new HashSet<>();
		for (int i=0; i<len-1; i++)
		{
			hs.add(arr[i]);
			
		}
			
				System.out.println(" " + hs );
	
		}
}