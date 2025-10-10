import java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n){
        if (n == 0){
            return m;
        }
        if (m > n){
            return gcd(n, m % n);
        } else {
            return gcd(m, n % m);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        int n;
        System.out.print("두 수를 입력하세요: ");
        m = scanner.nextInt();
        n = scanner.nextInt();

        Homework4 hw4 = new Homework4();
        int result = hw4.gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result);
    }
}
