import java.util.*;
public class atm
{
public static void main(String[] args)
{
int debit,credit,balance;
balance=100000;
while(true)
{
Scanner sc=new Scanner(System.in);
System.out.println("select option 1 for debit");
System.out.println("select option 2 for credit");
System.out.println("select option 3 for balance");
System.out.println("select option 4 for exit");
System.out.println("select an option:");
int s=sc.nextInt();
switch(s)
{
case 1:
System.out.println("debited amount for transaction:");
debit=sc.nextInt( );
if(debit<=balance)
{
balance=balance-debit;
System.out.println("amount debited sucessfully:");
}
else
{
System.out.println("in sufficient balance");
}
break;
case 2:
System.out.println("enter amount to be credited");
credit=sc.nextInt();
balance=balance+credit;
System.out.println("amount credited sucessfully");
break;
case 3:
System.out.println(balance);
break;
case 4:
System.out.println("transaction completed sucessfully");
System.exit(0);
break;
}
System.out.println("operation completed");
}
}
}
