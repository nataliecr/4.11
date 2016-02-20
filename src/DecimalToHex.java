import java.util.Scanner;

public class DecimalToHex {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal value (0 to 15): ");
    int decimal = input.nextInt();
    
    if (decimal > 15)
      System.out.println(decimal + " is an invalid input");
    else
      System.out.println("The hex value is " + 
            Integer.toHexString(decimal).toUpperCase());
  } // main   
} // DecimalToHex
