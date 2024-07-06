abstract class Demo
{
int x,y;
void disp()
{
System.out.println("Normal method of demo class is invoked");
}
abstract void calc(int a, int b);
}
class Data extends Demo
{
public void calc(int a ,int b)
{
x=a;
y=b;
System.out.println("Addition "+(x+y));
}
}
class Abatract_Example
{
public static void main(String args[])
{
Data obj=new Data();
obj.disp();
obj.calc(41,46);
}
}