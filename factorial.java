import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int i,n,f=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextint();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(+n+f);
}
}