import java.io.*;
import java.util.*;

public class Main10093 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A < B) {
            bw.write((B-A-1) + "\n");
            for (long i = A + 1; i < B; i++) {
                bw.write(i + " ");
            }
        }
        else if (A > B) {
            bw.write((A-B-1) + "\n");
            for(long i = B + 1; i < A; i++) {
                bw.write(i + " ");
            }
        }
        else
            bw.write("0");
        bw.flush(); bw.close();
    }
}