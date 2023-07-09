public class PerformanceStringBufferandString
{
    public static String getString()
    {
        String str="Java";
        for(int i=0;i<1000;i++)
        {
            str=str+"Program";
        }
        return str;
    }
    
    public static String getBuffer()
    {
        StringBuffer str=new StringBuffer("Java");
        for(int i=0;i<1000;i++)
        {
            str.append("Program");
        }
        return str.toString();
    }
    public static void main(String[] args)
    {
        long StartTime=System.currentTimeMillis();
        String strString=getString();
        System.out.println("Time taken by String :"+(System.currentTimeMillis()-StartTime)+" ms. ");
        StartTime=System.currentTimeMillis();
        String strBuffer=getBuffer();
        System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis()-StartTime)+" ms. ");

    }
}