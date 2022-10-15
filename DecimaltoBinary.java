package Digits;

public class DecimaltoBinary 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Deci=new int[40];
		int num=10;
		int ind=0;
		while(num>0)
		{
			int rem=num%2;
			Deci[ind++]=rem;
			num=num/2;
		}
		for (int i = ind-1; i >=0; i--)
		{
			System.out.print(Deci[i]);
		}
			
		

	}

}
