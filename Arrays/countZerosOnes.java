package Arrays;

import java.util.Scanner;

public class countZerosOnes {

	public static void main(String[] args) {
		int zeroCount=0;
		int oneCount=0;
		
		int arr[]= {1,1,1,0,0,0,0,1,1,0,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				zeroCount++;
			}
			else if(arr[i]==1) {
				oneCount++;
			}
		}
		System.out.println("zeroes count is: "+zeroCount);
		System.out.println("ones count is: "+oneCount);

	}

}
