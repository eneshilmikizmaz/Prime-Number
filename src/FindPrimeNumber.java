import java.util.Scanner;

public class FindPrimeNumber {
    public void find() {
        System.out.println("Bulmak istediğiniz aralığı giriniz. (1-..) : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.print(i + ", ");
        }
    }
}
