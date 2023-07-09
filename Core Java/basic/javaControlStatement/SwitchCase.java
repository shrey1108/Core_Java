public class SwitchCase
{
    public static void main(String[] args)
    {
    float f=1.7f; // float value is not acceptable only fixed values are allowed
    int i=7;
    char garde ='B';
    switch(garde)
    {
        case 'B': System.out.println("1.7"); break;//break is used to exit or stop printing the below statement
        case 8: System.out.println("2.7"); break;
        default: System.out.println("invalid data");
    }
    }
}