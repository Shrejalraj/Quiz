package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        QuizApplication quizApp = new QuizApplication();

	        // Registration
	        quizApp.registerUser("user123", "password");

	        // Login
	        if (quizApp.login("user123", "password")) {
	            // Create a Quiz object and add questions
	            List<Question> questions = new ArrayList<>();
	            List<String> options1 = Arrays.asList("London", "Paris", "Berlin", "Rome");
	            questions.add(new Question("What is the capital of France?", options1, 1, 1));

	            Quiz quiz = new Quiz("General Knowledge Quiz", questions);

	            // Create a QuizTaker object
	            QuizTaker quizTaker = new QuizTaker();

	            // Take the quiz and get the score
	            int score = quizTaker.takeQuiz(quiz);

	            // Display result
	            System.out.println("Quiz completed!");
	            System.out.println("Your total score is: " + score);
	        } else {
	            System.out.println("Invalid credentials. Please try again.");
	        }
	    }
	}
