
import java.util.Calendar;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //khai báo biến String lưu tên người nhập từ bản phím
        String fullName;
        int age;
        String address;
        boolean sex;
        System.out.println("Mời bạn nhập vào họ tên ");
        fullName = scanner.nextLine();
        System.out.println("Moi bạn nhập vào tuổi");
//        age = scanner.nextInt();
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap vao dia chi ");
        address = scanner.nextLine();
        System.out.println("Moi bạn nhập vào giưới tinh (true(Đực)/fasle(Cái))");
        sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("===THÔNG TIN CỦA BAN===");
        System.out.println("Họ và tên : "+fullName);
        System.out.println("Năm sinh : "+(Calendar.getInstance().get(Calendar.YEAR) -age));
        System.out.println("Giới tính : "+(sex ? "Nam" : "Nữ"));
    }
}
