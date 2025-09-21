import java.util.Scanner;
class Reverse{
    public static void main (String args[])
{
Scanner scan=new Scanner (System.in);
int a;
int hun;
int ten;
int one;
int reverse;
int sum=0;
System.out.print("enter no");
a=scan.nextInt();
hun=a/100;
ten=(a/10)%10;
one=a%10;
reverse= one*100+ten*10+hun;
System.out.print("Reverse is "+reverse);
sum=hun+ten+one;
System.out.print("sum is "+sum);
System.out.print("\nSIYA YADAV 24CSU202");

}
}
