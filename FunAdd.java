public class FunAdd
{
int c;
public int sum(int a,int b)
{
int c=a+b;
return c;
}
public void display()
{
System.out.println("the sum of given is"+c);
}
public static void main(String[] args)
{
FunAdd fa=new FunAdd();
fa.sum(34,5);
fa.display();
}
}