import java.util.Scanner;
public class programtask {
   

   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = input.nextInt();
      
      // Reverse the number
      int rev = 0;
      int temp = num;
      while (temp != 0)
      {
         int digit = temp % 10;
         rev = rev * 10 + digit;
         temp /= 10;
      }
      
      // Check if the number is palindrome
      if (num == rev)
      {
         System.out.println(num + " is a palindrome number.");
      } 
      else
         System.out.println(num + " is not a palindrome number.");
   }
}
    

