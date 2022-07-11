import java.util.Scanner;

public class semavg
{
 public static void main(String[] args)
 {
  System.out.println("How Many Semester do you have in this year..?");
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();

  double[] sem = new double[x];
  double sum = 0;
  double Percentage ;
  for ( int i = 0; i < sem.length;i++)
  {
   System.out.print("Enter your Percentage of Semester " +(i+1)+" : ");
   sem[i] = scan.nextInt();

  }
  for ( int i = 0; i < sem.length;i++)
  {
   sum = sum + sem[i];
  }
  for ( int i = 1; i < x; i++)
  {
   Percentage = sum / sem.length;
   System.out.println(" ");
   System.out.println("Your final Percentage of " +(i+1)+ " Semester is : " +Percentage );
  }
 }
}
