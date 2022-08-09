import java.util.Scanner;

// This class choose a random number and the user should guess that in order to win the game
public class GuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
        System.out.println("Welcome to the Guessing Game");
        int userNumber;
        int count = 0;
        while (true) {
            userNumber = input();
            if (userNumber <= 1000 && userNumber >= 0) {
                if (userNumber != randomNumber) {
                    if (userNumber < randomNumber) {
                        System.out.println("Guess higher");
                    } else {
                        System.out.println("Guess lower");
                    }
                    count += 1;
                } else {
                    System.out.println("Spot on. Congrats");
                    count += 1;
                    System.out.println("Number of guesses:" + count);
                    break;
                }
            } else {
                System.out.println("Number must be between 1-1000");
            }
        }
    }

    // Checks if the input is an integer
    public static int input() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number between 1-1000:");
            if (!scanner.hasNextInt()){
                System.out.println("Invalid input!");
            }
            else return scanner.nextInt();
        }
    }
}
