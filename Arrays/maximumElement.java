package Arrays;

public class maximumElement {

	public static void main(String[] args) {
		int maximum=Integer.MIN_VALUE;
		
		int arr[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maximum)
			{
				maximum=arr[i];
			}
			
		}
		System.out.println("maximum number is: "+maximum);

	}

}
