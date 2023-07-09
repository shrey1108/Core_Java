public class BitwiseOperator
{
    public static void main(String[] args)
    {
        //OR "|"
        System.out.println("5|6 :"+(5|6)); //7
           
        //AND "&"   
        System.out.println("AND 4&5 :"+(4&5)); //4

        // "<<"  (shortcut -> <<=2 and afterone on power is multiply with first )
         System.out.println("4<<2 :"+(4<<2)); // 4*2^2 =16

        // ">>"  (shortcut -> >>=2 and afterone on power is divided with first )
         System.out.println("4>>2 :"+(4>>2)); // 4/2^2 =1 

         // "^"  
         System.out.println("4^5 :"+(4^5)); // 4^5 =1
    }
}