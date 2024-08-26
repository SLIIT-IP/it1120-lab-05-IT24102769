import java.util.Scanner;
public class IT24102769Lab5Q3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int Sdate,Edate,NOdate;
    double Amount1,Amount2,Amount3;
    double Amount= 48000;
    double Dis01 = 0.10;
    double Dis02 = 0.20;

    System.out.println("Enter Start Date(1-31):");
    Sdate = sc.nextInt();

    System.out.println("Enter End Date(1-31):");
    Edate = sc.nextInt();
 
    if(Sdate>=0 && Sdate<=31 && Edate>=0 && Edate<=31)
    {
        if(Sdate<Edate)
        {
             System.out.println("Room Charge Per Day:Rs."+Amount+"/=");
             NOdate=Edate-Sdate;
             System.out.println("Number of Days Reserved: "+NOdate);
             Amount1=Amount*NOdate;
     
                     if(NOdate<3)
                     {
                       System.out.println("Total Amount to be paid:"+Amount1);
                     }
                     else if (NOdate<=4)
                      {
                        Amount2=Amount1-(Amount1*Dis01);
                        System.out.println("Total Amount to be paid:"+Amount2);
                      }
                     else
                      {
                       Amount3=Amount1-(Amount1*Dis02);
                       System.out.println("Total Amount to be paid: "+Amount3);
         }             }
       else
        {
          System.out.println("Error: Start date must be less than End date");
        }
     }
    else
    {
     System.out.println("Error: Dats must be between 1 & 31");
    }
  }
}