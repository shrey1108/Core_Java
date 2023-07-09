public class BuilderString
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("shrey ");
        sb.append("shaan ");
        sb.append("moon ");
        sb.append("yaman ");
         System.out.println(sb);

         String w=String.valueOf(sb);
         System.out.println(w);
         String words=sb.toString();
         System.out.println(words);

         sb.reverse();
         System.out.println(sb);

         sb.delete(0,12);
         System.out.println(sb);

         System.out.println(words.contains("moon"));
    }
}