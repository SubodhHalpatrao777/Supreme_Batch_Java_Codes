package Arrays;

import java.util.ArrayList;
import java.util.List;

public class StockBuyandSell {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(List.of(100, 180, 260, 310, 40, 535, 695));
		int maxProfit=0;
		int minimum=arr.get(0);
		for(int i=0;i<arr.size();i++)
		{
			if(minimum>arr.get(i))
			{
				minimum=arr.get(i);
			}
			else {
				if((arr.get(i)-minimum)>maxProfit)
				{
					maxProfit=arr.get(i)-minimum;
				}
			}
		}
		System.out.println("maximum profit that user can get is: "+maxProfit);
	}

}
