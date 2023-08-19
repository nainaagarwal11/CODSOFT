import java.util.*;
class atm
{
public static void main(String [] args)
{
int bal=70000;
int i,j,k,a,b;
Scanner sc=new Scanner(System.in);
System.out.println("AUTOMATED TELLER MACHINE");
System.out.println("choose 1 for WITHDRAW");
System.out.println("choose 2 for DEPOSIT");
System.out.println("choose 3 for CHECK BALANCE");
int choice;
choice=sc.nextInt();
switch(choice)
{
case 1:
{
System.out.println("enter your amount to withdraw");
i=sc.nextInt();
if(i<=bal)
{
a=bal-i;
System.out.println("please take your amount!");
System.out.println("Amount left is " + a);
}
else
{
System.out.println("Not sufficient amount:");
}
break;
}
case 2:
{
System.out.println("enter your amount to deposit");
j=sc.nextInt();
b=j+bal;
System.out.println("Current amount is " +b);
break;
}
case 3:
{
System.out.println("balance is " +bal);
}
break;
}
}
}