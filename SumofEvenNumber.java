import java.util.Scanner;


 public class SumofEvenNumber {
     public static void main(String args[]){
         
         int sum=0;
         int n;
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the number:"); 
            n = sc.nextInt();
         for(int i=1;i<=n;i++)
         {
           if(i%2==0)
           {
               sum= sum+i;              
           }
         }
         System.out.print(sum+ " is the sum of even numbers" );
     }
 }
