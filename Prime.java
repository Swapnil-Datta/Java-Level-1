package Hello_Basics;
import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		int i,c=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				c+=1;
			}
		}
		if(c==2) {
			System.out.println("It is Prime!");
		}
		else {
			System.out.println("It is not a Prime Number!");
		}
	}
}
