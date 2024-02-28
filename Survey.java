import java.util.ArrayList;
class Survey {
    private String code;
    private ArrayList<Question> questions;

    public Survey(String code) {
        this.code = code;
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
public class {
    private String text;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int correctOption;

    public Question(String text, String option1, String option2, String option3, String option4, int correctOption) {
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
    }

    public String getText() {
        return text;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}