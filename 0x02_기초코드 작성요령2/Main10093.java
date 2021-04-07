import java.util.*;
import java.io.IOException;

public class Main10093 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        long B = sc.nextLong();

        if (A < B) {
            System.out.println((B-A-1) + "\n");
            for (long i = A + 1; i < B; i++) {
                System.out.println(i + " ");
            }
        }
        else if (A > B) {
            System.out.println((A-B-1) + "\n");
            for(long i = B + 1; i < A; i++) {
                System.out.println(i + " ");
            }
        }
        else
            System.out.println("0");
    }
}
