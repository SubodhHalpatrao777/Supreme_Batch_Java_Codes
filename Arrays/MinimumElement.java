package Arrays;

public class MinimumElement {

	public static void main(String[] args) {
		int minimum=Integer.MAX_VALUE;
		
		int arr[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minimum)
			{
				minimum=arr[i];
			}
			
		}
		System.out.println("minimum number is: "+minimum);



	}

}
