package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(1, 2, 4, 6, 3, 7, 5));
		int sum=0;
		int actualSum=0;
		
		for(int i=0;i<arr.size();i++)
		{
			actualSum+=arr.get(i);
			sum=sum+i+1;
		}
		sum=sum+arr.size()+1;
		
		System.out.println("missing element is: "+(sum-actualSum));
	}

}
