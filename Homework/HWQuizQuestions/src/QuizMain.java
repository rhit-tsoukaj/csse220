import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is used to demonstrate a functional design involving Quizzes and
 * Questions which can be updated and displayed
 * 
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         Anthony.
 *************************************************************************************** 
 */
public class QuizMain {
	
	//TODO add instance variables here
	private ArrayList<Question> totalQuestions;
	private ArrayList<Quiz> totalQuizzes;


	
	public QuizMain() {
		// TODO In order to demonstrate functionality, please follow the TODOs below
		// You will have to create questions and quizzes when a QuizMain is created
		totalQuestions = new ArrayList<>();
		totalQuizzes = new ArrayList<>();
		
		
		// TODO 1 Create five questions (can be silly/basic questions) use id 1,2,3,4,5 ...

		Question q1 = new Question(1, "What is the capital of Czechoslovakia?");
		Question q2 = new Question(2, "What is a class?");
		Question q3 = new Question(3, "What is 3999999999 * 29?");
		Question q4 = new Question(4, "How many guinea pigs can fit in an average male's sock?");
		Question q5 = new Question(5, "Let's say three cows run into each other at 150 miles per hour, how many cows are there?");

		totalQuestions.add(q1);
		totalQuestions.add(q2);
		totalQuestions.add(q3);
		totalQuestions.add(q4);
		totalQuestions.add(q5);

	

		// TODO 2 Create three or more quizzes  use id 1,2,3...
		//      (One quiz should share at least one question with another )

		Quiz quiz1 = new Quiz();
		Quiz quiz2 = new Quiz();
		Quiz quiz3 = new Quiz();

		quiz1.addQuestion(q4);
		quiz1.addQuestion(q5);

		quiz2.addQuestion(q1);
		quiz2.addQuestion(q2);

		quiz3.addQuestion(q3);
		quiz3.addQuestion(q5);

		totalQuizzes.add(quiz1);
		totalQuizzes.add(quiz2);
		totalQuizzes.add(quiz3);
		
	}
	
	
	
	public static void main(String[] args) {
		//We want to use instance variables of the QuizMain class so we need to construct a QuizMain object
		QuizMain myQuizSimulator = new QuizMain();
		
		// TODO 3 Display three or more different quizzes
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more original quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
		
		
		// TODO 4 Change two quiz questions 
		// A. (One should be shared with two or more quizzes)
		// B. (One should be unique to one quiz)
		myQuizSimulator.handleUpdateQuizQuestion(1,"How many baby crabs are in Uzbekistan?");
		myQuizSimulator.handleUpdateQuizQuestion(5,"How many cats does John Tsoukalis have?");

		
		// TODO 5 Display the same three (or more) quizzes
		//	   A. One that has a unique question which changed
		//	   B. Two which share a question that has been changed		
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more changed quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
	}
	
	/**
	 *  This method should display a quiz in a very similar fashion to the output provided
	 *  in exampleOutput.txt, which is located in your repository
	 * 
	 * 
	 * @param quizId
	 */
	public void handleDisplayQuiz(int quizId) {
		for (int i = 0; i < totalQuizzes.size(); i++) {
			Quiz quiz = totalQuizzes.get(i);
			if (quiz.getQuizID() == quizId) {
				System.out.println("Quiz: " + quiz.getQuizID());
				ArrayList<Question> questions = quiz.getQuestions();
				for (int j = 0; j < questions.size(); j++) {
					Question a = questions.get(j);
					System.out.println("Question["+a.getQuestionID()+"]: " + a.getquestionQuery());
				}
				System.out.println();
				return;
			}
		}

	}
	
	/**
	 * 
	 * This method should replace the data in the question with id=questionId with the new questionData 
	 * 
	 * @param questionId
	 * @param questionData
	 */
	public void handleUpdateQuizQuestion(int questionId, String questionData) {
		//TODO complete this method
		for (int i = 0; i < totalQuestions.size(); i++) {
			Question a = totalQuestions.get(i);
			if (a.getQuestionID() == questionId) {
				a.setquestionQuery(questionData);}

		}
	}

}
