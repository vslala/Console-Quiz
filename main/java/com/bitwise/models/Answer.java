package main.java.com.bitwise.models;

/**
 * Created by varunsh on 8/17/2016.
 */
public class Answer {
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private Integer correctOption;

    public Answer() {}

    public Answer(String option1, String option2, String option3, String option4, Integer correctOption) {
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
    }


    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public Integer getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(Integer correctOption) {
        this.correctOption = correctOption;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(400);
        sb.append("\n" + "1. " + this.option1 + "\n")
                .append("2. " + this.option2 + "\n")
                .append("3. " + this.option3 + "\n")
                .append("4. " + this.option4 + "\n");
        return sb.toString();
    }
}
