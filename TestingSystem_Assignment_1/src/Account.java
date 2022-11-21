import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Account {
    int accountId;
    String email;
    String userName;
    String fullName;
    byte departmentId;
    byte positionId;
    LocalDate createDate;
    Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
