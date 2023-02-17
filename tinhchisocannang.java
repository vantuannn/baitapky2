import java.util.Scanner;

public class tinhchisocannang {
    public static void main(String[] args) {
        Scanner      scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhap so can nang (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("nhap chieu cao (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "gay");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "binh thuong ");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "thua can");
        else
            System.out.printf("%-20.2f%s", bmi, "beophi");
    }
    }

