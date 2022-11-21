import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

//        Create Departmen
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Sale";
        System.out.println("thông tin phòng ban 1 : ");
        System.out.println("department1 = " + department1);

//        Create Position
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.Dev;
        System.out.println("thông tin vị trí 1 : ");
        System.out.println("position1 = " + position1);


//        Create Account
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "hoang123@yahoo.com";
        account1.fullName = "Tran Van Hoang";
        account1.userName = "Hoang113";
        account1.departmentId = department1.departmentID;
        account1.positionId = position1.positionId;
        account1.createDate = LocalDate.of(2020,9,12);
        System.out.println("thông tin account 1 : ");
        System.out.println("account1 = " + account1);

//        Create Group
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "SieuNhanGao";
        group1.createId = account1.accountId;
        group1.createDate = LocalDate.of(2021, 8, 15);
        System.out.println("thông tin group 1 : ");
        System.out.println("group1 = " + group1);


//        Create Group of Account
        Group[] groupOfAccount1 = new Group[] {group1};  // nhóm các Gr lại với nhau và gán cho Account 1
        account1.groups = groupOfAccount1;
        Account[] AccountOfGroup1 = new Account[] {account1}; // nhóm các account lại rồi gán cho gr 1
        group1.accounts = AccountOfGroup1;


//        Crete TypeQuestion
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeId =1;
        typeQuestion1.typeName = TypeQuestionName.Essay;
        System.out.println("thông tin loại câu hỏi 1 : ");
        System.out.println("typeQuestion1 = " + typeQuestion1);

//        Create CategoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryId = 1;
        categoryQuestion1.categoryName = "Java";
        System.out.println("thông tin kho câu hỏi 1 : ");
        System.out.println("categoryQuestion1 = " + categoryQuestion1);

//        Create  Question
        Question question1 = new  Question();
        question1.questionId = 1;
        question1.categoryId = categoryQuestion1.categoryId;
        question1.content = "Java là gì?";
        question1.typeId = typeQuestion1.typeId ;
        question1.createId = account1.accountId;
        question1.createDate = LocalDate.of(2021, 1, 10);
        System.out.println("thông tin câu hỏi 1 : ");
        System.out.println("question1 = " + question1);

//        crete Answer
        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.questionId = question1.questionId;
        answer1.content = "Java là ngôn ngữ lập trình hướng đối tượng";
        answer1.isCorrect = true;
        System.out.println("thông tin câu trả lời 1 : ");
        System.out.println("answer1 = " + answer1);

//        crete Exam
        Exam exam1  = new Exam();
        exam1.examId = 1;
        exam1.code = "A2022";
        exam1.categoryId = 1;
        exam1.createId = account1.accountId;
        exam1.duration = 100 ;
        exam1.createDate = LocalDate.of(2021, 10, 10);
        System.out.println("thông tin đề thi A2022 : ");
        System.out.println("exam1 = " + exam1);


    }
}
