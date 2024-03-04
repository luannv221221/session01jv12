public class Demo4 {
    public static void main(String[] args) {
        int age = 66;

        // kiểm tra tuổi nếu lớn hơn 18 thì cho xem phim konoon thì kết thúc chương trình
        if (age >= 18) {
            if(age > 65){
                System.out.println("Moi xem thời sự");
            } else {
                System.out.println("Moi bạn xem ozawa");
            }
        } else if(age > 16) {
            System.out.println("Mời bạn xem Doraemon");
        } else {
            System.out.println("Xem Thơ Nguyễn");
        }

    }
}
