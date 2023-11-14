/**Author:Abhinand R
   S3,CSE-A,004
   Program to find product of 2 matricespackage Abhinand;**/
package Lab;
import java.util.*;
/*public class MatrixMultiplication {
	public static void main(String[] args) {
		char con;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTR ROWS AND COLUMS OF FIRST MATRIX");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("ENTER FIRST MATRIX");
		int [][] firstm= new int[50][50];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
				firstm[i][j]=sc.nextInt();
		}
		System.out.println("ENTER ROWS AND COLUMS OF SECOND MATRIX");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		System.out.println("ENTER SECOND MATRIX");
		int [][] secondm= new int[50][50];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
				secondm[i][j]=sc.nextInt();
		}
		int [][] prodm= new int[50][50];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
				prodm[i][j]=0;
		}
		if(c1==r2)		
		{
			System.out.println("PRODUCT MATRIX");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<r2;k++)
						prodm[i][j]=prodm[i][j]+(firstm[i][k]*secondm[k][j]);
					System.out.print(prodm[i][j]+" ");
				}
				System.out.println("\n");
			}
		}
		else
			System.out.println("MULTIPLICATION NOT POSSIBLE");
		System.out.println("do u want to continue?(y/n)");
		con=sc.next().charAt(0);
		}while(con=='y'||con=='Y');
	}
}*/













//package TestProgram;
//import java.util.Scanner;
public class MatrixMultiplication {
public static void main(String args[]) {
char choice;
do {
int row1,row2,column1,column2,i,j,k;
;
Scanner s=new Scanner(System.in);
System.out.println("Enter the rows of A:");
row1=s.nextInt();
System.out.println("Enter the columns of A:"); 
column1=s.nextInt();
System.out.println("Enter the rows of B:");
row2=s.nextInt();
System.out.println("Enter the columns of B:");
column2=s.nextInt();
int[][]matrixA=new int[row1][column1];
if (row2==column1) {
System.out.println("enter the elements of matrix A");
for( i=0;i<row1;i++)
{
for(j=0;j<column1;j++)
{
matrixA[i][j]=s.nextInt();
}
}

int[][]matrixB=new int[row2][column2];
System.out.println("enter the elements of matrix B");
for( i=0;i<row2;i++)
{
for(j=0;j<column2;j++)
{
matrixB[i][j]=s.nextInt();
}
}
int[][]matrixC=new int[row1][column2];
if(column1==row2)
{System.out.println("matrix output");
for(i=0;i<row1;i++)
{
for(j=0;j<column2;j++)
{
for(k=0;k<row1;k++) {
matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
}
System.out.print(matrixC[i][j]+"  ");
}
System.out.print("\n");
}
}}
else
{
System.out.println("matrix multiplication is not possible");}
System.out.println("do u want to continue?(y/n)");
choice=s.next().charAt(0);
}while(choice=='y'||choice=='Y');




}}
