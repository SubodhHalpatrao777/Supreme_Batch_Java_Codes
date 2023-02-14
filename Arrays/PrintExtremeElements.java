package Arrays;

import java.util.Arrays;

public class PrintExtremeElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,10};
		int start=0;
		int end=arr.length-1;
		while(end>=start)
		{
			if(start==end)
			{
				System.out.print(arr[start]);
			}
			else {
				System.out.print(arr[start]+" "+arr[end]+" ");
			}
			start++;
			end--;
			
		}

	}

}
