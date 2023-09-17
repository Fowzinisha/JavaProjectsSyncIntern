import java.util.Scanner;

public class SurveySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Survey System!");
        System.out.println("------------------------------------\n");

        System.out.println("Please answer the following questions:");

        // Define sample survey questions
        String[] questions = {
            "1. What is your age?",
            "2. What is your gender? (Male/Female/Other)",
            "3. Do you enjoy programming? (Yes/No)",
            "4. What programming languages do you know? (comma-separated)",
            "5. Would you recommend this survey system to others? (Yes/No)"
        };

        // Initialize an array to store responses
        String[] responses = new String[questions.length];

        // Collect user responses
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + ": ");
            responses[i] = scanner.nextLine();
        }

        // Display collected responses
        System.out.println("\nThank you for taking the survey. Here are your responses:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + " " + responses[i]);
        }

        scanner.close();
    }
}
