import java.util.Scanner;
public class IT24102769Lab5Q2
{
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in); 
    int num;
    
    System.out.println("Enter the number of new members introduced:");
    num=input.nextInt();

    if(num>=0)
     {
       switch(num)
        {
         case 0:System.out.print("No prize");
           break;
         case 1:System.out.print("Prize is a:Pen");
           break;
         case 2:System.out.print("Prize is a:Umbrella");
           break;
         case 3:System.out.print("Prize is a:Bag");
           break;
         case 4:System.out.print("Prize is a:Travelling Chair");
           break;
         default:System.out.print("Prize is a:Headphone");
        }
     }
    else
     {
      System.out.print("Input must be a number 0 or greater");
     }
   }
}