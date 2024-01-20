
import java.util.Random;
import java.util.Scanner;
public class FractionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FractionQuiz quiz = new FractionQuiz();
        quiz.runQuiz(scanner);
    }
 private void runQuiz(Scanner scanner) {
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        Fraction userAnswer;
        Fraction correctAnswer;
        int correctCount = 0;
        int totalCount = 0;
        boolean quit = false;

        while (!quit) {
            correctAnswer = new Fraction();
            System.out.print(correctAnswer + " = ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                quit = true;
            } else {
                userAnswer = Fraction.parseFraction(input);

                if (userAnswer != null && userAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    correctCount++;
                } else {
                    System.out.println("Invalid input.Enter a valid fraction or 'quit'.");
                }

                totalCount++;
            }
        }

        // Display quiz results
        System.out.println("\nYour win/loss ratio was " + correctCount + "/" + totalCount +
                ", for a score of " + Math.round((double) correctCount / totalCount * 100) + " percent!");
    }
}