import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Execise05 {
    public static void question5() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("nhập id :");
        account.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập email :");
        account.email = scanner.nextLine();
        System.out.println("nhập fullName :");
        account.fullName = scanner.nextLine();
        System.out.println("nhập userName :");
        account.username = scanner.nextLine();
        System.out.printf("%s %n", "nhập Position theo mẫu ");
        System.out.println("Dev = 1,Test = 2,ScrumMaster = 3,PM = 4");
        account.position = new Position();
        int pos = scanner.nextInt();
        scanner.nextLine();
        switch (pos) {
            case 1:
                account.position.name = PositionName.DEV;
                break;
            case 2:
                account.position.name = PositionName.TEST;
                break;
            case 3:
                account.position.name = PositionName.SCRUM_MASTER;
                break;
            case 4:
                account.position.name = PositionName.PM;
                break;
        }
        scanner.close();
        System.out.println("ngày tạo Account tự động lấy ngày hiện tại!");
        account.createdDate = LocalDateTime.now();
        System.out.println("__________________________________");
        System.out.println("thông tin account của bạn là :");
        System.out.println("account = " + account);

    }

    public static void question6() {
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        System.out.println("nhập id :");
        department.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập tên phòng ban :");
        department.name = scanner.nextLine();
        System.out.println("___________________");
        System.out.println("thông tin phòng ban của bạn là");
        System.out.println("department = " + department);
        scanner.close();


    }

    public static void question7() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("hãy nhập 1 số chẵn");
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " đúng là số chẵn");
                break;
            } else
                System.out.println("ĐIÊN À.......");
            continue;
        } while (true);
        scanner.close();

    }

    public static void question8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập chức năng muốn sử dụng :");
        System.out.println("1: tạo Account");
        System.out.println("2: tạo Department");
        do {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Tạo 1 account mới");
                    Account account = new Account();
                    System.out.println("nhập id :");
                    account.id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập email :");
                    account.email = scanner.nextLine();
                    System.out.println("nhập fullName :");
                    account.fullName = scanner.nextLine();
                    System.out.println("nhập userName :");
                    account.username = scanner.nextLine();
                    System.out.printf("%s %n", "nhập Position theo mẫu ");
                    System.out.println("Dev = 1,Test = 2,ScrumMaster = 3,PM = 4");
                    account.position = new Position();
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    switch (pos) {
                        case 1:
                            account.position.name = PositionName.DEV;
                            break;
                        case 2:
                            account.position.name = PositionName.TEST;
                            break;
                        case 3:
                            account.position.name = PositionName.SCRUM_MASTER;
                            break;
                        case 4:
                            account.position.name = PositionName.PM;
                            break;
                    }
                    System.out.println("ngày tạo Account tự động lấy ngày hiện tại!");
                    account.createdDate = LocalDateTime.now();
                    System.out.println("__________________________________");
                    System.out.println("thông tin account của bạn là :");
                    System.out.println("account = " + account);
                    scanner.close();
                    return;


                case 2:
                    System.out.println("Tạo phòng ban mới");
                    Department department = new Department();
                    System.out.println("nhập id :");
                    department.id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập tên phòng ban :");
                    department.name = scanner.nextLine();
                    System.out.println("___________________");
                    System.out.println("thông tin phòng ban của bạn là");
                    System.out.println("department = " + department);
                    scanner.close();
                    return;
                default:
                    System.out.println("ĐIÊN À...");
                    System.out.println("mời bạn nhập lại");
                    System.out.println("1: tạo Account");
                    System.out.println("2: tạo Department");
                    continue;
            }
        }
        while (true);


    }

    public static void question9() {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account();
        account1.username = "hahaha";
        Account account2 = new Account();
        account2.username = "hihihi";
        Account account3 = new Account();
        account3.username = "hohoho";
        Group group1 = new Group();
        group1.name = "Java Fresher";
        Group group2 = new Group();
        group2.name = "C# Fresher";
        Group group3 = new Group();
        group3.name = "Ruby on rails";
        System.out.println("hãy chọn userName :");
        System.out.println("account1.username = " + account1.username);
        System.out.println("account2.username = " + account2.username);
        System.out.println("account3.username = " + account3.username);
        String gr;
        do {
            String user = scanner.nextLine();
            switch (user) {
                case "hahaha":
                    System.out.println("chào " + user + " hãy chọn  tên của  1 Group bạn muốn tham gia");
                    System.out.println("group1.name = " + group1.name);
                    System.out.println("group2.name = " + group2.name);
                    System.out.println("group3.name = " + group3.name);
                    gr = scanner.nextLine();
                    switch (gr) {
                        case "Java Fresher":
                            account1.groups = new Group[]{group1};
                            break;
                        case "C# Fresher":
                            account1.groups = new Group[]{group2};
                            break;
                        case "Ruby on rails":
                            account1.groups = new Group[]{group3};
                            break;
                    }
                    scanner.close();
                    System.out.println("account " + user + "của bạn đã được thêm vào group " + gr);
                    return;
                case "hihihi":
                    System.out.println("chào " + user + " hãy chọn  tên của  1 Group bạn muốn tham gia ");
                    System.out.println("group1.name = " + group1.name);
                    System.out.println("group2.name = " + group2.name);
                    System.out.println("group3.name = " + group3.name);
                    gr = scanner.nextLine();
                    switch (gr) {
                        case "Java Fresher":
                            account2.groups = new Group[]{group1};
                            break;
                        case "C# Fresher":
                            account2.groups = new Group[]{group2};
                            break;
                        case "Ruby on rails":
                            account2.groups = new Group[]{group3};
                            break;
                    }
                    scanner.close();
                    System.out.println("account " + user + "của bạn đã được thêm vào group " + gr);
                    return;
                case "hohoho":
                    System.out.println("chào " + user + " hãy chọn  tên của  1 Group bạn muốn tham gia");
                    System.out.println("group1.name = " + group1.name);
                    System.out.println("group2.name = " + group2.name);
                    System.out.println("group3.name = " + group3.name);
                    gr = scanner.nextLine();
                    switch (gr) {
                        case "Java Fresher":
                            account3.groups = new Group[]{group1};
                            break;
                        case "C# Fresher":
                            account3.groups = new Group[]{group2};
                            break;
                        case "Ruby on rails":
                            account3.groups = new Group[]{group3};
                            break;
                    }
                    scanner.close();
                    System.out.println("account " + user + "của bạn đã được thêm vào group " + gr);
                    return;
                default:
                    System.out.println("NHẬP SAI, HÃY KIỂM TRA LẠI");
                    break;
            }
        } while (true);

    }

    public static void question10() {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account();
        account1.username = "hahaha";
        Account account2 = new Account();
        account2.username = "hihihi";
        Account account3 = new Account();
        account3.username = "hohoho";
        Group group1 = new Group();
        group1.name = "Java Fresher";
        Group group2 = new Group();
        group2.name = "C# Fresher";
        Group group3 = new Group();
        group3.name = "Ruby on rails";
        System.out.println("mời bạn nhập chức năng muốn sử dụng :");
        System.out.println("1: tạo Account");
        System.out.println("2: tạo Department");
        System.out.println("3: thêm Account vào Group");
        System.out.println("4: thêm Account có sẵn vào Group ngẫu nhiên");
        int x = 0;
        do {
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a) {
                case 1:
                    System.out.println("Tạo 1 account mới");
                    Account account = new Account();
                    System.out.println("nhập id :");
                    account.id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập email :");
                    account.email = scanner.nextLine();
                    System.out.println("nhập fullName :");
                    account.fullName = scanner.nextLine();
                    System.out.println("nhập userName :");
                    account.username = scanner.nextLine();
                    System.out.printf("%s %n", "nhập Position theo mẫu ");
                    System.out.println("Dev = 1,Test = 2,ScrumMaster = 3,PM = 4");
                    account.position = new Position();
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    switch (pos) {
                        case 1:
                            account.position.name = PositionName.DEV;
                            break;
                        case 2:
                            account.position.name = PositionName.TEST;
                            break;
                        case 3:
                            account.position.name = PositionName.SCRUM_MASTER;
                            break;
                        case 4:
                            account.position.name = PositionName.PM;
                            break;
                    }
                    System.out.println("ngày tạo Account tự động lấy ngày hiện tại!");
                    account.createdDate = LocalDateTime.now();
                    System.out.println("__________________________________");
                    System.out.println("thông tin account của bạn là :");
                    System.out.println("account = " + account);
                    System.out.println("bạn muốn dùng chơi đồ tiếp không?");
                    System.out.println("1: Có");
                    System.out.println("2: Không(hoặc bất cứ số nào :)) )");
                    x = scanner.nextInt();
                    scanner.nextLine();
                    if (x == 1) {
                        System.out.println("mời bạn nhập chức năng muốn sử dụng :");
                        System.out.println("1: tạo Account");
                        System.out.println("2: tạo Department");
                        System.out.println("3: thêm Account có sẵn vào Group chỉ định");
                        break;
                    } else return;
                case 2:
                    System.out.println("Tạo phòng ban mới");
                    Department department = new Department();
                    System.out.println("nhập id :");
                    department.id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập tên phòng ban :");
                    department.name = scanner.nextLine();
                    System.out.println("___________________");
                    System.out.println("thông tin phòng ban của bạn là");
                    System.out.println("department = " + department);
                    scanner.close();
                    System.out.println("bạn muốn dùng chơi đồ tiếp không?");
                    System.out.println("1: Có");
                    System.out.println("2: Không(hoặc bất cứ số nào :)) )");
                    x = scanner.nextInt();
                    scanner.nextLine();
                    if (x == 1) {
                        System.out.println("mời bạn nhập chức năng muốn sử dụng :");
                        System.out.println("1: tạo Account");
                        System.out.println("2: tạo Department");
                        System.out.println("3: thêm Account có sẵn vào Group chỉ định");
                        break;
                    } else return;
                case 3:
                    System.out.println("hãy chọn userName :");
                    System.out.println("account1.username = " + account1.username);
                    System.out.println("account2.username = " + account2.username);
                    System.out.println("account3.username = " + account3.username);
                    String gr;
                    String user;
                    do {
                        user = scanner.nextLine();
                        switch (user) {
                            case "hahaha":
                                System.out.println("chào " + user + " hãy chọn  tên của  1 Group bạn muốn tham gia");
                                System.out.println("group1.name = " + group1.name);
                                System.out.println("group2.name = " + group2.name);
                                System.out.println("group3.name = " + group3.name);
                                gr = scanner.nextLine();
                                switch (gr) {
                                    case "Java Fresher":
                                        account1.groups = new Group[]{group1};
                                        break;
                                    case "C# Fresher":
                                        account1.groups = new Group[]{group2};
                                        break;
                                    case "Ruby on rails":
                                        account1.groups = new Group[]{group3};
                                        break;
                                }
                                scanner.close();
                                System.out.println("account " + user + "của bạn đã được thêm vào group " + gr);
                                return;
                            case "hihihi":
                                System.out.println("chào " + user + " hãy chọn  tên của  1 Group bạn muốn tham gia ");
                                System.out.println("group1.name = " + group1.name);
                                System.out.println("group2.name = " + group2.name);
                                System.out.println("group3.name = " + group3.name);
                                gr = scanner.nextLine();
                                switch (gr) {
                                    case "Java Fresher":
                                        account2.groups = new Group[]{group1};
                                        break;
                                    case "C# Fresher":
                                        account2.groups = new Group[]{group2};
                                        break;
                                    case "Ruby on rails":
                                        account2.groups = new Group[]{group3};
                                        break;
                                }
                                scanner.close();
                                System.out.println("account " + user + "của bạn đã được thêm vào group " + gr);
                                return;
                            case "hohoho":
                                System.out.println("chào " + user + " hãy chọn  tên của  1 Group bạn muốn tham gia");
                                System.out.println("group1.name = " + group1.name);
                                System.out.println("group2.name = " + group2.name);
                                System.out.println("group3.name = " + group3.name);
                                gr = scanner.nextLine();
                                switch (gr) {
                                    case "Java Fresher":
                                        account3.groups = new Group[]{group1};
                                        break;
                                    case "C# Fresher":
                                        account3.groups = new Group[]{group2};
                                        break;
                                    case "Ruby on rails":
                                        account3.groups = new Group[]{group3};
                                        break;
                                }
                                System.out.println("account " + user + "của bạn đã được thêm vào group " + gr);
                                System.out.println("bạn muốn dùng chơi đồ tiếp không?");
                                System.out.println("1: Có");
                                System.out.println("2: Không(hoặc bất cứ số nào :)) )");
                                x = scanner.nextInt();
                                scanner.nextLine();
                                if (x == 1) {
                                    System.out.println("mời bạn nhập chức năng muốn sử dụng :");
                                    System.out.println("1: tạo Account");
                                    System.out.println("2: tạo Department");
                                    System.out.println("3: thêm Account có sẵn vào Group chỉ định");
                                    break;
                                } else return;
                            default:
                                System.out.println("NHẬP SAI, HÃY KIỂM TRA LẠI");
                                break;
                        }
                    } while (true);

//                    question11 từ đây

                case 4:
                    Random random = new Random();
                    Group[] groups = {group1, group2, group3};
                    int number = random.nextInt(groups.length - 1);
                    System.out.println("hãy chọn userName :");
                    System.out.println("account1.username = " + account1.username);
                    System.out.println("account2.username = " + account2.username);
                    System.out.println("account3.username = " + account3.username);
                    user = scanner.nextLine();
                    switch (user) {
                        case "hahaha":
                            switch (number) {
                                case 0:
                                    account1.groups = new Group[]{group1};
                                    for (Group group : account1.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                                case 1:
                                    account1.groups = new Group[]{group2};
                                    for (Group group : account1.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                                case 2:
                                    account1.groups = new Group[]{group3};
                                    for (Group group : account1.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                            }
                        case "hihihi":
                            switch (number) {
                                case 0:
                                    account2.groups = new Group[]{group1};
                                    for (Group group : account2.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                                case 1:
                                    account2.groups = new Group[]{group2};
                                    for (Group group : account2.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                                case 2:
                                    account2.groups = new Group[]{group3};
                                    for (Group group : account2.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                            }
                        case "hohoho":
                            switch (number) {
                                case 0:
                                    account3.groups = new Group[]{group1};
                                    for (Group group : account3.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                                case 1:
                                    account3.groups = new Group[]{group2};
                                    for (Group group : account3.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                                case 2:
                                    account3.groups = new Group[]{group3};
                                    for (Group group : account3.groups) {
                                        System.out.println("chào " + user + " bạn được thêm vào" + group.name);
                                    }
                                    break;
                            }
                            System.out.println("bạn muốn dùng chơi đồ tiếp không?");
                            System.out.println("1: Có");
                            System.out.println("2: Không(hoặc bất cứ số nào :)) )");
                            x = scanner.nextInt();
                            scanner.nextLine();
                            if (x == 1) {
                                System.out.println("mời bạn nhập chức năng muốn sử dụng :");
                                System.out.println("1: tạo Account");
                                System.out.println("2: tạo Department");
                                System.out.println("3: thêm Account có sẵn vào Group chỉ định");
                                System.out.println("4: thêm Account có sẵn vào Group ngẫu nhiên");
                                break;
                            } else return;
                        default:
                            System.out.println("ĐIÊN À...");
                            System.out.println("mời bạn nhập lại");
                            System.out.println("1: tạo Account");
                            System.out.println("2: tạo Department");
                            System.out.println("3: thêm Account có sẵn vào Group chỉ định");
                            System.out.println("4: thêm Account có sẵn vào Group ngẫu nhiên");
                            break;
                    }
            }
        }
        while (true);


    }


    public static void main(String[] args) {
//        question5();
//        question6();
//        question7();
//        question8();
//        question9();
//        question10();
//        question11 từ dòng 425


    }


}





