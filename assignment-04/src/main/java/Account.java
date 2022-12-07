import java.time.LocalDateTime;

public class Account {
    int id;
    String email;
    String userName;
    String fistName;
    String lastName;
    String fullName;
    Department department;
    String position;
    LocalDateTime createdDate;

    public Account() {
    }

    public Account(String userName) {
        this.userName = userName;
    }

    public Account(int id, String email, String userName, String fistName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fistName = fistName;
        this.lastName = lastName;
        this.fullName = fistName + lastName;
    }

    public Account(int id, String email, String userName, String fistName, String lastName, String position) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fistName = fistName;
        this.lastName = lastName;
        this.position = position;
        this.createdDate = LocalDateTime.now();
    }

    public Account(int id, String email, String userName, String fistName, String lastName,
                   String fullName, String position, LocalDateTime createdDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fistName = fistName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.position = position;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + userName + '\'' +
                '}';
    }
}
