import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int RandomNo = r.nextInt(100) + 1;
        int count = 0;
        while (true) {
            // Maximum NUmber of tries == 25
            if(count>=25) {
                System.out.println(" Oops!! Game Over..\n you have taken Maximum of of Tries ");
                System.exit(0);
            }
            System.out.println(" enter your guess between 1-100:");
            int playerGuess = sc.nextInt();
            count++;

            if (playerGuess == RandomNo) {
                System.out.println("Wow!!Correct Guess \n You win!! ");
                System.out.println("Number of tries : " + count);
                break;
            } else if (RandomNo > playerGuess) {
                System.out.println("Ohh! the number is higher  ...PLease Guress again");

            } else {
                System.out.println("Ohh!THe number is lower  ... PLease Guess again");
            }
        }
        // Lower Value>>> Higher Score
        // Higher Value>>> Lowe Score
        // one Tries giver !0 points
         int score=count*10;
        System.out.println(" your score is "+score);

    }
}