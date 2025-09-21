import java.util.Scanner;
class Min {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int min;
int minday;
int minmonth;
int minyear;
int years;
int months;
int days;
System.out.print("Enter time in minutes: ");
min=scanner.nextInt();
minday=1440;
minmonth=43200;
minyear=518400;
years=min/minyear;
min%=minyear;
months=min/minmonth;
min%=minmonth;
days=min/minday;
System.out.println("The entered minutes are equivalent to: " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
System.out.println("SIYA YADAV 24CSU202");
}
}