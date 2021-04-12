import java.io.*;

public class Main2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int index = 0;
        int N = Integer.parseInt(br.readLine());
        while (index < N) {
            for(int i = 0; i < index; i++)
                bw.write(" ");
            for(int i = 1; i < 2 * (N - index); i++)
                bw.write("*");
            bw.newLine();
            index++;
        }
        br.close(); bw.flush(); bw.close();
    }
}