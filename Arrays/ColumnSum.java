package Arrays;

import java.util.Scanner;

public class ColumnSum {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("Enter value");
				
				arr[j][i]=scanner.nextInt();
				sum+=arr[j][i];
			}
			System.out.println("column sum is: "+sum);
			sum=0;
		}

	}

}
