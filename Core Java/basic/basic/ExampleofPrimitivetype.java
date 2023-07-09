public class ExampleofPrimitivetype
{
    public static void main(String[] args)
    {
        short s =100; //short is primitive
        System.out.println("Size of short data type is:"+(Short.SIZE/8));///8 for byte showing (1byte=8)
        System.out.println("short s:"+s);

        byte b=9; //byte 
        System.out.println("Size of byte is:"+(Byte.SIZE/8));
        System.out.println("byte b:"+b);

        int i=10; //integer
        System.out.println("Size of integer is:"+(Integer.SIZE/8));
        System.out.println("int i:"+i);

        long l=8989; //long
        System.out.println("Size of long is:"+(Long.SIZE/8));
        System.out.println("int l:"+l);

        float f=4500.00f; //Float
        System.out.println("Size of Float is:"+(Float.SIZE/8));
        System.out.println("Float f:"+f);

        double d=4500.00; //double  no need of f 
        System.out.println("Size of double is:"+(Double.SIZE/8));
        System.out.println("double d:"+d);

        char c='A'; //character
        System.out.println("Size of character is:"+(Character.SIZE/8));
        System.out.println("Character c:"+c);

        boolean bo =true; //boolean
        //System.out.println("Size of boolean is:"+(Boolean.SIZE/8)); //size of boolean is not there
        System.out.println("boolean b:"+bo);
    }
}