import java.util.Scanner;

public class GuessNumber { 
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
        int randomNumber = 56;
        int userNumber = 1;

        System.out.println("Guess number!!!");
        while (randomNumber != userNumber) {
            System.out.print("Input number: ");
            userNumber = input.nextInt();

            if (userNumber == randomNumber) {
                System.out.println("Well done!!");
            } else if (userNumber > randomNumber) {
                System.out.println("The number is litlle.");
            } else {
                System.out.println("The number is big.");
            }
        }
        System.out.print ("You have guessed.");
    }
}
