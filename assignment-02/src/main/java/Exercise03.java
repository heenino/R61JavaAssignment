import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Exercise03 {
    public static void question01() {
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "A2022";
        exam1.createDate = LocalDateTime.of(2022, 11, 10,00,00,00);
        Locale locale = new Locale("vi", "VN");
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale);
        LocalDateTime createDate1 = exam1.createDate;
        System.out.println("exam1 = " + exam1);
        System.out.println("createDate = " + createDate1.format(dateTimeFormatter));
    }
    public static void question02(){
        Exam exam1 = new Exam();
        exam1.createDate = LocalDateTime.of(2022, 11, 10,11,59,59);
        DateTimeFormatter formatByPatterm = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .ofPattern("yyyy-MM-dd-HH-mm-ss");
        LocalDateTime createDate1 = exam1.createDate;
        System.out.println("createDate : "+ createDate1.format(formatByPatterm));

    }

    public static void question03(){
        Exam exam1 = new Exam();
        exam1.createDate = LocalDateTime.of(2022, 11, 10,11,59,59);
        DateTimeFormatter formatByPatterm = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .ofPattern("yyyy");
        LocalDateTime createDate1 = exam1.createDate;
        System.out.println("createYeah : "+ createDate1.format(formatByPatterm));


    }

    public static void question04(){
        Exam exam1 = new Exam();
        exam1.createDate = LocalDateTime.of(2022, 11, 10,11,59,59);
        DateTimeFormatter formatByPatterm = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .ofPattern("MM-yyyy");
        LocalDateTime createDate1 = exam1.createDate;
        System.out.println("createMouth : "+ createDate1.format(formatByPatterm));


    }
    public static void question05(){
        Exam exam1 = new Exam();
        exam1.createDate = LocalDateTime.of(2022, 11, 10,11,59,59);
        DateTimeFormatter formatByPatterm = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .ofPattern("MM-dd");
        LocalDateTime createDate1 = exam1.createDate;
        System.out.println("createDate : "+ createDate1.format(formatByPatterm));


    }
    public static void main(String[] args) {
//        question01();
//        question02();
//        question03();
//        question04();
        question05();

    }


}
