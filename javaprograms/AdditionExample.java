import java.util.Scanner;//#include<stdio.h>
class AdditionExample
{
static int addition(int num1,int num2)
{
return num1+num2;
}
public static void main(String[] a)
{
Scanner scanner = new  Scanner(System.in);
int res = addition(scanner.nextInt(),scanner.nextInt());

System.out.println(res);

int res2=addition(scanner.nextInt(),scanner.nextInt());
System.out.println(res2);
int res3 = addition(scanner.nextInt(),scanner.nextInt());
System.out.println(res3);
}
}









