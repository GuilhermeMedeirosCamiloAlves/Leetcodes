import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        long inp = scanner.nextInt();
        while (inp != 1) {
            if (inp % 2 == 0) {
                System.out.printf("%d ", inp);
                inp = inp / 2;
            } else {
                System.out.printf("%d ", inp);
                inp = (inp * 3) + 1;
            }
        }
        System.out.printf("%d", inp);
    }
}
//read the problem in: https://cses.fi/problemset/task/1068/
//see the results in: https://cses.fi/problemset/result/17362286/