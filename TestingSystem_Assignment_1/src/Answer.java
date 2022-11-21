public class Answer {
    byte answerId;
    String content;
    byte questionId;
    Boolean isCorrect;

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", content='" + content + '\'' +
                ", questionId=" + questionId +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
