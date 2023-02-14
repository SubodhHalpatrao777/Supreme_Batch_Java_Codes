package Arrays;

import java.util.Arrays;

public class ReverseByTwoPointerApproach {

	public static void swap(int[] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,10,11};
		int start=0;
		int end=arr.length-1;
		while(end>=start)
		{
			swap(arr,start,end);
			start++;
			end--;
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
