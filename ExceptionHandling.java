package Lab;
/*public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		do{
			System.out.println("program to perform division");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no 1: ");
		int a=sc.nextInt();
		System.out.println("enter no 2: ");
		int b=sc.nextInt();
				
		try {
			int result=a/b;
			System.out.println("Result="+result);
			System.out.println("end of try block");
		}
		catch(ArithmeticException e) {
			System.out.println(e+"/ by zero");
		}
		finally {
			System.out.println("finally block content");
			System.out.println("my code is safe from Exception");
		}
		System.out.println("do you want to continue y or n");
		s=sc.next();
	}while(s!="y");

}}*/
import java.util.*;
public class ExceptionHandling
{
public static void main(String[] args) {
char choice='a';
Scanner sc=new Scanner(System.in);
int ch;
do {
System.out.println("Enter your choice\n1.Arithmeticexception\n2.Arrayindexoutofboundsexception") ;
ch=sc.nextInt() ;
switch(ch)
{
  case 1: do
  {
  try {
  int num1,num2,div;
  System.out.print("Enter Number-1:");
  num1=sc.nextInt();
  System.out.print("Enter Number-2:");
  num2=sc.nextInt();
  div=num1/num2;
  System.out.println("Result="+div);
  System.out.println("End of try block");
  }
  catch(ArithmeticException e) {
  System.out.println("java.lang.ArithmeticException: / by zero");
  }
  finally {
  System.out.println("finally block content");
  System.out.println("My code is safe from exception");
  }
  System.out.println("Do you want to continue case 1(y/n)");
  choice=sc.next().charAt(0);
 
  }while(choice=='y'||choice=='Y');
  System.out.println("\n");
  break;
  case 2 : try {
  int n;
  System.out.println("Enter the number of elements you want to store : ");
  n=sc.nextInt();
  int[] a=new int[n];
  System.out.println("Enter the elements of the array : ");
  for(int i=0;i<n;i++)
  {
  a[i]=sc.nextInt();
  }
  System.out.println("Array length : "+n);
  System.out.println("Array elements are : ");
  for(int i=0;i<n;i++)
  {
  System.out.print(" "+a[i]);
  }
 
  System.out.println("\nEnter the position to be accessed : ");
  int pos=sc.nextInt();
  System.out.println("Element in "+pos+" position is "+a[pos-1]);
  }
  catch(ArrayIndexOutOfBoundsException e) {
  System.out.println(e);
  }
  break;
  }
   
System.out.println("Do you want to continue (y/n)");
choice=sc.next().charAt(0);

}while(choice=='y'||choice=='Y');
}
}
