package Digits;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hexnum=273;
		int n=0;
		int sum=0;
		while(hexnum>0)
		{
			int rem=hexnum%10;
			sum=sum+(rem*(int)(Math.pow(16, n)));
			n++;
			hexnum=hexnum/10;
		}
		System.out.println(sum);

	}

}
