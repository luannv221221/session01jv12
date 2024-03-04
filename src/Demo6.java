import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character;
        System.out.println("Mời nhập vào ký tự bất ký ");
        character = scanner.nextLine();
        switch (character) {
            case "u", "e", "o", "i", "a":
                System.out.println(character+" là nguyên âm");
                break;
            default:
                System.out.println(character+" la phụ âm");
        }
    }
}
