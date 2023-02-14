package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multiplyByTwo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number");
			int n1=sc.nextInt();
			arr[i]=2*n1;
		}
		sc.close();
		System.out.println(Arrays.toString(arr));

	}

}
