import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    //constructor
    public GuessingGame() {
        System.out.println("Hey whats up?");
        System.out.println("(type in your name)");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // create an instance of the Random object
        Random rand = new Random();

        // call method nextInt and pass in upper range bound
        int number = rand.nextInt(100);

        System.out.println(name + ",I'm thinking of a number between 1 and 100. Try to guess my number.");
        System.out.println("Your Guess?");

        int tries = 0;
        while(true) {
            int num;
            try {
                num = input.nextInt();
            } catch (InputMismatchException e) {
                String wrong_input = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if(num < 1 || num > 100) {
                System.out.println(num + " is not a valid number. Enter a valid number between 1 - 100.");
                continue;
            }

            tries++;

            if(num < number) {
                System.out.println("Your guess is too low, try again.");
            }
            else if(number > num) {
                System.out.println("Your guess is too high, try again.");
            }
            else {
                System.out.println("Well done,"+name+"!");
                System.out.println("You found my number in "+tries+" tries!");
                break;
            }
        }
    }


}
