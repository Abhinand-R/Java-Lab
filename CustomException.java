package Lab;

import java.util.Scanner;
class Account {
int AccountNo;
String Accountname,Accounttype;
double balance;
Scanner sc=new Scanner(System.in);
void showaccount()
{
System.out.println("Account No : "+AccountNo);
System.out.println("Name : "+Accountname);
System.out.println("Type of Account : "+Accounttype);
System.out.println("Balance : "+balance);
}
void openaccount()
{
System.out.println("Enter account details : ");
System.out.println("Enter  Name : ");
Accountname=sc.next();
System.out.println("Enter  Account no : ");
AccountNo=sc.nextInt();
System.out.println("Enter type of the account : ");
Accounttype=sc.next();
System.out.println("Enter balance : ");
balance=sc.nextDouble();
}
int SearchAccount(int num)
{
if(AccountNo==num)
{
return 1;
}
else
return 0;
}
void DepositAmount()
{
try
{
System.out.println("Enter the amount to be deposited : ");
double amount=sc.nextDouble();
if(amount<=0)
{
throw new InvalidAmountException("Amount should be greater than zero!!!!");
}
balance=balance+amount;
System.out.println(amount+" deposited");
System.out.println("Updated Balance : "+balance);
}
catch(InvalidAmountException e)
{
System.out.println("InvalidAmountException: "+e.getmessage());
}
}
void WithdrawAmount()
{
try
{
System.out.println("Enter the amount to withdraw : ");
double amount=sc.nextDouble();
if(amount>balance)
{
throw new InsufficientFundsException("Amount greater than Balance!!!");
}
if(amount<=0)
{
throw new InvalidAmountException("Amount should be greater than zero!!!!");
}
balance=balance-amount;
System.out.println(amount+" withdrawn");
System.out.println("Updated Balance : "+balance);
}
catch(InvalidAmountException e)
{
System.out.println("InvalidAmountException : "+e.getmessage());
}
catch(InsufficientFundsException e)
{
System.out.println("InsufficientFundsException : "+e.getmessage());
}
}
}
public class CustomException {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int choice,num,i,n,flag=0;
System.out.println("Enter the Number of Accounts : ");
n=sc.nextInt();
Account[] a=new Account[n];
for(i=0;i<n;i++)
{
a[i]=new Account();
}
while(true)
{
System.out.println("\nEnter your choice : \n1.Create an acct\n2.Display all acct details\n3.Search by acct no\n4.Deposit\n5.Withdraw\n6.exit");
choice=sc.nextInt();
switch(choice)
{
case 1 : for(i=0;i<n;i++)
{
a[i].openaccount();
}
break;
case 2 :for(i=0;i<n;i++)
{
a[i].showaccount();
}
break;
case 3 :System.out.println("Enter the account number to be searched : ");
num=sc.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].SearchAccount(num)==1)
{
System.out.println("Account is Valid");
flag=1;
a[i].showaccount();
break;
}
}
if(flag==0)
System.out.println("Invalid AccountNumber!!!");
break;
case 4 :System.out.println("Enter the Account number : ");
num=sc.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].AccountNo==num)
{
System.out.println("Account is Valid");
flag=1;
a[i].showaccount();
a[i].DepositAmount();
break;
}
}
if(flag==0)
{
System.out.println("Invalid AccountNumber!!!");
}
break;
case 5 :System.out.println("Enter the Account number : ");
num=sc.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].AccountNo==num)
{
System.out.println("Account is Valid");
flag=1;
a[i].showaccount();
a[i].WithdrawAmount();
break;
}
}
if(flag==0)
{
System.out.println("Invalid AccountNumber!!!");
}
break;
case 6 : System.exit(0);
break;
default : System.out.println("Wrong choice!!!");
break;
}
}
}
}

