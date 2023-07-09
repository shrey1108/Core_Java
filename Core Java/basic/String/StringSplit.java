public class StringSplit
{
    public static void main(String[] args)
    {
        String s1="Hello, i am glad";
        String[] words=s1.split(" ");
        System.out.println("Printing words");
        for(int i=0;i<words.length;i++){
        System.out.println(words[i]);

        }
    }
}