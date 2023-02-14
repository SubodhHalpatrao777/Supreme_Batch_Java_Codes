package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementNByTwo {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,3,4,3,5,3,4,3,3,4,4,4,4,4,44,4,4,4,4,4,4,4,4));
		
		int candidate=findMajorityElement(arr);
		System.out.println("Majority element occuring more than N/2 times is: "+candidate);
	}

	private static int findMajorityElement(ArrayList<Integer> arr) {
		int candidate=0;
		int count=0;
		
		for(int i=0;i<arr.size();i++)
		{
			if(count==0)
			{
				candidate=arr.get(i);
			}
			if(candidate==arr.get(i))
			{
				count++;
			}
			else {
				count--;
			}
		}
		return candidate;
	}

}
