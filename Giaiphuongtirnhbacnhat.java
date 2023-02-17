import java.util.Scanner;

public class Giaiphuongtirnhbacnhat {
    public static void main(String[] args) {
        System.out.println("Phuong trinh");
        System.out.println("cho mot phuong trinh 'a * x +b = c',hay nhap hang so:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("phuong trinh voi x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("dap an la x!");
            } else {
                System.out.print("Khong co dap an!");
            }
        }
    }
}


