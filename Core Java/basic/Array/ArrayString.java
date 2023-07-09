import java.util.*;
public class ArrayString
{
    public static void main(String[] args){
        String[] arr=new String[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter your name");
            arr[i]=input.nextLine();
        }
        for(int j=0;j<5;j++){
            System.out.print(arr[j]);
        }
    }
}