import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //Creating Question List ArrayList
    ArrayList<Question> questionList = new ArrayList<Question>();

    //Setting Variables to Defaults or Zero
    String questionText = "";
    String answerOneText = "";
    String answerTwoText = "";
    String answerThreeText = "";
    String answerFourText = "";
    int correct = 0;
    int points = 0;


  //Try Block - Reader
    try {
      FileReader myFile;
      myFile = new FileReader("trivia.txt");
      BufferedReader reader = new BufferedReader(myFile);

      while(reader.ready()) {
        questionText = reader.readLine();
        answerOneText = reader.readLine();
        answerTwoText = reader.readLine();
        answerThreeText = reader.readLine();
        answerFourText = reader.readLine();
        correct = Integer.parseInt(reader.readLine());
        points = Integer.parseInt(reader.readLine());

        //Creating Question Object
         Question theQuestion = new Question(questionText, answerOneText, answerTwoText, answerThreeText, answerFourText, correct, points);
        //Adding Question Objects to ArrayList
         questionList.add(theQuestion);
      }
      reader.close();
    }
    //Catch Block - Reader
    catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
      }

    /*Printing out Full ArrayList
    for (int i=0; i<questionList.size(); i++) {
    System.out.printf("%-25s %-10s %-10s %-10s %-10s %-5s %-5s %n",
    questionList.get(i).getQuestionText(), 
    questionList.get(i).getAnswerOneText(),
    questionList.get(i).getAnswerTwoText(),
    questionList.get(i).getAnswerThreeText(),
    questionList.get(i).getAnswerFourText(),
    questionList.get(i).getCorrect(),
    questionList.get(i).getPoints());
    }
    */

    System.out.println(questionList.get(1).getQuestionText());
  

    }
  }