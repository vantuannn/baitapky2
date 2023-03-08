import java.util.Scanner;

public class baitaphotro4 {
        //    Bài 1 Viết chương trình cho phép nhập độ dài của mảng, sau đó sử dụng vòng lặp for để nhập giá trị cho từng phần tử của mảng và in ra các phần tử trong mảng.
        public static void main(String[] args) {
            System.out.print("Chiều dài của mảng: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int[] arrayNumber = new int[number];
            for (int i = 0; i < number; i++) {
                System.out.print("Các phần tử của mảng là :");
                arrayNumber[i] = scanner.nextInt();
            }
            show(arrayNumber);
            sum(arrayNumber);
            numbers(arrayNumber);
            numberS(arrayNumber);
        }
        //  Bài 2 Viết phương thức tính tổng các phần tử trong mảng vừa tạo ở câu 1
        private static void show(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        public static void sum(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Kết quả là : " + sum );
        }
        //  Bài 3:Viết chương trình cho phép nhập độ dài của mảng, tiếp theo viết 1 phương thức để duyệt mảng vừa tạo in ra kết quả các phần tử của mảng bằng vòng lặp foreach.
        private static void numbers (int[] inputArray) {
            System.out.println("Mảng duyệt là: ");
            for (int number : inputArray
            ) {
                System.out.println(number);
            }
        }
        //  Bài 4Viết chương trình cho phép nhập độ dài của mảng, sau đó viết phương thức tìm giá trị lớn nhất trong mảng vừa tạo và in kết quả giá trị lớn nhất ra màn hình.
        public static void numberS(int [] arrayNumber) {

            int max = 0;
            for (int num : arrayNumber ) {
                if (num > max) {
                    max = num;

                }
            }
            System.out.print(" Phần từ lớn nhất : " + max);
        }
    }






