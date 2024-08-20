
import java.util.Random;
import java.util.Scanner;

public class numGuessGame {

    public static void main(String[] args) {

        int max = getDifficulty();
        int targetNum = getRandomNum(max);
        guessNum(targetNum);

    }

    public static int getRandomNum(int max) {
        return new Random().nextInt(max + 1);
    }

    public static int getDifficulty() {
        String choice;
        int max;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What is the difficult level do you want to play? (1: Easy(0-100), 2: Medium(0-500), 3: Hard(0-1000))");

            while (true) {

                choice = sc.nextLine();

                switch (choice) {
                    case "1" -> {
                        max = 100;
                        return max;
                    }
                    case "2" -> {
                        max = 500;
                        return max;
                    }
                    case "3" -> {
                        max = 1000;
                        return max;
                    }
                    default ->
                        System.err.println("Please enter 1, 2, and 3 only! Try again:");
                }

            }

        }

    }

    public static void guessNum(int target) {
        int chance = 7;

        try (Scanner sc = new Scanner(System.in)) {
            String inputStr;
            int inputNum;
            while (chance > 0) {
                System.out.println("Guess the number: ");
                System.out.println("You have " + chance + " chance to guess");

                inputStr = sc.nextLine();
                inputNum = Integer.parseInt(inputStr);
                if (inputNum == target) {
                    System.out.println("Bingo! You win, the number is " + target + ". You used " + (7 - chance) + " times to win! ");
                    break;
                } else if (inputNum > target) {
                    System.out.println("It is too big.");
                } else {
                    System.out.println("It is too small.");
                }

                chance--;
            }

            if (chance == 0) {
                System.out.println("You lose, the number is " + target + ".");
            }
        }
    }

}
