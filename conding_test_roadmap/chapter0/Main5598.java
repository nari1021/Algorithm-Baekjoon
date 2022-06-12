import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5598 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) > 67)
                System.out.print((char) ((int) str.charAt(i) - 3));
            else
                System.out.print((char) ((int) str.charAt(i) + 23));
        }
    }
}
