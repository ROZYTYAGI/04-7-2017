
class Box
{
Box()
{
System.out.println("default contructer");
}
Box(int a)
{
int b=a;
System.out.println("this is paramiter constuctor");
System.out.println(b);
}

}
class Domain
{
public static void main(String args[])
{
Box co=new Box();
Box con=new Box(2);
}
}