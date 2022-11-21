import java.time.LocalDate;

public class Question {
    byte questionId;
    String content;
    byte categoryId;
    byte typeId;
    int createId;
    LocalDate createDate;

    @Override
    public String toString() {
        return "Question{" +
                "QuestionId=" + questionId +
                ", content='" + content + '\'' +
                ", categoryId=" + categoryId +
                ", typeId=" + typeId +
                ", createId=" + createId +
                ", createDate=" + createDate +
                '}';
    }
}
