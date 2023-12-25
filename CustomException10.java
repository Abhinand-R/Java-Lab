package Lab;

import java.util.*;
class Bank{
Long accNo;
String name,accType;
double balance,withdraw;

void openAccount(String name,Long accNo,String accType,double balance) {
this.name=name;
this.accNo=accNo;
this.accType=accType;
this.balance=balance;
}

void showAccount(Long accNo) {
if(this.accNo.equals(accNo)) {

System.out.println("\nAccount Number : "+this.accNo+"\nName : "+name+"\nAccount Type : "+accType+"\nBalance : "+balance);
}
else {
System.out.println("\nAccount Not Found");
}
}


void deposit(double amount) {
balance = balance +amount;
System.out.println("An amount of "+amount+" Rs has been Credited to your Account.");
}

void withdrawal(double withdraw) {
balance=balance-withdraw;
System.out.println("An amount of "+withdraw+" Rs has been Debited from your Account.\nAvailable Balance="+balance);


}
}


public class CustomException10 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Bank b=new Bank();
char choice='a';
do {
System.out.println("Enter your choice\n1.open acct\n2.show acct\n3.deposit\n4.withdrawal") ;
int ch=sc.nextInt() ;
switch(ch)
{
 case 1:
 System.out.println("enter acct name:");
 String name=sc.next();
 System.out.println("enter acct no:");
 Long accno=sc.nextLong();
 System.out.println("enter acct type");
 String accType=sc.next();
 b.openAccount(name, accno, accType, ch);
 break;
 case 2:
 System.out.println("enter search acct nbr");
 Long accno1=sc.nextLong();
 b.showAccount(accno1);
 break;
 case 3:
 System.out.println("enter deposit ammount");
 double dep=sc.nextDouble();
 b.deposit(dep);
 break;
 case 4:
 System.out.println("enter withdrwal amount");
 double with=sc.nextDouble();
 b.withdrawal(with);
 break;
 
 
 
}
System.out.println("Do you want to continue (y/n)");
choice=sc.next().charAt(0);

}while(choice=='y'||choice=='Y');
}

}