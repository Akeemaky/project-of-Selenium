package JavaBasic;

import java.lang.reflect.Array;

public class LargeNumberofarray {

	public static void main(String[] args) {
		
		int arr[] = {-9,02,05,77,24,99};
		
		int large = arr[0];
		int smallest = arr[0];
		
		int len= arr.length;
		
		for(int i=0;i<len;i++)
		{
		if(arr[i]>large)
		{
			large=arr[i];
		}
		}
		System.out.println(" largest number in array " + large);
		System.out.println(" Smallest number in array " + smallest);

	}

}
