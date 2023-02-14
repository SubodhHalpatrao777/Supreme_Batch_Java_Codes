package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreePairSum {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(List.of(10,20,30,40,60,70));
		ArrayList<Integer> ans=new ArrayList<>();
		
		int sum=90;
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				for(int k=j+1;k<a.size();k++)
				{
					if(a.get(i)+a.get(j)+a.get(k)==sum)
					{
						System.out.println("pair forming given sum: ("+a.get(i)+","+a.get(j)+","+a.get(k)+")");
					}
				}
			}
		}

	}

}
