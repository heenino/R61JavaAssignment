import java.util.Date;

public class GroupAccount {
    Group groupId;
    Account accountId;
    Date joinDate;

    @Override
    public String toString() {
        return "GroupAccount{" +
                "groupId=" + groupId +
                ", accountId=" + accountId +
                ", joinDate=" + joinDate +
                '}';
    }
}
