package Digits;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=35631; //105457
		int[] octal=new int[400];
		int ind=0;
		while(num>0)
		{
			int rem=num%8;
			octal[ind++]=rem;
			num=num/8;
		}
		for(int i=ind-1;i>=0;i--)
		{
			System.out.print(octal[i]+" ");
		}

	}

}
