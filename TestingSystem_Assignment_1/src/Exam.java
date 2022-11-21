import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Exam {
    byte examId;
    String code;
    String tilte;
    int categoryId;
    int duration;
    int createId;
    LocalDate createDate;
    Question[] questions;

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", code='" + code + '\'' +
                ", tilte='" + tilte + '\'' +
                ", categoryId=" + categoryId +
                ", duration=" + duration +
                ", createId=" + createId +
                ", createDate=" + createDate +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
