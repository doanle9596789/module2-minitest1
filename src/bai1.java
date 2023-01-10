import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scanner.nextInt();
        int songuyennto = prinnsonguyento(n);
        if (n < 2) {
            System.out.println("no primes less than 2");
        } else {

            System.out.println(songuyennto);
        }
    }
    public static int prinnsonguyento(int n) {
        int check = 2;
        while (check < n) {
            int sqr = (int) Math.sqrt(check);
            boolean ok = true;
            for (int i = 2; i <= sqr; i++) {
                if (check % i == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println(check);
            }
            check++;
        }return n;
    }
}

