
import java.util.Scanner;

public class BaitapHT7 {
    // Bai 1 Khai báo 1 mảng gôm 10 phần tử và nhập giá trị lần lượt cho 10 phần tử vừa tạo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Nhập các phần tử trong mảng: \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử mảng: " + i + " = ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        show(array);
        sum(array);
        sum2(array);
        tich(array);

    }

    //    Bai 2 Hãy viết hàm tính tổng các phần tử thứ 1 3 5 7 9 trong mảng vừa tạo.
    private static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sum(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }
        System.out.println("Kết quả là : " + sum);
    }

    // Bài 3 Hãy viết hàm tính tổng các phần tử thứ 1 3 7 9 trong mảng vừa tạo
    public static void sum2(int[] array) {
        int sum2 = 0;
        for (int i = 1; i < array.length; i += 2) {
            if (i == 5) {
                continue;
            }
            sum2 += array[i];
        }
        System.out.println("ket qua la bai 3 :" + sum2);
    }

    //    bài 4 Hãy viết hàm tính tích của phần tử 2, 4 và 9 của phần tử vừa tạo
    public static void tich(int[] array) {
        int tich = 2;
        for (int i = 2; i < array.length; i += 2) {
            if (i == 2 || i == 4 || i == 9) {
                tich *= array[i];
            }
        }
        System.out.println("ket qua tich 2 4 9 :" + tich);
    }
}

