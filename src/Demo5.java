import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Mời bạn nhập số từ 2 - 8");
        num = Integer.parseInt(scanner.nextLine());
        switch (num){
            case 2:
                System.out.println("Hôm nay thứ hai");
                break;
            case 3:
                System.out.println("Hôm nay là thứ ba");
                break;
            case 4:
                System.out.println("Hôm nay là thứ tư");
                break;
            case 7:
                System.out.println("Hôm nay là thứ 7 em sexsy sexy vào bar");
                break;
            case 8:
                System.out.println("Hom nay la chu nhat");
                break;
            default:
                System.out.println("Chịu thôi không biết đâu");
        }
    }
}
