import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double celsius, fahrenheit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the temperature \n either in Celsius or Fahrenheit");
        double temperature =keyboard.nextDouble();
        System.out.println("please enter first letter for celsius or fahrenheit");
        char first = keyboard.next().charAt(0);
        String symbol = Character.toString(first);
        if(symbol.equalsIgnoreCase("c"))
        {
            System.out.println("you entered the temperature in celsius");
            System.out.println("this program will convert your temperature to fahrenheit");
            fahrenheit = (((9*temperature)/5)+32);
            System.out.println("your celsius temperature was: " +temperature);
            System.out.println("Now in Fahrenheit the temperature is: " +fahrenheit);

        }
        else if (symbol.equalsIgnoreCase("f"))
        {
            System.out.println("you entered the temperature in Fahrenheit");
            System.out.println("This program will convert your fahrenheit temperature to celsius");
            celsius =((5*(temperature -32))/9);
            System.out.println("your Fahrenheit temperature was: " +temperature);
            System.out.println("Now in Celsius the temperature is: " + celsius);

        }
        else
            System.out.println("Wrong parameter entered");




    }
}
