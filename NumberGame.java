import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNo = random.nextInt(100);
        System.out.println(randomNo);
        int guessNo;

        do {
            System.out.println("Enter you guess 1 TO 100 : ");
            guessNo = sc.nextInt();

            if (guessNo == -1) {
                System.out.println("You Exited the game");
            } else if (randomNo == guessNo) {
                System.out.println(
                        "Conratulations ! You are Guess corrected");
            } else {
                System.out.println(
                        "Sorry ! your guess number is incorrect Please try again or Exited the game please enter -1");
            }
        } while (guessNo != randomNo && guessNo != -1);

        sc.close();

    }
}
