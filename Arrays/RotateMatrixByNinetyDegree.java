package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateMatrixByNinetyDegree {

	public static void main(String[] args) {
		List<List<Integer>> arr= new ArrayList<>();
		arr.add(new ArrayList<>(List.of(1,2,3)));
		arr.add(new ArrayList<>(List.of(4,5,6)));
		arr.add(new ArrayList<>(List.of(7,8,9)));
		
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i;j<arr.get(0).size();j++)
			{
				int temp=arr.get(i).get(j);
				arr.get(i).set(j,arr.get(j).get(i));
				arr.get(j).set(i, temp);
			}
		}
		for(int i=0;i<arr.size();i++)
		{
			Collections.reverse(arr.get(i));
			System.out.println(arr.get(i));
		}
	}

}
