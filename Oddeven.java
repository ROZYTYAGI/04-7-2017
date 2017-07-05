public class Oddeven
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
if(n%2!=0)
{
for(int i=0;i<=n;i++)
{

if(i%2!=0)
System.out.println(i);
}
}
if(n%2==0)
{
for(int i=0;i<=n;i++)
{

if(i%2==0)
System.out.println(i);
}
}
}
}