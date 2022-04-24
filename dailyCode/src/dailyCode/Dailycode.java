package dailyCode;

import java.util.Scanner;

public class Dailycode {

	public static void main(String[] args) {
		
		System.out.println("Print a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = n;
		int temp;	
		int rev=0;
		while(n>0)
		{
		temp = n%10;
		rev = rev*10+temp;
		n=n/10;
		}
		if(rev==check) {
			System.out.println("Entered number is palindrome");
		}
		else {
			System.out.println("entred number is not palindrome");
		}
	}

}
