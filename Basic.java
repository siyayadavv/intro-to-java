import java.util.Scanner;
class Basic{
    public static void main (String args[])
{
Scanner scan=new Scanner (System.in);
int a;
int b;
int c;
int result=0;
System.out.print("enter no's and choice");
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
if (c==1)
  result=a+b;
else if (c==2)
  result=a-b;
else if(c==3)
  result=a*b;
else if(c==4)
  result=a/b;
else if(c==5)
  result=a%b;
else
  System.out.print("not valid");
System.out.print(result);
System.out.print("\nSIYA YADAV 24CSU202");
}
}