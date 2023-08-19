import java.util.*;
class task1
{
public static void main(String [] args)
{
int i,g,n;                                  //g is guess number
Scanner s1=new Scanner(System.in);
System.out.println("HELLO,WELCOME TO THE NUMBER GAME");
System.out.println("you will be given only three choices only to guess the exact number");
System.out.println("ARE YOU READY!");
n=1+(int)(100*Math.random());
for(i=1;i<4;i++)
{
System.out.println("start guessing the number:");
g=s1.nextInt();
if(n==g)
{
System.out.println("YOU WIN");
break;
}
else if(n>g)
{
System.out.println("oops your number is higher than your guessed number:");
}
else if(g>n)
{
System.out.println("oops your number is lower than your guessed number:");
}
}
 if(i==4)
{
System.out.println("SORRY! YOU LOOSE");
System.out.println("the number was:" +n);
}
}
}