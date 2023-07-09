public class UnaryOperator
{
    public static void main(String[] args)
    {
        int x=10;
        ++x;//pre-increment
        x++;//post-increment

        int sum=3;
        int num=5;

        sum=num++;
        sum=++num;

        //sum=num++ => 
        // sum=num;
        // num=num+1;

        //sum=++num;
        // num=num+1;//then
        // sum=num;

        System.out.println("Sum : "+sum);
        System.out.println("Num : "+num);

        int y= ~5; //negamation    (-5+-1)
        System.out.println("negamation :"+y);

        int z= ~-10; //negamation    (10+-1)
        System.out.println("negamation :"+z);

        //cannot assign this way not operator
                 // int a=!10; 
               // System.out.println("!10 :"+a);

        boolean st=true;
         System.out.println("not operator :"+!st);
    }
}
