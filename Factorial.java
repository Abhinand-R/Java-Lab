package module1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no:");
		int a= sc.nextInt();
		int i=1,fact=1;
		do
		{
			fact=fact*i;
			i++;
		}while(i<=a);
		System.out.println("fact"+fact);
		

	}

}
