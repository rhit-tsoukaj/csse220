import java.util.ArrayList;

/**
 *
 * TODO (1) Implement this class and (2) Document using Javadoc comments as well as regular comments
 * <p>
 * This code is the layout of a Quiz as seen in the design problem and can represent multiple Question within itself
 * This class allows multiple questions to be contained within itself and for multiple copies of itself
 * to be created with their own unique ID's.
 *
 *
 */
public class Quiz {

    private int quizID; //Initializes unique quizID with int
    static int count = 1; //Count starts off at 1 and is used
    private ArrayList<Question> questions; //Allows for the copying of multiple questions in an ArrayList

    public Quiz() { //Each time a new Quiz is created it is given a new ID that is incremented
        this.quizID = count;
        count++;
        this.questions = new ArrayList<>();
    }

    public int getQuizID() { //Quiz ID getter
        return this.quizID;
    }


    public void addQuestion(Question a) { //Adds questions to itself
        this.questions.add(a);
    }

    public ArrayList<Question> getQuestions() { //Gets questions
        return this.questions;
    }
}
