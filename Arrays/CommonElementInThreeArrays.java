package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInThreeArrays {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> arr2=new ArrayList<>(List.of(1,2,3,6,7,8));
		ArrayList<Integer> arr3=new ArrayList<>(List.of(1,2,3,4,5,7,8));
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr1.size();i++)
		{
			boolean flag=false;
			for(int j=0;j<arr2.size();j++)
			{
				if(arr2.get(j)==arr1.get(i))
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				flag=false;
				for(int k=0;k<arr3.size();k++)
				{
					if(arr3.get(k)==arr1.get(i))
					{
						flag=true;
						break;
					}
				}
				
			}
			if(flag)
			{
				ans.add(arr1.get(i));
			}
		}
		System.out.println("Common elements in 3 arrays is: "+ans);
	}

}
