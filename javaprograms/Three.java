package firstpackage;

import secondpackage.Five;

public class Three
{
public static void main(String[] a)
{
System.out.println("package demo four");
String message = Five.testFile();
System.out.println(message);
}
}