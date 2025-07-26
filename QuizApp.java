import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = new Question[3];
        questions[0] = new Question("What is the capital of France?", "Paris");
        questions[1] = new Question("What is the capital of India?", "New Delhi");
        questions[2] = new Question("What is the capital of Japan?", "Tokyo");

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + questions[i].getAnswer());
            }
            System.out.println();
        }

        System.out.println("Your final score: " + score + "/" + questions.length);
        scanner.close();
    }
}
