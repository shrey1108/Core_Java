public class TrickyQuestionOnPrimitiveDatatype
{
    public static void main(String[] args)
    {
        byte b1=1;
        byte b2=2;
        // byte b3=b1+b2;//this in q // change because by default integer which we have to define byte
        byte b3=(byte)(b1+b2);
        System.out.println("Result of b1+b2:"+b3); //error 

        float f1=20.5f;
        float f2=19.5f;
        float f3=f1+f2;
        System.out.println("Result is f1+f2 : "+f3);

        float num=0.7f;
        if(num==0.7){
            System.out.println("equal");

        }else{
            System.out.println("not equal");
        }

        char alpha='A';
        alpha=(char)(alpha+1);
        System.out.println(alpha);
    }
}