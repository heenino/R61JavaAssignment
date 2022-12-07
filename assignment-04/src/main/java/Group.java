import java.time.LocalDateTime;

public class Group {
    String name;
    String creator;
    String userName;
    Account[] accounts;
    LocalDateTime createDate;

    public Group() {
    }

    public Group(String name, String creator, Account[] accounts, LocalDateTime createDate) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }
    public Group(String name, String creator, String userName, LocalDateTime createDate) {
        Account[] accounts1  = {new Account(userName)};
        this.name = name;
        this.creator = creator;
        this.userName = userName;
        this.createDate = createDate;
    }

}
