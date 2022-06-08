import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3460 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            while (n != 0) {
                if (n % 2 > 0)
                    System.out.print(count + " ");

                n = n / 2;
                count++;
            }
            System.out.println();
        }
    }
}
