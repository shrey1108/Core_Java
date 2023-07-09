final class ImutableExample
{
    final String adharNo;
    public ImutableExample(String adharNo){
        this.adharNo=adharNo;
    }
    public String getAdhar()
    {
        return adharNo;
    }
}
public class Imutable
{
    public static void main(String[] args)
    {
     ImutableExample im=new ImutableExample("100000");
     String adharno=im.getAdhar();
     System.out.println("Adhar Number : "+adharno);
    }
}