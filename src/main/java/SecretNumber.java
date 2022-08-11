import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        System.out.println("Guess the secret number");

        Scanner reader = new Scanner(System.in);


        int secretNumber = reader.nextInt();

        if (secretNumber > 13) {

            System.out.println("Too high");

        } else if (secretNumber == 13) {

            System.out.println("Correct!");


        } else {
            System.out.println("Too low");


        }

    }

}

