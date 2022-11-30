import java.time.LocalDate;

public class Execise2 {
    String email,userName,fullName;
    LocalDate createDate = LocalDate.now();
    @Override
    public String toString() {
        return "Execise2{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
    public static void main(String[] args) {
        Execise2[] accounts = new Execise2[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Execise2();
            accounts[i].email ="Email " + (i+1);
            accounts[i].userName ="UserName " + (i+1);
            accounts[i].fullName ="Full name" + (i+1);;
        }
        for (Execise2 allAcc : accounts) {
            System.out.println("________________");
            System.out.println("allAcc = " + allAcc);
            System.out.println("allAcc.hashCode() = " + allAcc.hashCode()); // địa chỉ ô nhớ
        }


    }
}
