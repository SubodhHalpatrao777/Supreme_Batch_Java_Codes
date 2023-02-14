package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveAllNegativeToBegining {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,3,4,0,-1,-2,-3,-4));
		int index=0;
		
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)<0)
			{
				int temp=arr.get(index);
				arr.set(index, arr.get(i));
				arr.set(i, temp);
				index++;
			}
		}
		
		System.out.println(arr);

	}

}
