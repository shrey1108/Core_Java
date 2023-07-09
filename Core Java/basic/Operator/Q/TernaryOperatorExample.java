public class TernaryOperatorExample
{
    public static void main(String[] args)
    {
        int a=1;
        int b=2;
        int c=3;
        int temp=(a>b)?a:b;
        int largest=(temp>c)?temp:c;
        System.out.println(largest);
            }
}