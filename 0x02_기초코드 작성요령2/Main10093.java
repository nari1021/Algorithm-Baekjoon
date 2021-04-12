import java.io.*;
import java.util.*;

public class Main10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A < B) {
            bw.write((B-A-1) + "\n");
            for (long i = A + 1; i < B; i++) {
                bw.write(i + " ");
            }
        }
        else if (A > B) {
            System.out.println((A-B-1) + "\n");
            for(long i = B + 1; i < A; i++) {
                System.out.println(i + " ");
            }
        }
        else
            bw.write("0");

        br.close(); bw.flush(); bw.close();
    }
}
