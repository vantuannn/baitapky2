public class baitaphotro {
    //bai1 Khi nào dùng for khi nào dùng while?
    //Vòng lặp for trong java được sử dụng để lặp một phần của chương trình nhiều lần. Nếu số lần lặp là cố định thì vong lặp for được khuyến khích sử dụng, còn nếu số lần lặp không cố định thì nên sử dụng vòng lặp while hoặc do while.khởi tạo biến

//   bai2 Sử dụng vòng lặp for in ra các số lẻ từ 0-10, trừ số 3 và số 7
    public static void main(String[] args) {
        int i;
        for (i = 0;i < 10;i++){
            if (i%2 == 1);
            if (i != 3 && i!= 7){
                System.out.println(i);
            }
        }
    }
}

//    bai 4  Sử dụng vòng lặp while in ra các số từ 1 - 10
    public static void main(String[] args) {
        int i=1;

        while (i <=10){
            System.out.println(i);
            i++;
        }

    }

}

//    bai 3 Sử dụng vòng lặp for in ra các số chẵn từ 0-10, trừ số 4
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                if (i != 4) {
                    System.out.println(i);
                }
            }
        }
    }
}

//    bai5 Sử dụng vòng lặp while in ra các số lẻ từ 1- 10
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
           if (i % 2 == 1) {
             System.out.println(i);
           }
            i ++;
       }
    }
}

 //bai 6 Để tạo được 1 vòng lặp for cần xác định các yếu tố gì?
 //khởi tạo biến, kiểm tra điều kiện và tăng/giảm giá trị của biến.