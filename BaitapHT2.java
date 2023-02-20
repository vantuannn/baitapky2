import java.util.Scanner;

public class BaitapHT2 {

    //Bài 1 Cấu trúc của vòng lặp DO...WHILE
//    do {
//        statements(s);
//    } while (loop-continuation-condition);
//    trong đó:
//    statement(s): Các câu lệnh được thực thi trong mỗi lần lặp
//    loop-continuation-condition: Biểu thức điều kiện. Nếu biểu thức điều
//    kiện trả về giá trị true thì vòng lặp sẽ tiếp tục thực thi. Nếu biểu thức
//    điều kiện trả về false thì vòng lặp kết thúc

    // Bài 2 Khi thực hiện vòng lặp do...while ta cần chú ý gì ?
   // Khi thực hiện vòng lặp ta cần chú ý: điều kiện trong câu lệnh phải được thay đổi để giá trị của điều kiện được chuyển từ đúng sang sai. Chỉ như thế chương trình mới không "rơi" vào những "vòng lặp vô tận".

    //Bài 3 Kết quả của đoạn mã sau đây hiển thị gì? Giải thích tại sao lại hiển thị kết quả như vậy?
    public static void main(String[] args) {
        int  number = 5 ;
        do {
            System.out.println("Hello");
            number++;
        }while (number == 5);
    }
    // Khi viết đoạn mã trên hiển thị ra kết quả :"Hello"
    //Bài hiển thị kết quả như vậy vì do vòng lặp Do-while chạy ít nhất 1 song song xét điều kiện while bên dưới. Điều kiện while không thỏa mãn thì vòng kết thúc

    //Bài 4 số nguyên tố là số như thế nào ?
//    Số nguyên tố hay còn gọi là hợp số, đây là tập hợp số tự nhiên chỉ chia hết cho 1 và chính nó

    // Bài 5 Cách để kiểm tra xem 1 số bất kỳ có phải số nguyên tố hay không?
//lấy một bất kì tìm ước chung của nó, Nếu ước chung của nó bằng 1 hoặc là chính nó thì là số nguyên tố ( Phải thuộc bảng cửu chương mới tìm được )

    //Bài 6 Nhập vào từ bàn phím 1 số bất kỳ => in ra xem số đó có phải số nguyên tố hay không?
//    Bước 1 : Khai báo một số bất kì
//    Bước 2 : Viết lệnh để kiểm tra một số i , xét điều kiện nếu số i <2 thì nó không phải số nguyên tố
//    Bước 3 : Viết lệnh lặp từ 2 tới n
//    Bước 4 : Thêm boolean check để khi ta in ra nếu đúng là số nguyên tố sẽ trả về true còn nếu không phải số nguyên tố sẽ trả về false

    //Bài 7 Viết chương trình nhập vào từ bàn phím 1 số bất kỳ => in ra xem số đó có phải số nguyên tố hay không?
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so bat ki:");
        int number = scanner.nextInt();
        if (number <=2){
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            int i =2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là số nguyên tố");
            else
                System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
