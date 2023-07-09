public class print
{
    public static void main(String[] args)
    {
        String a="ABCDCABCADCDCADADCAAABDBCCDDCC";
        for(int i=0;i<a.length();i++){
            System.out.println(i+1+" :"+a.charAt(i));
        }
    }
}