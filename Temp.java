import java.util.Scanner;
class Temp{
    public static void main (String args[])
{
Scanner scan=new Scanner (System.in);
int a;
char unit;
int tempnew;
System.out.print("enter temp unit F or C");
unit = scan.next().charAt(0);
System.out.print("enter temp");
a=scan.nextInt();
if (unit=='F'){
    tempnew=(a-32)*5/9;
    System.out.print("Given temperature in Celsius is"+tempnew);
}
else if(unit=='C'){
    tempnew=(a*9/5)+32;
    System.out.print("Given temperature in Fahrenheit is"+tempnew);
}
else{
    System.out.print("Error");
System.out.print("\nSIYA YADAV 24CSU202");
}
}
}