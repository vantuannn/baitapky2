import java.util.Scanner;

public class TEST {
    //    bài 1:
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("các phần tử mảng là = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        show(arr);
        sum(arr);

    }

    private static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //    bài 2
    public static void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Kết quả là : " + sum);

        //   bài 3
    }
}