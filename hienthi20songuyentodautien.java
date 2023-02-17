public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        int number = 5;
        int count = 2;
        System.out.println("2 ,3");

        for (; count < 20; number ++){
            boolean prime = true;
            for (int i = 3;i < number; i++){
                if (number%i == 0){
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count ++;
                System.out.println("Các số nguyên tố sau " + count +  " là: " + number);
            }
        }
    }
}