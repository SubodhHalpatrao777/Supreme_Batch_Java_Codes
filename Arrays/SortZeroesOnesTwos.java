package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SortZeroesOnesTwos {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,0,0,1,2,0,0,1,1,0,2));
		
		int mid=0;
		int start=0;
		int end=arr.size()-1;
		
		while(mid<=end)
		{
			if(arr.get(mid)==0)
			{
				int temp=arr.get(start);
				arr.set(start, arr.get(mid));
				arr.set(mid, temp);
				start++;
				mid++;
			}
			else if (arr.get(mid)==1) {
				mid++;
			}
			else {
				int temp=arr.get(end);
				arr.set(end, arr.get(mid));
				arr.set(mid, temp);
				end--;
			}
		}
		
		System.out.println("sorted array: "+arr);
	}

}
