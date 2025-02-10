//WAP to check the age is greater than 18 or not
import java.util.Scanner; 
class AgeProgram
{
public static void main(String[] a)
{
int age=15;
Scanner scanner = new Scanner(System.in);
System.out.println("enter the age");
age=scanner.nextInt();
boolean status = age>18;//15>18
System.out.println(status);
}
}