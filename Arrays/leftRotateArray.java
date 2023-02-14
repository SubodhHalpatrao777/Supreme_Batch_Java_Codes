package Arrays;

import java.util.ArrayList;
import java.util.List;

public class leftRotateArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
		
		System.out.println("Array before rotation: "+arr);
		
		int element=arr.remove(0);
		arr.add(element);
		
		System.out.println("Array after rotation: "+arr);
	}

}
