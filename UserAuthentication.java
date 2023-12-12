import java.util.Random;
import java.util.Scanner;

public class UserAuthentication {
    private Scanner scanner;
    private CaptchaManager captchaManager;

    public UserAuthentication() {
        this.scanner = new Scanner(System.in);
        this.captchaManager = new CaptchaManager();
    }

    public void login() {
        System.out.println("Log in");
        System.out.print("Username    : ");
        String username = scanner.nextLine();
        System.out.print("Password     : ");
        String password = scanner.nextLine();

        boolean captchaVerified = captchaManager.verifyCaptcha();

        if (captchaVerified) {
            System.out.println("------------------------------");
            System.out.println("");
            System.out.println("Selamat Datang User IndoAlfaMaret");
        } else {
            System.out.println("Maaf Login User gagal, Silakan coba lagi nanti");
        }
    }
}
