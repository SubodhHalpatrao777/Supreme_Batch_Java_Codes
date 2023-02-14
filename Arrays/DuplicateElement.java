package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,3,4,0,2,22,53,45));
		
		Set<Integer> set=new HashSet<>();
		int ans=0;
		for(int i=0;i<arr.size();i++)
		{
			if(set.contains(arr.get(i)))
			{
				ans=arr.get(i);
				break;
			}
			else {
				set.add(arr.get(i));
			}
		}
		
		System.out.println("Duplicate element is: "+ans);
	}

}
