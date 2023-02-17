import java.util.Scanner;

public class timuocsochunglonnhat {
    public static void main(String[] args) {
        int i;
        int o;
        Scanner input = new Scanner(System.in);
        System.out.println("enter i");
        i = input.nextInt();
        System.out.println("enter o");
        o = input.nextInt();
        i = Math.abs(i);
        o = Math.abs(o);
        if (i == 0 || o == 0) {
            System.out.println("Khong co uoc chung lon nhat");
            while (i != o) {
                if (i > o)
                    i = i - o;
                else
                    o = o - i;
                System.out.println("uoc chung lon nhat: " + i);
            }
        }
    }
}
