class odd
{
	void vish()
	{
	int a=30;
	for(a=0;a<=30;a++)
{ 
	if(a%2==0){
	System.out.println("even;"+a);
	}
else
	{ 
	System.out.println("odd;"+a);
	}
}
	}
public static void main(String args[])
{
	odd od=new odd();
	od.vish();
}
}