import java.util.Scanner;
 
public class ReverseNumber
{
   public static void main(String args[])
   {
      int n,i,j,temp;
      int[] numbers = new int[100];
      System.out.println("Enter number limit:");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      for(i=0;i<n;i++){
        System.out.println("Enter number:");
        numbers[i] = in.nextInt();
      }

      for(i = 0; i < n; i++){
          for(j = 0; j < n; j++){
              if(numbers[i] > numbers[j]){
                  temp = numbers[i];
                  numbers[i] = numbers[j];
                  numbers[j] = temp;
              }
          }    
      }    

      System.out.println("Reverse order numbers:");
      for(i = 0; i < n; i++){
        System.out.println(numbers[i]);
      }
   }
}
