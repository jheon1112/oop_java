import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        num = scanner.nextInt();

        int[] numArray = new int[num];
        System.out.print("수를 입력하세요 : ");
        for (int i=0; i<num; i++){
            numArray[i] = scanner.nextInt();
        }

        int max = numArray[0];
        int min = numArray[0];

        for (int i=1; i<num; i++){
            if (max < numArray[i]){
                max = numArray[i];
            }
        }
        for (int i=1; i<num; i++){
            if (min > numArray[i]){
                min = numArray[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
