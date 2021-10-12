import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
	       
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number");
		n = sc.nextInt();
		while(n > 0)
		{
			n = n / 10;
			count = count + 1;
		}
		
		System.out.print(count);
	}

}
