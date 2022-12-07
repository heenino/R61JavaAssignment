public class Execise01 {
    public static void main(String[] args) {
        question01();
    }

    public static void question01() {
        Department department = new Department();
        System.out.println("department = " + department);
        Department department1 = new Department(department.id, "bbb");
        System.out.println("dep1 :" + department1);
    }
    public static void question02(){
        Account account = new Account();
        Account account1 = new Account(1,"h@gmailcom","hhahah","tran","phihung");
    }


}
