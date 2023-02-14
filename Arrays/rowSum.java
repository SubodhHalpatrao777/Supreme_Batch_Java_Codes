package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class rowSum {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println("Enter value");
				
				arr[i][j]=scanner.nextInt();
				sum+=arr[i][j];
			}
			System.out.println("row sum is: "+sum);
			sum=0;
		}
	}

}
