interface Message
{
    int sum(int a, int b);
}
public class MessageDemo{
    public static void main(String args[])
    {
        Message msg = (a,b) -> (a+b);
        System.out.println("sum is :" +msg.sum(10,40));
    }
}
