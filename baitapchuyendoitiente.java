import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class baitapchuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("moi ban nhap so tien usd");
        usd = scanner.nextDouble();
        double quydoi=usd * 23000;
        System.out.println("Gia tri vnd" + quydoi);

    }
}
