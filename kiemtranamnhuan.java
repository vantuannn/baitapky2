import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap so nam: ");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d day la nam nhuan", year);
                } else {
                    System.out.printf("%d khong phai nam nhuan", year);
                }
            } else {
                System.out.printf("%d day la nam nhuan", year);
            }
        } else {
            System.out.printf("%d khong phai nam nhuan", year);
        }
    }
}


