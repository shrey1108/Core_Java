import java.util.*;
public class AssigningArray
{
    public static void main(String[] args)
    {
     int [] arr=new int[5];
     for(int i=0;i<5;i++){
        Scanner input=new Scanner(System.in);
        System.out.println(i+1+" number ");
        arr[i]=input.nextInt();
     }
     for(int j=0;j<5;j++){
        System.out.print(arr[j]+" , ");
     }

    }
}