class fact
{
 	void count()
{
	int i,fact=1;
	int number=5;
	for(i=1;i<=number;i++){
	fact=i*fact;
	}
System.out.println("factorial of"+number+"is"+fact);
}
public static void main(String args[])
	{
	fact ft=new fact();
	ft.count();
	}
}