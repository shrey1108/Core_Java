import java.util.*;
public class FindAgeYearFromDOB
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        SimpleDateFormat sdf=new SimpleDateFormat("MM-DD-YYYY HH:MM:SS");

        System.out.println("Enter you Date of Birth :");
        String dob=input.nextLine();
        long d=System.currentTimeMillis();
        java.util.Date todaydate=new java.util.Date(d);
        
        Date date1=sdf.parse(todaydate);
        Date date2=sdf.parse(Date.valueOf(dob));

        long difference=date1.getTime()-date2.getTime();

        int year=(difference/60*60*24)%365;

        System.out.println("Your are "+year+"old");
    }
}