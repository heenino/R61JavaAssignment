

public class Exercise01 {
    public static void question01() {
        Account account = new Account();
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là ...");
        }
    }

    public static void question02() {
        Account account2 = new Account();
        Group group1 = new Group();
        group1.name = "Java Fresher";
        Group group2 = new Group();
        group2.name = "C# Fresher";
        Group group3 = new Group();
        account2.groups = new Group[]{group1, group2, group3};
        if (account2.groups == null || account2.groups.length == 0) {
            System.out.println("nhân viên này chưa có Group");
        } else if (account2.groups.length <= 2) {
            System.out.println("Group của nhân viên này là : ");
            for (Group group : account2.groups) {
                System.out.println(group.name);
            }
        } else if (account2.groups.length == 3) {
            System.out.println("người quan trọng");
        } else {
            System.out.println("nhân viên hóng chuyện, tham gia nhiều gr quá");

        }
    }

    public static void question03() {
        Account account = new Account();
        String message = (account.department == null) ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là ...";
        System.out.println(message);
    }

    public static void question04() {
        Account account1 = new Account();
        Position pos1 = new Position();
        pos1.name = PositionName.DEV;
        account1.position = pos1;
        String message = (account1.position.name == PositionName.DEV) ? "đây là dev " : "người này không phải dev";
        System.out.println(message);
    }

    public static void question05() {
        Group group = new Group();
        group.accounts = new Account[]{new Account(), new Account()};
        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }

    public static void question06() {
        Account account2 = new Account();
        Group group1 = new Group();
        group1.name = "Java Fresher";
        Group group2 = new Group();
        group2.name = "C# Fresher";
        Group group3 = new Group();
        account2.groups = new Group[]{group1};

        switch (account2.groups.length) {
            case 0:
                System.out.println("nv k có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là : ");
                for (Group group : account2.groups) {
                    System.out.println(group.name);
                }
                break;
            case 3:
                System.out.println("người quan trọng");
                break;
            case 4:
                System.out.println("người lắm chuyện");
                break;
        }

    }

    public static void question07() {
        Account account1 = new Account();
        Position pos1 = new Position();
        pos1.name = PositionName.TEST;
        account1.position = pos1;
        switch (account1.position.name) {
            case DEV:
                System.out.println("đây là dev");
                break;
            case TEST:
            case SCRUM_MASTER:
            case PM:
                System.out.println("người này không phải dev");
                break;
        }

    }

    public static void question08() {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();
        Account[] allAccount = {account1, account2, account3, account4};
        int dem = 1;
        for (Account allacc : allAccount) {
            System.out.println("Thông tin account thứ " + dem++);
            System.out.println("email là : " + allacc.email);
            System.out.println("fullname là : " + allacc.fullName);
            System.out.println("tên phòng ban là : " + allacc.department);
            System.out.println("----------------------------");
        }

    }

    public static void question09() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        int dem = 1;
        for (Department allDep : departments) {
            System.out.println("thông tin phòng ban thứ " + dem++);
            System.out.println("id = " + allDep.id);
            System.out.println("name = " + allDep.name);
        }
    }

    public static void question10() {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();
        Account[] allAccount = {account1, account2, account3, account4};
        for (int i = 0; i < allAccount.length; i++) {
            System.out.println("Thông tin account thứ " + (i+1) + " :");
            System.out.println("Email : " + allAccount[i].email);
            System.out.println("Full name : " + allAccount[i].fullName);
            System.out.println("Phòng ban : " + allAccount[i].department);
        }


    }

    public static void question11() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i+1) + " :");
            System.out.println("Id : " + departments[i].id);
            System.out.println("Name : " + departments[i].name);
        }


    }

    public static void question12() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + i + " :");
            System.out.println("Id : " + departments[i].id);
            System.out.println("Name : " + departments[i].name);
        }
    }

    public static void question13() {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();
        Account[] allAccount = {account1, account2, account3, account4};
        for (int i = 0; i < allAccount.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i+1) + " :");
                System.out.println("Email : " + allAccount[i].email);
                System.out.println("Full name : " + allAccount[i].fullName);
                System.out.println("Phòng ban : " + allAccount[i].department);
            }
        }
    }

    public static void question14() {
        Account account1 = new Account();
        account1.id = 1;
        Account account2 = new Account();
        account2.id = 5;
        Account account3 = new Account();
        account3.id = 3;
        Account account4 = new Account();
        account4.id = 6;
        Account[] allAccount = {account1, account2, account3, account4};
        for (int i = 0; i < allAccount.length; i++) {
            if (allAccount[i].id < 4) {
                System.out.println("Thông tin account thứ " + i + " :");
                System.out.println("Id : " + allAccount[i].id);
                System.out.println("Email : " + allAccount[i].email);
                System.out.println("Full name : " + allAccount[i].fullName);
                System.out.println("Phòng ban : " + allAccount[i].department);
            }
        }

    }

    public static void question15() {
        System.out.println("các số chẵn nhỏ hơn 20 là : ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) System.out.print(+i + " ");

        }
    }

    public static void question16a() {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();
        Account[] allAccount = {account1, account2, account3, account4};
        int i = 0;
        while (i < allAccount.length) {
            System.out.println("Thông tin account thứ " + i + " :");
            System.out.println("Email : " + allAccount[i].email);
            System.out.println("Full name : " + allAccount[i].fullName);
            System.out.println("Phòng ban : " + allAccount[i].department);
            i++;
        }


    }

    public static void question16b() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + i + " :");
            System.out.println("Id : " + departments[i].id);
            System.out.println("Name : " + departments[i].name);
            i++;
        }
    }

    public static void question16c() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + i + " :");
            System.out.println("Id : " + departments[i].id);
            System.out.println("Name : " + departments[i].name);
            i++;
            if (i == 2)             //nếu i = 2 thì không in ra câu lệnh bên trên
                break;
            i++;
        }
    }

    public static void question16d() {
        Account account1 = new Account();
        account1.id = 1;
        Account account2 = new Account();
        account2.id = 5;
        Account account3 = new Account();
        account3.id = 3;
        Account account4 = new Account();
        account4.id = 6;
        Account[] allAccount = {account1, account2, account3, account4};
        int i = 0;
        while (i < allAccount.length) {
            i++;
            System.out.println("Thông tin account thứ " + i + " :");
            System.out.println("Id : " + allAccount[i].id);
            System.out.println("Email : " + allAccount[i].email);
            System.out.println("Full name : " + allAccount[i].fullName);
            System.out.println("Phòng ban : " + allAccount[i].department);
            if (allAccount[i].id < 4)                   // nếu account có id nhỏ hơn 4
                continue;                               // thì sẽ bỏ qua dòng lệnh bên dưới
            i++;
        }

    }

    public static void question16e() {
        int i = 0;
        System.out.println("các số chẵn nhỏ hơn 20 là : ");
        while (i < 20) {
            i++;
            if (i % 2 != 0)            //  Nếu i chia 2 != 0 thì không thực hiện dòng trên mà tiếp tục chạy thêm 1
                continue;
            if (i != 20) {
                System.out.print(+i + " ");
            }
            i++;
        }

    }

    public static void question17a() {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();
        Account[] allAccount = {account1, account2, account3, account4};
        int i = 0;
        do {
            System.out.println("Thông tin account thứ " + i + " :");
            System.out.println("Email : " + allAccount[i].email);
            System.out.println("Full name : " + allAccount[i].fullName);
            System.out.println("Phòng ban : " + allAccount[i].department);
            i++;
        }
        while (i < allAccount.length);

    }

    public static void question17b() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        int i = 0;
        do{
            System.out.println("Thông tin department thứ " + i + " :");
            System.out.println("Id : " + departments[i].id);
            System.out.println("Name : " + departments[i].name);
            i++;
        }
        while (i < departments.length);
    }

    public static void question17c() {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        Department[] departments = {department1, department2, department3};
        int i = 0;
        do {
            System.out.println("Thông tin department thứ " + i + " :");
            System.out.println("Id : " + departments[i].id);
            System.out.println("Name : " + departments[i].name);
            i++;
            if (i == 2)             //nếu i = 2 thì không in ra câu lệnh bên trên
                break;
            i++;
        }
        while (i < departments.length);
    }

    public static void question17d() {
        Account account1 = new Account();
        account1.id = 1;
        Account account2 = new Account();
        account2.id = 5;
        Account account3 = new Account();
        account3.id = 3;
        Account account4 = new Account();
        account4.id = 6;
        Account[] allAccount = {account1, account2, account3, account4};
        int i = 0;
        do {
            i++;
            System.out.println("Thông tin account thứ " + i + " :");
            System.out.println("Id : " + allAccount[i].id);
            System.out.println("Email : " + allAccount[i].email);
            System.out.println("Full name : " + allAccount[i].fullName);
            System.out.println("Phòng ban : " + allAccount[i].department);
            if (allAccount[i].id < 4)                   // nếu account có id nhỏ hơn 4
                continue;                               // thì sẽ bỏ qua dòng lệnh bên dưới
            i++;
        }
        while (i < allAccount.length);

    }
    public static void question17e() {
        int i = 0;
        System.out.println("các số lẻ nhỏ hơn 20 là : ");
        do {
            i++;
            if (i % 2 == 0)            //  Nếu i chia 2 == 0 thì không thực hiện dòng trên mà tiếp tục chạy thêm 1
                continue;
            if (i != 20) {
                System.out.print(+i + " ");
            }
            i++;
        }while (i < 20);

    }

    public static void main(String[] args) {
//         question01();
//         question02();
//         question03();
//         question04();
//         question05();
//         question06();
//         question07();
//         question08();
//         question09();
//         question10();
//         question11();
//         question12();
//         question13();
//         question14();
//         question15();
//         question16a();
//         question16b();
//         question16c();
//         question16d();
//         question16e();
//         question17a();
//         question17b();
//        question17c();
//        question17b();
//          question17e();

    }
}

