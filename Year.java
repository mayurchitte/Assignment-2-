import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
     int days, year, month, week, day;
     days = sc.nextInt();
     System.out.println("days :");

    year = days/365;
   
    days = days%365;
  
    month = days/30;

    days = days%30;

    week  = days/7;
    
   days = days%7;


   System.out.println("year:" + year + "month:"+ month + "week:"+ week + "days:" + days);

   }
}
