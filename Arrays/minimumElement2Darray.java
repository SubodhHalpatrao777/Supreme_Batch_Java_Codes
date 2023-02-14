package Arrays;

public class minimumElement2Darray {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int minimum=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]<minimum)
				{
					minimum=arr[i][j];
				}
			}	
		}
		
		System.out.println("Minimum Element is: "+minimum);
		
		

	}

}
