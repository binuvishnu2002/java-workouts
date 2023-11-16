class VishAnu
{
    void kingVis()
    {
    char c='B';
    String str=String.valueOf(c);
    String firstname ="vishnu";
    char fn=firstname.charAt(0);
    System.out.println(str);
    System.out.println(fn);
    }
void queen()
{
	StringBuilder sb=new StringBuilder("vishnu anu");
 	System.out.println(sb.reverse());
}
void kuttyKing()
{
	String name="vishnu loves anu";
	System.out.println(name.replace(" ",""));
}
   public static void main (String arg[])
   {
    VishZnu vh=new VishZnu();
    vh.kingVis();
    vh.queen();
    vh.kuttyKing();
   }
}
 