class Task1
{	int count=0;
	void msg()
{
	if(count<=5)
          {
	count ++;
	System.out.println("Recursion");
	msg();
	}
}
public static void main(String ags[])
{
	Task1 tk=new Task1();
	tk.msg();
}
}