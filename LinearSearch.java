import java.util.Scanner;

public class LinearSearch
{
   public static void main(String[] args)
   {
      int i, pos=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Size of Array: ");
      int n = s.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " +n+" Elements: ");
      for(i=0; i<n; i++)
         arr[i] = s.nextInt();
      
      System.out.print("Enter an Element to Search: ");
      int num = s.nextInt();
      
      for(i=0; i<n; i++)
      {
         if(num==arr[i])
         {
            pos = i+1;
            break;
         }
      }
      if(pos==0)
         System.out.println("\nThe element not found!");
      else
         System.out.println("\nThe element found at position: " +pos);
   }
}