public class Var_argsParameter
{
    public int add(int... num)//Var-args parameter
    {
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
          sum=sum+num[i];
         } 
         return sum;
    }
    public static void main(String[] args)
    {
        Var_argsParameter mo=new Var_argsParameter();
        int[][] arr={{10,20},{30,40}};
        System.out.println(mo.add(10,20,30));
    }
}