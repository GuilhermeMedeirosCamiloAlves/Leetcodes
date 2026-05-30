import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        long sum =0;
        long inp = scanner.nextLong();
        for(long i=0;inp-1>i;i++){
            long x = scanner.nextLong();
            sum = sum+x;
        }
        System.out.printf("%d", inp*(inp+1)/2-sum);
        }
}
//read the problem in: https://cses.fi/problemset/task/1083
//see the results in: https://cses.fi/problemset/result/17362811/