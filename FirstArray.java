import java.util.Scanner;

public class FirstArray
{
   public static void main(String [] args)
   {
     int[] x;
     x = new int[4];

     System.out.println("Index\tValue\n");

     for(int i = 0; i < x.length; i++){
     System.out.println(i+"\t"+x[i]);
     }
   }
}