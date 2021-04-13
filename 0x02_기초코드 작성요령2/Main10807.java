import java.io.*;
import java.util.*;

public class Main10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(st.hasMoreTokens()){
            if (Integer.parseInt(st.nextToken()) == v)
                cnt++;
        }
        bw.write(cnt + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
