public class Demo1 {
    public static void main(String[] args) {
        int num = 19;
        System.out.println("giá trị biến num = "+num);
        System.out.println("OK");
        System.out.printf(" Giá trị biên num = %d",num);
        int age = 18;
        String fullName = "Nguyễn Văn A";
        boolean sex = true;
        System.out.println("Ho và tên :"+fullName+"Tuổi "+age+"giới tính"+(sex ? "Name" : "Nũ"));

        // in có định dạng
        System.out.printf("Họ và tên : %s Tuổi: %d Giới tính : %b \n",fullName,age,sex);
        // in có dịnh
        System.out.printf("\t\t Họ tên : %s",fullName);

    }
}
