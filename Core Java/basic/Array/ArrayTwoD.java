import java.util.*;
public class ArrayTwoD
{
    public static void main(String[] args)
    {
        int [][] arr=new int[2][3];
        // arr[0][0]=50;
        // arr[0][1]=20;
        // arr[0][2]=100;

        // //row 2
        // arr[1][0]=40;
        // arr[1][1]=60;
        // arr[1][2]=100;
        Scanner input=new Scanner(System.in);

        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.println("Enter element for : arr["+row+"]["+col+"]");
                 arr[row][col]=input.nextInt();
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
                if(j!=2)System.out.print(" , ");
            }
            System.out.println();
        }

    }
}