//import javax.imageio.stream.ImageInputStream;
//import java.util.Scanner;
//
//public class BaitapHT3 {
//    //Bài 1 Các cách để khai báo mảng là :
//    // Chúng ta có 2 cách để khai báo mảng là khai báo mảng 1 chiều và mảng 2 chiều
//
//    //Bài 2 Khai báo 1 mảng số nguyên gồm 10 phần tử
//    public static void main(String[] args) {
//        int[] arrays ={1,2,3,4,5,6,7,8,9,0};
//    }
//
////    Bài 3 Duyệt mảng số nguyên 10 phần tử bằng vòng lặp for và foreach
////    Vòng lặp for
//    public static void main(String[] args) {
//        int[] number = {1, 2,3,4,5,6,7,8,9,0};
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i]);
//       }
//   }
////    Vòng lặp foreach
//    public static void main(String[] args) {
//        int[] numbers  = { 1,2,3,4,5,6,7,8,9,0 };
//        for (int numbersArrays  : numbers) {
//            System.out.println(numbersArrays);
//        }
//    }
//}
//
//    //Bài 4 Khai báo 1 mảng chuỗi gồm 5 phần tử
//    public static void main(String[] args) {
//        String [] arrays={"Khanh","Tuan","Minh","Hoang","Duc"};
//    }
//
//    //Bài 5 Duyệt mảng số chuỗi 5 phần tử vừa tạo bằng vòng lặp for và foreach
//    //Vòng lặp for
//    public static void main(String[] args) {
//        String [] name={"Khanh","Tuan","Minh","Hoang","Duc"};
//        for(int i=0; i < name.length ; i++ ){
//            System.out.println(name[i]);
//        }
//   }
////    Vòng lặp foreach
//    public static void main(String[] args) {
//        String[] name = {"Khanh", "Tuan", "Minh", "Hoang", "Duc"};
//        for (String nameArrays : name) {
//            System.out.println(nameArrays);
//        }
//    }
//
//    //Bài 6 Khai báo 1 mảng rỗng gồm 7 phần tử
//    public static void main(String[] args) {
//        int size=7;
//        int []arrays;
//        arrays=new int[size];
//    }
//
//    //Bài 7Thêm giá trị cho 7 phần tử mảng rỗng vừa tạo
//    public static void main(String[] args) {
//        int[] numberArray = inputDatainarray();
//        showDataIn(numberArray);
//    }
//
//    private static int[] inputDatainarray() {
//        Scanner scanner = new Scanner(System.in);
//        int[] numberArray = new int[7];
//        for (int i = 0; i < numberArray.length; i++) {
//            System.out.println("Nhap gia tri cho mang" + (i + 1));
//            numberArray[i] = scanner.nextInt();
//        }
//        return numberArray;
//    }
//
//        private static void showDataIn(int[] numberArrays){
//            System.out.println("---------------------");
//            System.out.print("Gia tri cua mang la: ");
//            for (int number : numberArrays) {
//                System.out.print(number + " ");
//            }
//
//        }
//    }
//
//
//    //Bài 8 Viết cú pháp khai báo 1 hàm
////    modifier returnType nameOfMethod (Parameter List) {
////    // method body
////}
////        Modifiers: Tạm dịch là phạm vi sửa đổi và truy cập
////        returnType: Là kiểu dữ liệu trả về
////        nameOfMethod: Là tên của hàm (method)
////        Parameter là các tham số đầu vào của hàm (có thể có nhiều tham số với nhiều kiểu dữ liệu khác nhau)
////        method body: là các mã code bên trong hàm
//
//    //Bài 9
//    //Chuyển từ câu 3
//    public static void foreachDataInArrayWithForLoop(int[] inputArray) {
//        System.out.println("--------------- mang bang for--------");
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.println(inputArray[i]);
//        }
//    }
//
//    public  static void foreachDataInArrayForeachLoop(int[] inputArray){
//        System.out.println("--------------- mang bang foreach--------");
//        for (int number:inputArray
//             ) {
//            System.out.println(number);
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        foreachDataInArrayWithForLoop(arrayNumber);
//        foreachDataInArrayForeachLoop(arrayNumber);
//    }
////}
////    chuyển từ câu 5
//    public static void foreachDataInArrayWithForLoop(String[] inputArray) {
//        System.out.println("--------------- mang bang for--------");
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.println(inputArray[i]);
//        }
//    }
//        public  static void foreachDataInArrayForeachLoop(String[] inputArray) {
//            System.out.println("--------------- mang bang foreach--------");
//            for (String name : inputArray
//            ) {
//                System.out.println(name);
//            }
//        }
//
//     public static void main(String[] args) {
//         String[] arrayName = {"Khanh", "Tuan", "Minh", "Hoang", "Duc"};
//         foreachDataInArrayWithForLoop(arrayName);
//         foreachDataInArrayForeachLoop(arrayName);
//     }
//}
//
//
//
//
//
//
//
//
//
