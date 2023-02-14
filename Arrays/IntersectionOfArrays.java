package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfArrays {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the element:");
//		int key=sc.nextInt();
//		
		ArrayList<Integer> a=new ArrayList<>(List.of(1,2,3,3,4));
		ArrayList<Integer> b=new ArrayList<>(List.of(1,2,3,3,4,5,6,7,8));
		ArrayList<Integer> ans=new ArrayList<>();
		
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<b.size();j++)
			{
				if(a.get(i)==b.get(j))
				{
					ans.add(a.get(i));
					b.set(j, -1);
				}
			}
		}
		
		
		
		System.out.println("Intersection of array is: "+ans);
	}

}
