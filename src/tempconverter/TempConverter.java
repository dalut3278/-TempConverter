/*
* David Lutelmowski
* 3/01/19
* TempConverter
*/
package tempconverter;
import java.util.Scanner;
 /**
 * Performs a temperature conversion.
 */
               public class TempConverter {

               public static double fahrenheitToCelsius(double temp) {
               double cTemp;
               cTemp = (double)5/(double)9*(temp - 32); 
               return cTemp;
               }
             
               public static double celsiusToFahrenheit(double temp) {
               double fTemp;
               fTemp = (double)9/(double)5*temp + 32;
               return fTemp;
               }
               
               public static void main(String[] args) {
               int choice;
               double temp;
               Scanner input = new Scanner(System.in);

               /* Prompt user for type of conversion */
               System.out.println("1. Fahrenheit to Celsius conversion.");
               System.out.println("2. Celsius to Fahrenheit conversion.");
               System.out.print("Enter your choice: ");
               choice = input.nextInt();
               System.out.print("Enter your temp: ");
               temp = input.nextDouble();
               if (choice == 1) {
                    System.out.println("The temperature is "+ fahrenheitToCelsius(temp) + " Degrees Celsius");
               } else if (choice == 2) {
                    System.out.println("The temperature is "+ celsiusToFahrenheit(temp) + " Degrees Fahrenheit");
               }
               input.close();           
            }
        }
 
    
 
