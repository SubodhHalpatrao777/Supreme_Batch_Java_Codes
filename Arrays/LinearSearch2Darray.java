package Arrays;

import java.util.Scanner;

public class LinearSearch2Darray {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		Scanner scanner=new Scanner(System.in);
		boolean flag=false;
		
		System.out.println("Enter element to search: ");
		int key=scanner.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==key)
				{
					flag=true;
					break;
				}
			}	
		}
		if(flag)
		{
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}

	}

}
