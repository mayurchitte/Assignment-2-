import java.util.Scanner;
public class TimeSecond {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         
         System.out.print("Input seconds: ");
         int seconds = sc.nextInt();

         int S = seconds % 60; 
         int M = seconds / 60; 

         

                 
         
         System.out.print( M + ":" + (S/10) + (S%10));
         
      
    

 }
}