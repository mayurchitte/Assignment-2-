import java.util.Scanner;
public class SwapNo {
    public static void main(String[] args) {
         int no, swapedNO;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a 4 digit no");
         no = sc.nextInt();

         swapedNO = ((no%100)*100)+(no/100);
         System.out.println(no);
         System.out.println(swapedNO);
        
 



  }
}