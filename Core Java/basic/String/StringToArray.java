public class StringToArray
{
    public static void main(String[] args)
    {
        String s1="Hello";
        char[] ch=s1.toCharArray();
        System.out.println("Printing Array");
        for(int i=0;i<ch.length;i++){
         System.out.print(" "+ch[i]);
        }
    }
}