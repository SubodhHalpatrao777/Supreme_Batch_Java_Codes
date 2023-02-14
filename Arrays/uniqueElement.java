package Arrays;

import java.util.*;

public class uniqueElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element: ");
			int data=sc.nextInt();
			arr.add(data);
		}
		int unique=findUnique(arr);
		
		System.out.println("unique element is: "+unique);

	}

	private static int findUnique(ArrayList<Integer> arr) {
		int ans=0;
		
		for(int i=0;i<arr.size();i++)
		{
			ans=ans^arr.get(i);
		}
		
		return ans;
	}

}
