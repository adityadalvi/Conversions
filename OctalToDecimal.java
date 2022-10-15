package Digits;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=444;//292
		int n=0;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(rem*((int)Math.pow(8, n)));
			n++;
			num=num/10;
		}
		System.out.println(sum);

	}

}
