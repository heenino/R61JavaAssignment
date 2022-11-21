import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    byte groupId;
    String groupName;
    int createId;
    LocalDate createDate;
    Account[] accounts;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", createId=" + createId +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
