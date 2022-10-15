package Digits;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=111111;
		int sum=0;
		int n=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem==1)
			{
			sum=sum+((int)(Math.pow(2,n)));
			}
			n++;
			num=num/10;
		}
		System.out.println(sum);


	}

}
