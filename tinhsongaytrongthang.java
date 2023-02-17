import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ban muon xem thang may? ");
        int month = scanner.nextInt();
            switch (month){
            case 1:
                System.out.println(("thang '1" + month + "' co 31 ngay!"));
                break;
            case 2:
                System.out.println(("thang '2" + month + "' co 28 hoac 29 ngay!"));
                break;
            case 3:
                System.out.println(("thang '3" + month + "' co 31 ngay!"));
                break;
            case 4:
                System.out.println(("thang '4" + month + "' co 30 ngay!"));
                break;
            case 5:
                System.out.println(("thang '5" + month + "' co 31 ngay!"));
                break;
            case 6:
                System.out.println(("thang '6" + month + "' co 30ngay!"));
                break;
            case 7:
                System.out.println(("thang '7" + month + "' co 31 ngay!"));
                break;
            case 8:
                System.out.println(("thang '8" + month + "' co 31 ngay!"));
                break;
            case 9:
                System.out.println(("thang '9" + month + "' co 30 ngay!"));
                break;
            case 10:
                System.out.println(("thang '10"+ month + "' co 31ngay!"));
                break;
            case 11:
                System.out.println(("thang '11"+ month + "' co 30 ngay!"));
                break;
            case 12:
                System.out.println(("thang '12"+ month + "' co 31 ngay!"));
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }        }
    }

