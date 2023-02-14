package Arrays;

import java.util.Scanner;

public class maximumElement2Darray {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int maximum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]>maximum)
				{
					maximum=arr[i][j];
				}
			}	
		}
		
		System.out.println("Maximum Element is: "+maximum);
		
		

	}

}
