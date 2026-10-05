/**
  * 
  * TODO (1) Implement this class and (2) Document using Javadoc comments as well as regular comments
  *
  * Represents the layout of what a Question would look like used within Quizzes
  * This class encapsulates both the text within the question as well as a unique identifier
  * which allows the object to be shared within Quizzes.
 */
public class Question {

    private String questionQuery; //Text of the question as a string
    private int questionID; //Identifier of the question as int

    public Question(int questionID, String questionData) { //Object initializer
        this.questionQuery = questionData;
        this.questionID = questionID;
    }

    public String getquestionQuery () {//Question text getter
        return this.questionQuery;
    }

    public void setquestionQuery (String newquestionQuery) { //Question text setter
        this.questionQuery = newquestionQuery;
    }

    public int getQuestionID () { //ID Getter
        return this.questionID;
    }


}
