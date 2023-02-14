package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortZeroesOnes {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the element:");
//		int key=sc.nextInt();
//		
		ArrayList<Integer> a=new ArrayList<>(List.of(1,1,1,1,1,0,0,0,0,0));
		int i=0;
		int start=0;
		int end=a.size()-1;
		while(i!=end)
		{
			if(a.get(i)==0)
			{
				swap(a,start,i);
				i++;
				start++;
			}
			else if(a.get(i)==1)
			{
				swap(a,end,i);
//				i++;
				end--;
			}
		}
		System.out.println(a);
	}

	private static void swap(ArrayList<Integer> a, int start, int i) {
		int temp=a.get(start);
		a.set(start,a.get(i));
		a.set(i,temp);
		
	}

}
