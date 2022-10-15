package Digits;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=289;   //121
		char[] hex= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] hex1=new char[40];
		int ind=0;
		while(num>0)
		{
			int rem=num%16;
			hex1[ind++]=hex[rem];
			num=num/16;
		}
		for (int i = ind-1; i >=0; i--)
		{
			System.out.print(hex1[i]);
		}

	}

}
