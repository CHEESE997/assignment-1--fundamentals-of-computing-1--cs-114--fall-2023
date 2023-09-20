// Import libraries here
import java.util.Scanner;
// Nguyen-Long Phan

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    System.out.println("NNN       NNN   PPPPPPPPP");
    System.out.println("NNNN      NNN   PPP    PPP");
    System.out.println("NNNNN     NNN   PPP     PPP");
    System.out.println("NNNNNN    NNN   PPP    PPP");
    System.out.println("NNN NNN   NNN   PPPPPPPP");
    System.out.println("NNN  NNN  NNN   PPP");
    System.out.println("NNN   NNN NNN   PPP");
    System.out.println("NNN    NNNNNN   PPP");
    System.out.println("NNN     NNNNN   PPP");
    System.out.println("NNN      NNNN   PPP");

    int fahrenheit;

    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter a number in Fahrenheit");
    fahrenheit = Scan.nextInt();
    int celsius = (fahrenheit-32)*5/9;
    System.out.println(celsius + " Degrees Celsius");
    System.out.println();

    System.out.println("Please enter a 5 character string: ");
    String mutate = Scan.next();
    mutate = mutate.substring(1, mutate.length() - 1);
    int iStrLength=mutate.length();
    System.out.println("your word is");
    while(iStrLength >0){
      System.out.print(mutate.charAt(iStrLength -1));
      iStrLength--;}

    System.out.println();
    Double number;
    int max = 16384;
    int min = 32;
    number = Math.floor((Math.random() * (max - min +1) + (min)));
    System.out.print("Your random number is: ");
    System.out.println(number);

    System.out.print((celsius) + (mutate) + (number));
    Scan.close();

  }
}
