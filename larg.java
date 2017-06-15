import java.util.Scanner;

class larg
{
public static void main(String[] args) 
{
int largest;
Scanner s=new Scanner(System.in);
System.out.println("Enter any three numbers: ");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();

if(a>=b && a>=c) 
{
System.out.println("Largest number: "+a);
}
if(b>=a && b>=c) 
{
System.out.println("Largest number: "+b);
}
if(c>=a && c>=b) 
{
System.out.println("Largest number: "+c);
}
}
}
