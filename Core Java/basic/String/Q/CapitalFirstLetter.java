import java.util.*;
public class CapitalFirstLetter
{
    public static void main(String[] args)
    {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter your Sentence");
     String s=input.nextLine();
     

    String[] str=s.split(" ");
    String allwords="";

    for(String w:str){
     String s1=(w.substring(0,1).toUpperCase()+w.substring(1)+" ");
     allwords+=s1; 
    }
    System.out.println(allwords);
        }
      }
    
