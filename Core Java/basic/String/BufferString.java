public class BufferString
{
    public static void main(String[] args)
    {
        StringBuffer buffers=new StringBuffer();
        buffers.append("moon ");
        buffers.append("shrey ");
        buffers.append("nazish ");
        buffers.append("shaan ");

        buffers.insert(5,"gaurav ");

        int length=buffers.length();

        System.out.println("The length is :"+length);

        buffers.insert(length-1," Shubhayu");
        System.out.println(buffers);
        buffers.reverse();
        System.out.println(buffers);

    }
}