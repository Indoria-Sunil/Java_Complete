import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Password Checker\n");
        String pass;
        do {
            System.out.print("Please enter your passsword: ");
            pass = input.next();
        } while (!passwordChecker(pass));
        System.out.println("Thanks for entering valid password!");
    }

    public static boolean passwordChecker(String pass) {
        return pass.length() > 6;
    }
}
