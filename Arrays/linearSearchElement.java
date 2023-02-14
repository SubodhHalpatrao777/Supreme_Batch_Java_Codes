package Arrays;

import java.util.Scanner;

public class linearSearchElement {

	public static boolean linearSearch(int [] arr,int n,int key)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element:");
		int key=sc.nextInt();
		int[] arr= {1,3,7,8};
		
		if(linearSearch(arr, arr.length, key))
		{
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
		

	}

}
