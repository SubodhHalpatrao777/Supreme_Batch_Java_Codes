package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class allEle1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<5;i++)
		{

			arr[i]=1;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
