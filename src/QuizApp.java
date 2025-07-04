import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What is the capital of France?",
            new String[]{"Berlin", "Madrid", "Paris", "Rome"},
            3
        ));

        questions.add(new Question(
            "Which language is used for Android development?",
            new String[]{"Java", "Swift", "Kotlin", "C#"},
            3
        ));

        questions.add(new Question(
            "Which company developed Java?",
            new String[]{"Microsoft", "Sun Microsystems", "Google", "Apple"},
            2
        ));

        questions.add(new Question(
            "Which planet is known as the Red Planet?",
            new String[]{"Earth", "Mars", "Jupiter", "Saturn"},
            2
        ));

        questions.add(new Question(
            "Which data structure uses FIFO (First In First Out)?",
            new String[]{"Stack", "Queue", "Array", "LinkedList"},
            2
        ));

        questions.add(new Question(
            "Who wrote the play 'Romeo and Juliet'?",
            new String[]{"Charles Dickens", "Leo Tolstoy", "William Shakespeare", "Mark Twain"},
            3
        ));

        questions.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"extends", "implements", "inherits", "super"},
            1
        ));

        questions.add(new Question(
            "Which one is not a primitive data type in Java?",
            new String[]{"int", "boolean", "String", "double"},
            3
        ));

        questions.add(new Question(
            "Which organ in the human body is responsible for pumping blood?",
            new String[]{"Brain", "Lungs", "Heart", "Liver"},
            3
        ));

        questions.add(new Question(
            "What does HTML stand for?",
            new String[]{
                "HyperText Markup Language",
                "HighText Machine Language",
                "HyperTool Markup Language",
                "HyperText Markdown Language"
            },
            1
        ));

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions.get(i).display();

            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (questions.get(i).isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " +
                        questions.get(i).options[questions.get(i).correctAnswerIndex - 1]);
            }
        }

        System.out.println("\nQuiz Over! Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}
