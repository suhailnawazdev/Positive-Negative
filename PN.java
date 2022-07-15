import java.util.Scanner;

class PN

{

public static void main(String args[])

{

Double num;

System.out.println("Enter the Num");

Scanner s = new Scanner(System.in);

num= s.nextDouble();

if (num < 0.0)

System.out.println("Num is Negative");

else

System.out.println("Num is Positive");

}
}